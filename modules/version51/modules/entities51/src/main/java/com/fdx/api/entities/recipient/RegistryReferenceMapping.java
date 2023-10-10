package com.fdx.api.entities.recipient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Type;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "registry_reference_mapping")
public class RegistryReferenceMapping {

  @Id
  @GeneratedValue
  @JsonIgnore
  @Type(type="org.hibernate.type.UUIDCharType")
  private UUID id;

  @OneToMany(mappedBy = "registryReferenceMapping", cascade = CascadeType.ALL
      , orphanRemoval = true)
  @Valid
  @JsonIgnore
  private Set<RegistryReference> registryReferences = new HashSet<>();

  @Valid
  public void setRegistryReferences(Set<RegistryReference> registryReferences) {
    this.registryReferences = registryReferences;
  }

  @Valid
  public Set<RegistryReference> getRegistryReferences() {
    return registryReferences;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

}