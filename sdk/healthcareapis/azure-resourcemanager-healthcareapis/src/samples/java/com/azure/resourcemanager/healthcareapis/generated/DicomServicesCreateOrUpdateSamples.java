// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

/**
 * Samples for DicomServices CreateOrUpdate.
 */
public final class DicomServicesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/healthcareapis/resource-manager/Microsoft.HealthcareApis/stable/2023-11-01/examples/dicomservices/
     * DicomServices_Create.json
     */
    /**
     * Sample code: Create or update a Dicom Service.
     * 
     * @param manager Entry point to HealthcareApisManager.
     */
    public static void
        createOrUpdateADicomService(com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager) {
        manager.dicomServices().define("blue").withExistingWorkspace("testRG", "workspace1").withRegion("westus")
            .create();
    }
}
