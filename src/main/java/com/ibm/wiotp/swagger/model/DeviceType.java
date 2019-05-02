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
import com.ibm.wiotp.swagger.model.DeviceInfo;
import com.ibm.wiotp.swagger.model.Metadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeviceType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-30T18:06:21.121+01:00")
public class DeviceType {
  @SerializedName("id")
  private String id = null;

  @SerializedName("description")
  private String description = null;

  /**
   * Gets or Sets classId
   */
  @JsonAdapter(ClassIdEnum.Adapter.class)
  public enum ClassIdEnum {
    DEVICE("Device"),
    
    GATEWAY("Gateway");

    private String value;

    ClassIdEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClassIdEnum fromValue(String text) {
      for (ClassIdEnum b : ClassIdEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ClassIdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClassIdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClassIdEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ClassIdEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("classId")
  private ClassIdEnum classId = null;

  @SerializedName("deviceInfo")
  private DeviceInfo deviceInfo = null;

  @SerializedName("metadata")
  private Metadata metadata = null;

  public DeviceType id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DeviceType description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the device type
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of the device type")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DeviceType classId(ClassIdEnum classId) {
    this.classId = classId;
    return this;
  }

   /**
   * Get classId
   * @return classId
  **/
  @ApiModelProperty(required = true, value = "")
  public ClassIdEnum getClassId() {
    return classId;
  }

  public void setClassId(ClassIdEnum classId) {
    this.classId = classId;
  }

  public DeviceType deviceInfo(DeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
    return this;
  }

   /**
   * Get deviceInfo
   * @return deviceInfo
  **/
  @ApiModelProperty(value = "")
  public DeviceInfo getDeviceInfo() {
    return deviceInfo;
  }

  public void setDeviceInfo(DeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
  }

  public DeviceType metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(required = true, value = "")
  public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceType deviceType = (DeviceType) o;
    return Objects.equals(this.id, deviceType.id) &&
        Objects.equals(this.description, deviceType.description) &&
        Objects.equals(this.classId, deviceType.classId) &&
        Objects.equals(this.deviceInfo, deviceType.deviceInfo) &&
        Objects.equals(this.metadata, deviceType.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, classId, deviceInfo, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    classId: ").append(toIndentedString(classId)).append("\n");
    sb.append("    deviceInfo: ").append(toIndentedString(deviceInfo)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

