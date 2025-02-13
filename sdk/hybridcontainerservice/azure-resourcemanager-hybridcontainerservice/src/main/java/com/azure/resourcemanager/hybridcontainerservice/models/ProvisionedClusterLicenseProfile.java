// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The license profile of the provisioned cluster.
 */
@Fluent
public final class ProvisionedClusterLicenseProfile {
    /*
     * Indicates whether Azure Hybrid Benefit is opted in
     */
    @JsonProperty(value = "azureHybridBenefit")
    private AzureHybridBenefit azureHybridBenefit;

    /**
     * Creates an instance of ProvisionedClusterLicenseProfile class.
     */
    public ProvisionedClusterLicenseProfile() {
    }

    /**
     * Get the azureHybridBenefit property: Indicates whether Azure Hybrid Benefit is opted in.
     * 
     * @return the azureHybridBenefit value.
     */
    public AzureHybridBenefit azureHybridBenefit() {
        return this.azureHybridBenefit;
    }

    /**
     * Set the azureHybridBenefit property: Indicates whether Azure Hybrid Benefit is opted in.
     * 
     * @param azureHybridBenefit the azureHybridBenefit value to set.
     * @return the ProvisionedClusterLicenseProfile object itself.
     */
    public ProvisionedClusterLicenseProfile withAzureHybridBenefit(AzureHybridBenefit azureHybridBenefit) {
        this.azureHybridBenefit = azureHybridBenefit;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
