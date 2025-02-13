// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.elasticsan.ElasticSanManager;
import com.azure.resourcemanager.elasticsan.models.PrivateEndpointConnection;
import com.azure.resourcemanager.elasticsan.models.PrivateEndpointServiceConnectionStatus;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Creating\",\"privateEndpoint\":{\"id\":\"ibdeibq\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"ghvxndzwmkrefa\",\"actionsRequired\":\"jorwkqnyhgbij\"},\"groupIds\":[\"vfxzsjab\",\"bsystawfsdjpvk\",\"p\",\"jxbkzbzkdvn\"]},\"id\":\"abudurgk\",\"name\":\"kmokz\",\"type\":\"jjklff\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        ElasticSanManager manager =
            ElasticSanManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PrivateEndpointConnection> response =
            manager.privateEndpointConnections().list("odacizs", "q", com.azure.core.util.Context.NONE);

        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.PENDING,
                response.iterator().next().privateLinkServiceConnectionState().status());
        Assertions
            .assertEquals(
                "ghvxndzwmkrefa", response.iterator().next().privateLinkServiceConnectionState().description());
        Assertions
            .assertEquals(
                "jorwkqnyhgbij", response.iterator().next().privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("vfxzsjab", response.iterator().next().groupIds().get(0));
    }
}
