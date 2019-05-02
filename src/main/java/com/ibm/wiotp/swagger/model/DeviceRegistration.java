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


package com.ibm.wiotp.swagger.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.wiotp.swagger.model.DeviceRegistrationAuth;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * DeviceRegistration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-30T18:06:21.121+01:00")
public class DeviceRegistration {
  @SerializedName("auth")
  private DeviceRegistrationAuth auth = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  public DeviceRegistration auth(DeviceRegistrationAuth auth) {
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @ApiModelProperty(required = true, value = "")
  public DeviceRegistrationAuth getAuth() {
    return auth;
  }

  public void setAuth(DeviceRegistrationAuth auth) {
    this.auth = auth;
  }

  public DeviceRegistration date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Date and time that the device was added (ISO8601)
   * @return date
  **/
  @ApiModelProperty(required = true, value = "Date and time that the device was added (ISO8601)")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceRegistration deviceRegistration = (DeviceRegistration) o;
    return Objects.equals(this.auth, deviceRegistration.auth) &&
        Objects.equals(this.date, deviceRegistration.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, date);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceRegistration {\n");
    
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
