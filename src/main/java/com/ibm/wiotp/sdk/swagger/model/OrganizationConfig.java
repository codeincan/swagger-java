/*
 * IBM Watson IoT Platform Organization Administration REST APIs
 * The Organization Adminstration APIs can be used to configure an organization (including  creating and deleting devices), checking usage, service status and diagnosing device  connection problems. For information on this API, and how to use Watson IoT Platform APIs generally see  [the API documentation](https://console.ng.bluemix.net/docs/services/IoT/reference/api.html). 
 *
 * OpenAPI spec version: 0002
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ibm.wiotp.sdk.swagger.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.wiotp.sdk.swagger.model.HistorianConfig;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Overall configuration of the organization.
 */
@ApiModel(description = "Overall configuration of the organization.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-30T18:06:21.121+01:00")
public class OrganizationConfig {
  @SerializedName("historian")
  private HistorianConfig historian = null;

  public OrganizationConfig historian(HistorianConfig historian) {
    this.historian = historian;
    return this;
  }

   /**
   * Get historian
   * @return historian
  **/
  @ApiModelProperty(required = true, value = "")
  public HistorianConfig getHistorian() {
    return historian;
  }

  public void setHistorian(HistorianConfig historian) {
    this.historian = historian;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationConfig organizationConfig = (OrganizationConfig) o;
    return Objects.equals(this.historian, organizationConfig.historian);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historian);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationConfig {\n");
    
    sb.append("    historian: ").append(toIndentedString(historian)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
