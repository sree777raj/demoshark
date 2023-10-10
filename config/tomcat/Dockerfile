FROM tomcat:9.0.46-jdk11-openjdk
COPY config/tomcat/server.xml /usr/local/tomcat/conf/server.xml
COPY target/fdxapi##hosted-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/
COPY fdx-ri-tdm/target/adminui##hosted-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/
COPY fdx-ri-auth-server/target/fdxriauthserver.war /usr/local/tomcat/webapps/
COPY fdx-ri-auth-client/target/fdxriauthclient.war /usr/local/tomcat/webapps/
