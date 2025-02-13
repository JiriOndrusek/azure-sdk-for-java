// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Router Channel Configuration. */
@Fluent
public final class AcsRouterChannelConfiguration {
    /*
     * Channel ID for Router Job
     */
    @JsonProperty(value = "channelId")
    private String channelId;

    /*
     * Capacity Cost Per Job for Router Job
     */
    @JsonProperty(value = "capacityCostPerJob")
    private Integer capacityCostPerJob;

    /*
     * Max Number of Jobs for Router Job
     */
    @JsonProperty(value = "maxNumberOfJobs")
    private Integer maxNumberOfJobs;

    /** Creates an instance of AcsRouterChannelConfiguration class. */
    public AcsRouterChannelConfiguration() {}

    /**
     * Get the channelId property: Channel ID for Router Job.
     *
     * @return the channelId value.
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * Set the channelId property: Channel ID for Router Job.
     *
     * @param channelId the channelId value to set.
     * @return the AcsRouterChannelConfiguration object itself.
     */
    public AcsRouterChannelConfiguration setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * Get the capacityCostPerJob property: Capacity Cost Per Job for Router Job.
     *
     * @return the capacityCostPerJob value.
     */
    public Integer getCapacityCostPerJob() {
        return this.capacityCostPerJob;
    }

    /**
     * Set the capacityCostPerJob property: Capacity Cost Per Job for Router Job.
     *
     * @param capacityCostPerJob the capacityCostPerJob value to set.
     * @return the AcsRouterChannelConfiguration object itself.
     */
    public AcsRouterChannelConfiguration setCapacityCostPerJob(Integer capacityCostPerJob) {
        this.capacityCostPerJob = capacityCostPerJob;
        return this;
    }

    /**
     * Get the maxNumberOfJobs property: Max Number of Jobs for Router Job.
     *
     * @return the maxNumberOfJobs value.
     */
    public Integer getMaxNumberOfJobs() {
        return this.maxNumberOfJobs;
    }

    /**
     * Set the maxNumberOfJobs property: Max Number of Jobs for Router Job.
     *
     * @param maxNumberOfJobs the maxNumberOfJobs value to set.
     * @return the AcsRouterChannelConfiguration object itself.
     */
    public AcsRouterChannelConfiguration setMaxNumberOfJobs(Integer maxNumberOfJobs) {
        this.maxNumberOfJobs = maxNumberOfJobs;
        return this;
    }
}
