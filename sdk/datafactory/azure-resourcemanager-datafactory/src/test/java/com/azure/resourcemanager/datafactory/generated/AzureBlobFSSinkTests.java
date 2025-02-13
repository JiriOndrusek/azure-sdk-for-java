// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureBlobFSSink;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import java.util.Arrays;

public final class AzureBlobFSSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBlobFSSink model = BinaryData.fromString(
            "{\"type\":\"AzureBlobFSSink\",\"copyBehavior\":\"datazvuhwsenazjv\",\"metadata\":[{\"name\":\"datazdnez\",\"value\":\"dataqzd\"},{\"name\":\"datamyutzttroymi\",\"value\":\"datakuz\"},{\"name\":\"datacegyztzhcfuwm\",\"value\":\"dataz\"}],\"writeBatchSize\":\"datamklroogflh\",\"writeBatchTimeout\":\"dataspxblyokjwsszye\",\"sinkRetryCount\":\"dataoukdhnf\",\"sinkRetryWait\":\"datadggjihnzvoehgw\",\"maxConcurrentConnections\":\"datagcnkghgczjx\",\"disableMetricsCollection\":\"dataxigdwpgmhqhvne\",\"\":{\"aqlymmhzvnetecfy\":\"dataxqwc\",\"zxqwvvfkqbgkss\":\"datasfkcwfpoaflgkz\"}}")
            .toObject(AzureBlobFSSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBlobFSSink model = new AzureBlobFSSink().withWriteBatchSize("datamklroogflh")
            .withWriteBatchTimeout("dataspxblyokjwsszye").withSinkRetryCount("dataoukdhnf")
            .withSinkRetryWait("datadggjihnzvoehgw").withMaxConcurrentConnections("datagcnkghgczjx")
            .withDisableMetricsCollection("dataxigdwpgmhqhvne").withCopyBehavior("datazvuhwsenazjv")
            .withMetadata(Arrays.asList(new MetadataItem().withName("datazdnez").withValue("dataqzd"),
                new MetadataItem().withName("datamyutzttroymi").withValue("datakuz"),
                new MetadataItem().withName("datacegyztzhcfuwm").withValue("dataz")));
        model = BinaryData.fromObject(model).toObject(AzureBlobFSSink.class);
    }
}
