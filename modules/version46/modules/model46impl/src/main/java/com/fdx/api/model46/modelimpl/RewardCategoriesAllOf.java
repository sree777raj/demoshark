package com.fdx.api.model46.modelimpl;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * RewardCategoriesAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class RewardCategoriesAllOf   {
  @JsonProperty("rewardPrograms")
  @Valid
  private Set<RewardCategory> rewardPrograms = null;

  public RewardCategoriesAllOf rewardPrograms(Set<RewardCategory> rewardPrograms) {
    this.rewardPrograms = rewardPrograms;
    return this;
  }

  public RewardCategoriesAllOf addRewardProgramsItem(RewardCategory rewardProgramsItem) {
    if (this.rewardPrograms == null) {
      this.rewardPrograms = new LinkedHashSet<>();
    }
    this.rewardPrograms.add(rewardProgramsItem);
    return this;
  }

  /**
   * Array of reward categories
   * @return rewardPrograms
  */
  @ApiModelProperty(value = "Array of reward categories")

  @Valid

  public Set<RewardCategory> getRewardPrograms() {
    return rewardPrograms;
  }

  public void setRewardPrograms(Set<RewardCategory> rewardPrograms) {
    this.rewardPrograms = rewardPrograms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewardCategoriesAllOf rewardCategoriesAllOf = (RewardCategoriesAllOf) o;
    return Objects.equals(this.rewardPrograms, rewardCategoriesAllOf.rewardPrograms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rewardPrograms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardCategoriesAllOf {\n");
    
    sb.append("    rewardPrograms: ").append(toIndentedString(rewardPrograms)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

