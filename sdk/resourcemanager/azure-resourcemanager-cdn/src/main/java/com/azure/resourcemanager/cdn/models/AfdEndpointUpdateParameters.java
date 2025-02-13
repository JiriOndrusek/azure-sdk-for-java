// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cdn.fluent.models.AfdEndpointPropertiesUpdateParameters;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Properties required to create or update an endpoint. */
@Fluent
public final class AfdEndpointUpdateParameters {
    /*
     * Endpoint tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The JSON object containing endpoint update parameters.
     */
    @JsonProperty(value = "properties")
    private AfdEndpointPropertiesUpdateParameters innerProperties;

    /** Creates an instance of AfdEndpointUpdateParameters class. */
    public AfdEndpointUpdateParameters() {
    }

    /**
     * Get the tags property: Endpoint tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Endpoint tags.
     *
     * @param tags the tags value to set.
     * @return the AfdEndpointUpdateParameters object itself.
     */
    public AfdEndpointUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: The JSON object containing endpoint update parameters.
     *
     * @return the innerProperties value.
     */
    private AfdEndpointPropertiesUpdateParameters innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the profileName property: The name of the profile which holds the endpoint.
     *
     * @return the profileName value.
     */
    public String profileName() {
        return this.innerProperties() == null ? null : this.innerProperties().profileName();
    }

    /**
     * Get the enabledState property: Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'.
     *
     * @return the enabledState value.
     */
    public EnabledState enabledState() {
        return this.innerProperties() == null ? null : this.innerProperties().enabledState();
    }

    /**
     * Set the enabledState property: Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'.
     *
     * @param enabledState the enabledState value to set.
     * @return the AfdEndpointUpdateParameters object itself.
     */
    public AfdEndpointUpdateParameters withEnabledState(EnabledState enabledState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdEndpointPropertiesUpdateParameters();
        }
        this.innerProperties().withEnabledState(enabledState);
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
