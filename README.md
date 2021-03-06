# com.ibm.wiotp.sdk.swagger

IBM Watson IoT Platform Organization Administration REST APIs
- API version: 0002
  - Build date: 2019-04-30T18:06:21.121+01:00

The Organization Adminstration APIs can be used to configure an organization (including  creating and deleting devices), checking usage, service status and diagnosing device  connection problems. For information on this API, and how to use Watson IoT Platform APIs generally see  [the API documentation](https://console.ng.bluemix.net/docs/services/IoT/reference/api.html). 


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.ibm.wiotp.sdk</groupId>
  <artifactId>com.ibm.wiotp.sdk.swagger</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.ibm.wiotp.sdk:com.ibm.wiotp.sdk.swagger:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/com.ibm.wiotp.sdk.swagger-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.ibm.wiotp.swagger.*;
import com.ibm.wiotp.swagger.auth.*;
import com.ibm.wiotp.swagger.model.*;
import com.ibm.wiotp.swagger.api.DeviceBulkConfigurationApi;

import java.io.File;
import java.util.*;

public class DeviceBulkConfigurationApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization: ApiKey
        HttpBasicAuth ApiKey = (HttpBasicAuth) defaultClient.getAuthentication("ApiKey");
        ApiKey.setUsername("YOUR USERNAME");
        ApiKey.setPassword("YOUR PASSWORD");

        DeviceBulkConfigurationApi apiInstance = new DeviceBulkConfigurationApi();
        DeviceBulkRegistrationRequestList devices = new DeviceBulkRegistrationRequestList(); // DeviceBulkRegistrationRequestList | Devices to be registered
        try {
            DeviceWithPasswordList result = apiInstance.bulkDevicesAddPost(devices);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceBulkConfigurationApi#bulkDevicesAddPost");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/api/v0002*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DeviceBulkConfigurationApi* | [**bulkDevicesAddPost**](docs/DeviceBulkConfigurationApi.md#bulkDevicesAddPost) | **POST** /bulk/devices/add | Register multiple new devices
*DeviceBulkConfigurationApi* | [**bulkDevicesGet**](docs/DeviceBulkConfigurationApi.md#bulkDevicesGet) | **GET** /bulk/devices | List devices
*DeviceBulkConfigurationApi* | [**bulkDevicesRemovePost**](docs/DeviceBulkConfigurationApi.md#bulkDevicesRemovePost) | **POST** /bulk/devices/remove | Delete multiple devices
*DeviceConfigurationApi* | [**deviceTypesTypeIdDevicesDeviceIdDelete**](docs/DeviceConfigurationApi.md#deviceTypesTypeIdDevicesDeviceIdDelete) | **DELETE** /device/types/{typeId}/devices/{deviceId} | Remove device
*DeviceConfigurationApi* | [**deviceTypesTypeIdDevicesDeviceIdDevicesGet**](docs/DeviceConfigurationApi.md#deviceTypesTypeIdDevicesDeviceIdDevicesGet) | **GET** /device/types/{typeId}/devices/{deviceId}/devices | Get devices that are connected through the gateway specified by id {deviceId}
*DeviceConfigurationApi* | [**deviceTypesTypeIdDevicesDeviceIdEdgestatusGet**](docs/DeviceConfigurationApi.md#deviceTypesTypeIdDevicesDeviceIdEdgestatusGet) | **GET** /device/types/{typeId}/devices/{deviceId}/edgestatus | Return the status of containers from an edge node.
*DeviceConfigurationApi* | [**deviceTypesTypeIdDevicesDeviceIdEdgestatusServiceIdGet**](docs/DeviceConfigurationApi.md#deviceTypesTypeIdDevicesDeviceIdEdgestatusServiceIdGet) | **GET** /device/types/{typeId}/devices/{deviceId}/edgestatus/{serviceId} | Return the status of containers from an edge node filtering by service.
*DeviceConfigurationApi* | [**deviceTypesTypeIdDevicesDeviceIdGet**](docs/DeviceConfigurationApi.md#deviceTypesTypeIdDevicesDeviceIdGet) | **GET** /device/types/{typeId}/devices/{deviceId} | Get device
*DeviceConfigurationApi* | [**deviceTypesTypeIdDevicesDeviceIdPut**](docs/DeviceConfigurationApi.md#deviceTypesTypeIdDevicesDeviceIdPut) | **PUT** /device/types/{typeId}/devices/{deviceId} | Update device
*DeviceConfigurationApi* | [**deviceTypesTypeIdDevicesGet**](docs/DeviceConfigurationApi.md#deviceTypesTypeIdDevicesGet) | **GET** /device/types/{typeId}/devices | List devices
*DeviceConfigurationApi* | [**deviceTypesTypeIdDevicesPost**](docs/DeviceConfigurationApi.md#deviceTypesTypeIdDevicesPost) | **POST** /device/types/{typeId}/devices | Add device
*DeviceProblemDeterminationApi* | [**logsConnectionGet**](docs/DeviceProblemDeterminationApi.md#logsConnectionGet) | **GET** /logs/connection | List device connection log events
*DeviceTypeConfigurationApi* | [**deviceTypesGet**](docs/DeviceTypeConfigurationApi.md#deviceTypesGet) | **GET** /device/types | List device types
*DeviceTypeConfigurationApi* | [**deviceTypesPost**](docs/DeviceTypeConfigurationApi.md#deviceTypesPost) | **POST** /device/types | Create device type
*DeviceTypeConfigurationApi* | [**deviceTypesTypeIdDelete**](docs/DeviceTypeConfigurationApi.md#deviceTypesTypeIdDelete) | **DELETE** /device/types/{typeId} | Delete device type
*DeviceTypeConfigurationApi* | [**deviceTypesTypeIdGet**](docs/DeviceTypeConfigurationApi.md#deviceTypesTypeIdGet) | **GET** /device/types/{typeId} | Get device type
*DeviceTypeConfigurationApi* | [**deviceTypesTypeIdPut**](docs/DeviceTypeConfigurationApi.md#deviceTypesTypeIdPut) | **PUT** /device/types/{typeId} | Update device type
*OrganizationConfigurationApi* | [**rootGet**](docs/OrganizationConfigurationApi.md#rootGet) | **GET** / | Get organization details
*ServiceStatusApi* | [**serviceStatusGet**](docs/ServiceStatusApi.md#serviceStatusGet) | **GET** /service-status | Retrieve the status of services for an organization
*UsageManagementApi* | [**usageDataTrafficGet**](docs/UsageManagementApi.md#usageDataTrafficGet) | **GET** /usage/data-traffic | Retrieve the amount of data used


## Documentation for Models

 - [ContainerStatus](docs/ContainerStatus.md)
 - [DataTraffic](docs/DataTraffic.md)
 - [DataTrafficDetail](docs/DataTrafficDetail.md)
 - [DeploymentOverrides](docs/DeploymentOverrides.md)
 - [DeploymentOverridesDeploymentOverrides](docs/DeploymentOverridesDeploymentOverrides.md)
 - [Device](docs/Device.md)
 - [DeviceAdditionRequest](docs/DeviceAdditionRequest.md)
 - [DeviceAdditionResponse](docs/DeviceAdditionResponse.md)
 - [DeviceBatchResponse](docs/DeviceBatchResponse.md)
 - [DeviceBulkDeletionRequestList](docs/DeviceBulkDeletionRequestList.md)
 - [DeviceBulkDeletionResponse](docs/DeviceBulkDeletionResponse.md)
 - [DeviceBulkDeletionResponseList](docs/DeviceBulkDeletionResponseList.md)
 - [DeviceBulkRegistrationRequest](docs/DeviceBulkRegistrationRequest.md)
 - [DeviceBulkRegistrationRequestList](docs/DeviceBulkRegistrationRequestList.md)
 - [DeviceConcise](docs/DeviceConcise.md)
 - [DeviceExtensionDiagRefs](docs/DeviceExtensionDiagRefs.md)
 - [DeviceExtensionRefs](docs/DeviceExtensionRefs.md)
 - [DeviceFirmware](docs/DeviceFirmware.md)
 - [DeviceInfo](docs/DeviceInfo.md)
 - [DeviceListResponse](docs/DeviceListResponse.md)
 - [DeviceLocation](docs/DeviceLocation.md)
 - [DeviceMgmt](docs/DeviceMgmt.md)
 - [DeviceMgmtSupports](docs/DeviceMgmtSupports.md)
 - [DeviceRegistration](docs/DeviceRegistration.md)
 - [DeviceRegistrationAuth](docs/DeviceRegistrationAuth.md)
 - [DeviceStatus](docs/DeviceStatus.md)
 - [DeviceStatusAlert](docs/DeviceStatusAlert.md)
 - [DeviceTarget](docs/DeviceTarget.md)
 - [DeviceType](docs/DeviceType.md)
 - [DeviceTypeCreationRequest](docs/DeviceTypeCreationRequest.md)
 - [DeviceTypeListResponse](docs/DeviceTypeListResponse.md)
 - [DeviceTypeUpdateRequest](docs/DeviceTypeUpdateRequest.md)
 - [DeviceUpdateRequest](docs/DeviceUpdateRequest.md)
 - [DeviceWithPasswordList](docs/DeviceWithPasswordList.md)
 - [EdgeConfiguration](docs/EdgeConfiguration.md)
 - [EdgeServices](docs/EdgeServices.md)
 - [EdgeStatusResponse](docs/EdgeStatusResponse.md)
 - [EdgeStatusResponseByService](docs/EdgeStatusResponseByService.md)
 - [EdgeStatusResponseContainers](docs/EdgeStatusResponseContainers.md)
 - [ErrorMessage](docs/ErrorMessage.md)
 - [ErrorMessageException](docs/ErrorMessageException.md)
 - [HistorianConfig](docs/HistorianConfig.md)
 - [InvalidRequestMessage](docs/InvalidRequestMessage.md)
 - [ListOfLogEntries](docs/ListOfLogEntries.md)
 - [LogEntry](docs/LogEntry.md)
 - [Metadata](docs/Metadata.md)
 - [Organization](docs/Organization.md)
 - [OrganizationBluemixConfig](docs/OrganizationBluemixConfig.md)
 - [OrganizationConfig](docs/OrganizationConfig.md)
 - [OrganizationIbmMarketplaceConfig](docs/OrganizationIbmMarketplaceConfig.md)
 - [SearchResultMetaInformation](docs/SearchResultMetaInformation.md)
 - [ServiceStatus](docs/ServiceStatus.md)
 - [UpdateableDeviceLocation](docs/UpdateableDeviceLocation.md)
 - [UpdateableDeviceStatus](docs/UpdateableDeviceStatus.md)
 - [UpdateableDeviceStatusAlert](docs/UpdateableDeviceStatusAlert.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKey

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



