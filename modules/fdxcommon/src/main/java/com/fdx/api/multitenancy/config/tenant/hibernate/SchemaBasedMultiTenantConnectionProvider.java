package com.fdx.api.multitenancy.config.tenant.hibernate;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.engine.jdbc.connections.spi.MultiTenantConnectionProvider;
import org.hibernate.service.UnknownUnwrapTypeException;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * A specialized Connection provider contract used when the application is using
 * multi-tenancy support requiring tenant aware connections.
 */
@RequiredArgsConstructor
@Slf4j
@Component
public class SchemaBasedMultiTenantConnectionProvider implements MultiTenantConnectionProvider {

  private final DataSource datasource;

  /**
   * Allows access to the database metadata of the underlying database(s) in
   * situations where we do not have a tenant id (like startup processing, for example)
   *
   * @return The database metadata.
   * @throws SQLException Indicates a problem opening a connection
   */
  @Override
  public Connection getAnyConnection() throws SQLException {
    return datasource.getConnection();
  }

  /**
   * Release a connection obtained from getAnyConnection
   *
   * @param connection The JDBC connection to release
   * @throws SQLException Indicates a problem closing the connection
   */
  @Override
  public void releaseAnyConnection(Connection connection) throws SQLException {
    connection.close();
  }

  /**
   * Obtains a connection for Hibernate use according to the underlying strategy of this provider.
   *
   * @param developerIdentifier The identifier of the tenant for which to get a connection
   *
   * @return The obtained JDBC connection
   * @throws SQLException Indicates a problem opening a connection
   */
  @Override
  public Connection getConnection(String developerIdentifier) throws SQLException {
    log.info("Get connection for schema {}", developerIdentifier);
    final Connection connection = getAnyConnection();
    connection.setSchema(developerIdentifier);
    return connection;
  }

  /**
   * Release a connection from Hibernate use.
   *
   * @param developerIdentifier The identifier of the tenant.
   *
   * @param connection The JDBC connection to release
   * @throws SQLException Indicates a problem closing the connection
   */
  @Override
  public void releaseConnection(String developerIdentifier, Connection connection) throws SQLException {
    log.info("Release connection for schema {}", developerIdentifier);
    connection.setSchema(null);
    releaseAnyConnection(connection);
  }

  /**
   * This connection provider does not support aggressive release of JDBC connections
   * @return true if aggressive releasing is supported; false otherwise
   */
  @Override
  public boolean supportsAggressiveRelease() {
    return false;
  }

  /**
   * This wrapped service be unwrapped as the indicated type
   *
   * @param unwrapType The type to check.
   *
   * @return True/false.
   */
  @Override
  public boolean isUnwrappableAs(Class unwrapType) {
    return MultiTenantConnectionProvider.class.isAssignableFrom(unwrapType);
  }

  /**
   * Unproxy the service proxy
   *
   * @param unwrapType The java type as which to unwrap this instance.
   *
   * @return The unwrapped reference
   * @param <T> unwrapType – The java type as which to unwrap this instance.
   */
  @Override
  public <T> T unwrap(Class<T> unwrapType) {
    if (MultiTenantConnectionProvider.class.isAssignableFrom(unwrapType)) {
      return (T) this;
    } else {
      throw new UnknownUnwrapTypeException(unwrapType);
    }
  }
}
