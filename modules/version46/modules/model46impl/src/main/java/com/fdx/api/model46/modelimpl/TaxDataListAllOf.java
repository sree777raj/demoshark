package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * TaxDataListAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class TaxDataListAllOf   {
  @JsonProperty("forms")
  @Valid
  private List<TaxData> forms = null;

  public TaxDataListAllOf forms(List<TaxData> forms) {
    this.forms = forms;
    return this;
  }

  public TaxDataListAllOf addFormsItem(TaxData formsItem) {
    if (this.forms == null) {
      this.forms = new ArrayList<>();
    }
    this.forms.add(formsItem);
    return this;
  }

  /**
   * The list of tax forms
   * @return forms
  */
  @ApiModelProperty(value = "The list of tax forms")

  @Valid

  public List<TaxData> getForms() {
    return forms;
  }

  public void setForms(List<TaxData> forms) {
    this.forms = forms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxDataListAllOf taxDataListAllOf = (TaxDataListAllOf) o;
    return Objects.equals(this.forms, taxDataListAllOf.forms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxDataListAllOf {\n");
    
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
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

