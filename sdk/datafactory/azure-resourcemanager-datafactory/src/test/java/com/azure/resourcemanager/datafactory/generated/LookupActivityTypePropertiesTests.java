// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.LookupActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.CopySource;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class LookupActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LookupActivityTypeProperties model = BinaryData.fromString(
            "{\"source\":{\"type\":\"CopySource\",\"sourceRetryCount\":\"datawwaxx\",\"sourceRetryWait\":\"datardsmra\",\"maxConcurrentConnections\":\"datat\",\"disableMetricsCollection\":\"datapxmdwdlboc\",\"\":{\"wbyrkxzebv\":\"datanqcgbijyp\",\"wzzeumadl\":\"datauzchegeogdkcrc\"}},\"dataset\":{\"referenceName\":\"xirewhuqk\",\"parameters\":{\"lbq\":\"datamyykmk\",\"dvksigxak\":\"datanrmgefxkattpkkw\",\"ooqobpnkvn\":\"dataoptb\"}},\"firstRowOnly\":\"datajrxbbxkh\"}")
            .toObject(LookupActivityTypeProperties.class);
        Assertions.assertEquals("xirewhuqk", model.dataset().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LookupActivityTypeProperties model = new LookupActivityTypeProperties()
            .withSource(new CopySource().withSourceRetryCount("datawwaxx").withSourceRetryWait("datardsmra")
                .withMaxConcurrentConnections("datat").withDisableMetricsCollection("datapxmdwdlboc")
                .withAdditionalProperties(mapOf("type", "CopySource")))
            .withDataset(new DatasetReference().withReferenceName("xirewhuqk").withParameters(
                mapOf("lbq", "datamyykmk", "dvksigxak", "datanrmgefxkattpkkw", "ooqobpnkvn", "dataoptb")))
            .withFirstRowOnly("datajrxbbxkh");
        model = BinaryData.fromObject(model).toObject(LookupActivityTypeProperties.class);
        Assertions.assertEquals("xirewhuqk", model.dataset().referenceName());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
