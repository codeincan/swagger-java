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
import com.ibm.wiotp.swagger.model.DeviceExtensionRefs;
import com.ibm.wiotp.swagger.model.DeviceInfo;
import com.ibm.wiotp.swagger.model.DeviceRegistration;
import com.ibm.wiotp.swagger.model.DeviceStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeviceConcise
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-30T18:06:21.121+01:00")
public class DeviceConcise {
  @SerializedName("id")
  private String id = null;

  @SerializedName("typeId")
  private String typeId = null;

  @SerializedName("deviceId")
  private String deviceId = null;

  @SerializedName("deviceInfo")
  private DeviceInfo deviceInfo = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("registration")
  private DeviceRegistration registration = null;

  @SerializedName("status")
  private DeviceStatus status = null;

  @SerializedName("refs")
  private DeviceExtensionRefs refs = null;

  public DeviceConcise id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Globally unique identifier for this device.  For use as a protocol client ID
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Globally unique identifier for this device.  For use as a protocol client ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DeviceConcise typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  public DeviceConcise deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public DeviceConcise deviceInfo(DeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
    return this;
  }

   /**
   * Get deviceInfo
   * @return deviceInfo
  **/
  @ApiModelProperty(required = true, value = "")
  public DeviceInfo getDeviceInfo() {
    return deviceInfo;
  }

  public void setDeviceInfo(DeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
  }

  public DeviceConcise metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Free-form metadata
   * @return metadata
  **/
  @ApiModelProperty(required = true, value = "Free-form metadata")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public DeviceConcise registration(DeviceRegistration registration) {
    this.registration = registration;
    return this;
  }

   /**
   * Get registration
   * @return registration
  **/
  @ApiModelProperty(required = true, value = "")
  public DeviceRegistration getRegistration() {
    return registration;
  }

  public void setRegistration(DeviceRegistration registration) {
    this.registration = registration;
  }

  public DeviceConcise status(DeviceStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public DeviceStatus getStatus() {
    return status;
  }

  public void setStatus(DeviceStatus status) {
    this.status = status;
  }

  public DeviceConcise refs(DeviceExtensionRefs refs) {
    this.refs = refs;
    return this;
  }

   /**
   * Get refs
   * @return refs
  **/
  @ApiModelProperty(required = true, value = "")
  public DeviceExtensionRefs getRefs() {
    return refs;
  }

  public void setRefs(DeviceExtensionRefs refs) {
    this.refs = refs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceConcise deviceConcise = (DeviceConcise) o;
    return Objects.equals(this.id, deviceConcise.id) &&
        Objects.equals(this.typeId, deviceConcise.typeId) &&
        Objects.equals(this.deviceId, deviceConcise.deviceId) &&
        Objects.equals(this.deviceInfo, deviceConcise.deviceInfo) &&
        Objects.equals(this.metadata, deviceConcise.metadata) &&
        Objects.equals(this.registration, deviceConcise.registration) &&
        Objects.equals(this.status, deviceConcise.status) &&
        Objects.equals(this.refs, deviceConcise.refs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, typeId, deviceId, deviceInfo, metadata, registration, status, refs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceConcise {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    deviceInfo: ").append(toIndentedString(deviceInfo)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    registration: ").append(toIndentedString(registration)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    refs: ").append(toIndentedString(refs)).append("\n");
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

