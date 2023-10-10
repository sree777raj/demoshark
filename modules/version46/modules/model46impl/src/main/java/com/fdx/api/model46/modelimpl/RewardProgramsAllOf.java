package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * RewardProgramsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class RewardProgramsAllOf   {
  @JsonProperty("rewardPrograms")
  @Valid
  private List<RewardProgram> rewardPrograms = null;

  public RewardProgramsAllOf rewardPrograms(List<RewardProgram> rewardPrograms) {
    this.rewardPrograms = rewardPrograms;
    return this;
  }

  public RewardProgramsAllOf addRewardProgramsItem(RewardProgram rewardProgramsItem) {
    if (this.rewardPrograms == null) {
      this.rewardPrograms = new ArrayList<>();
    }
    this.rewardPrograms.add(rewardProgramsItem);
    return this;
  }

  /**
   * Array of reward programs
   * @return rewardPrograms
  */
  @ApiModelProperty(value = "Array of reward programs")

  @Valid

  public List<RewardProgram> getRewardPrograms() {
    return rewardPrograms;
  }

  public void setRewardPrograms(List<RewardProgram> rewardPrograms) {
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
    RewardProgramsAllOf rewardProgramsAllOf = (RewardProgramsAllOf) o;
    return Objects.equals(this.rewardPrograms, rewardProgramsAllOf.rewardPrograms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rewardPrograms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardProgramsAllOf {\n");
    
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

