// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.imagebuilder.models.OperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class OperationDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationDisplay model =
            BinaryData
                .fromString(
                    "{\"provider\":\"kanyktzlcuiywg\",\"operation\":\"wgndrvynhzgpp\",\"resource\":\"cgyncocpecf\",\"description\":\"mcoo\"}")
                .toObject(OperationDisplay.class);
        Assertions.assertEquals("kanyktzlcuiywg", model.provider());
        Assertions.assertEquals("wgndrvynhzgpp", model.operation());
        Assertions.assertEquals("cgyncocpecf", model.resource());
        Assertions.assertEquals("mcoo", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationDisplay model =
            new OperationDisplay()
                .withProvider("kanyktzlcuiywg")
                .withOperation("wgndrvynhzgpp")
                .withResource("cgyncocpecf")
                .withDescription("mcoo");
        model = BinaryData.fromObject(model).toObject(OperationDisplay.class);
        Assertions.assertEquals("kanyktzlcuiywg", model.provider());
        Assertions.assertEquals("wgndrvynhzgpp", model.operation());
        Assertions.assertEquals("cgyncocpecf", model.resource());
        Assertions.assertEquals("mcoo", model.description());
    }
}
