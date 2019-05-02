/*
 * IBM Watson IoT Platform Organization Information Management REST APIs
 * The Information Management APIs can be used to access device event data as well as  get and update device location and obtain weather information for that location. For information on this API, and how to use Watson IoT Platform APIs generally see  [the API documentation](https://console.ng.bluemix.net/docs/services/IoT/reference/api.html).  version: \"0002\" 
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ibm.wiotp.swagger.api;

import com.ibm.wiotp.swagger.ApiException;
import com.ibm.wiotp.swagger.model.DeviceLocation;
import com.ibm.wiotp.swagger.model.ErrorMessage;
import com.ibm.wiotp.swagger.model.UpdateableDeviceLocation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DeviceLocationApi
 */
@Ignore
public class DeviceLocationApiTest {

    private final DeviceLocationApi api = new DeviceLocationApi();

    
    /**
     * Get device location information
     *
     * Gets location information for a device.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deviceTypesTypeIdDevicesDeviceIdLocationGetTest() throws ApiException {
        String typeId = null;
        String deviceId = null;
        DeviceLocation response = api.deviceTypesTypeIdDevicesDeviceIdLocationGet(typeId, deviceId);

        // TODO: test validations
    }
    
    /**
     * Update device location information
     *
     * Updates the location information for a device. If no date is supplied, the entry is added with the current date and time.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deviceTypesTypeIdDevicesDeviceIdLocationPutTest() throws ApiException {
        String typeId = null;
        String deviceId = null;
        UpdateableDeviceLocation location = null;
        DeviceLocation response = api.deviceTypesTypeIdDevicesDeviceIdLocationPut(typeId, deviceId, location);

        // TODO: test validations
    }
    
}
