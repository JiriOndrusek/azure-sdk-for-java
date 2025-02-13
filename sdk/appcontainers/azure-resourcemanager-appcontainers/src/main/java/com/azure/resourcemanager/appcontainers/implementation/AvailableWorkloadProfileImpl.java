// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.resourcemanager.appcontainers.fluent.models.AvailableWorkloadProfileInner;
import com.azure.resourcemanager.appcontainers.models.AvailableWorkloadProfile;
import com.azure.resourcemanager.appcontainers.models.AvailableWorkloadProfileProperties;

public final class AvailableWorkloadProfileImpl implements AvailableWorkloadProfile {
    private AvailableWorkloadProfileInner innerObject;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    AvailableWorkloadProfileImpl(
        AvailableWorkloadProfileInner innerObject,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public AvailableWorkloadProfileProperties properties() {
        return this.innerModel().properties();
    }

    public AvailableWorkloadProfileInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }
}
