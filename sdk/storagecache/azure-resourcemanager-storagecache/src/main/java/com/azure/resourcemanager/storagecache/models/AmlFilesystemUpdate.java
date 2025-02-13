// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.storagecache.fluent.models.AmlFilesystemUpdateProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** An AML file system update instance. */
@Fluent
public final class AmlFilesystemUpdate {
    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Properties of the AML file system.
     */
    @JsonProperty(value = "properties")
    private AmlFilesystemUpdateProperties innerProperties;

    /** Creates an instance of AmlFilesystemUpdate class. */
    public AmlFilesystemUpdate() {
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the AmlFilesystemUpdate object itself.
     */
    public AmlFilesystemUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the AML file system.
     *
     * @return the innerProperties value.
     */
    private AmlFilesystemUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the encryptionSettings property: Specifies encryption settings of the AML file system.
     *
     * @return the encryptionSettings value.
     */
    public AmlFilesystemEncryptionSettings encryptionSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().encryptionSettings();
    }

    /**
     * Set the encryptionSettings property: Specifies encryption settings of the AML file system.
     *
     * @param encryptionSettings the encryptionSettings value to set.
     * @return the AmlFilesystemUpdate object itself.
     */
    public AmlFilesystemUpdate withEncryptionSettings(AmlFilesystemEncryptionSettings encryptionSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AmlFilesystemUpdateProperties();
        }
        this.innerProperties().withEncryptionSettings(encryptionSettings);
        return this;
    }

    /**
     * Get the maintenanceWindow property: Start time of a 30-minute weekly maintenance window.
     *
     * @return the maintenanceWindow value.
     */
    public AmlFilesystemUpdatePropertiesMaintenanceWindow maintenanceWindow() {
        return this.innerProperties() == null ? null : this.innerProperties().maintenanceWindow();
    }

    /**
     * Set the maintenanceWindow property: Start time of a 30-minute weekly maintenance window.
     *
     * @param maintenanceWindow the maintenanceWindow value to set.
     * @return the AmlFilesystemUpdate object itself.
     */
    public AmlFilesystemUpdate withMaintenanceWindow(AmlFilesystemUpdatePropertiesMaintenanceWindow maintenanceWindow) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AmlFilesystemUpdateProperties();
        }
        this.innerProperties().withMaintenanceWindow(maintenanceWindow);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
