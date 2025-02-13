// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlan;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanGroupType;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanTestFailoverCleanupInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanTestFailoverCleanupInputProperties;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ReplicationRecoveryPlansTestFailoverCleanupMockTests {
    @Test
    public void testTestFailoverCleanup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"friendlyName\":\"lbiqq\",\"primaryFabricId\":\"arxknfvbsym\",\"primaryFabricFriendlyName\":\"bahdbtjm\",\"recoveryFabricId\":\"zonrklbizrxh\",\"recoveryFabricFriendlyName\":\"fvpanloqovvcxgq\",\"failoverDeploymentModel\":\"uirgopgzatucu\",\"replicationProviders\":[\"uzvyjxuxchquoqhq\",\"csksxqf\",\"lrvuvdagv\"],\"allowedOperations\":[\"d\"],\"lastPlannedFailoverTime\":\"2021-04-28T08:18:31Z\",\"lastUnplannedFailoverTime\":\"2021-02-19T21:32:29Z\",\"lastTestFailoverTime\":\"2020-12-25T04:39:30Z\",\"currentScenario\":{\"scenarioName\":\"odiijcsapqhip\",\"jobId\":\"snivnmevljbcu\",\"startTime\":\"2021-08-10T00:42:25Z\"},\"currentScenarioStatus\":\"pjf\",\"currentScenarioStatusDescription\":\"wkseodvlmd\",\"groups\":[{\"groupType\":\"Failover\",\"replicationProtectedItems\":[{},{},{}],\"startGroupActions\":[{\"actionName\":\"u\",\"failoverTypes\":[],\"failoverDirections\":[],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}}],\"endGroupActions\":[{\"actionName\":\"yg\",\"failoverTypes\":[],\"failoverDirections\":[],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}},{\"actionName\":\"bmum\",\"failoverTypes\":[],\"failoverDirections\":[],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}},{\"actionName\":\"jvvcrsmwojm\",\"failoverTypes\":[],\"failoverDirections\":[],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}},{\"actionName\":\"wcvumnrut\",\"failoverTypes\":[],\"failoverDirections\":[],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}}]},{\"groupType\":\"Boot\",\"replicationProtectedItems\":[{}],\"startGroupActions\":[{\"actionName\":\"f\",\"failoverTypes\":[],\"failoverDirections\":[],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}},{\"actionName\":\"vltjo\",\"failoverTypes\":[],\"failoverDirections\":[],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}}],\"endGroupActions\":[{\"actionName\":\"vpkbz\",\"failoverTypes\":[],\"failoverDirections\":[],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}},{\"actionName\":\"tnowpajfhxsmu\",\"failoverTypes\":[],\"failoverDirections\":[],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}}]}],\"providerSpecificDetails\":[{\"instanceType\":\"RecoveryPlanProviderSpecificDetails\"},{\"instanceType\":\"RecoveryPlanProviderSpecificDetails\"},{\"instanceType\":\"RecoveryPlanProviderSpecificDetails\"}]},\"location\":\"dzglmuuzpsuhsyp\",\"id\":\"muldhfr\",\"name\":\"rkqpyfjxkby\",\"type\":\"sbuqfm\"}";

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

        SiteRecoveryManager manager =
            SiteRecoveryManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        RecoveryPlan response =
            manager
                .replicationRecoveryPlans()
                .testFailoverCleanup(
                    "p",
                    "addpxqrxipe",
                    "rplf",
                    new RecoveryPlanTestFailoverCleanupInput()
                        .withProperties(new RecoveryPlanTestFailoverCleanupInputProperties().withComments("vmjjfz")),
                    com.azure.core.util.Context.NONE);

        Assertions.assertEquals("lbiqq", response.properties().friendlyName());
        Assertions.assertEquals("arxknfvbsym", response.properties().primaryFabricId());
        Assertions.assertEquals("bahdbtjm", response.properties().primaryFabricFriendlyName());
        Assertions.assertEquals("zonrklbizrxh", response.properties().recoveryFabricId());
        Assertions.assertEquals("fvpanloqovvcxgq", response.properties().recoveryFabricFriendlyName());
        Assertions.assertEquals("uirgopgzatucu", response.properties().failoverDeploymentModel());
        Assertions.assertEquals("uzvyjxuxchquoqhq", response.properties().replicationProviders().get(0));
        Assertions.assertEquals("d", response.properties().allowedOperations().get(0));
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-04-28T08:18:31Z"), response.properties().lastPlannedFailoverTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-02-19T21:32:29Z"), response.properties().lastUnplannedFailoverTime());
        Assertions
            .assertEquals(OffsetDateTime.parse("2020-12-25T04:39:30Z"), response.properties().lastTestFailoverTime());
        Assertions.assertEquals("odiijcsapqhip", response.properties().currentScenario().scenarioName());
        Assertions.assertEquals("snivnmevljbcu", response.properties().currentScenario().jobId());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-08-10T00:42:25Z"), response.properties().currentScenario().startTime());
        Assertions.assertEquals("pjf", response.properties().currentScenarioStatus());
        Assertions.assertEquals("wkseodvlmd", response.properties().currentScenarioStatusDescription());
        Assertions.assertEquals(RecoveryPlanGroupType.FAILOVER, response.properties().groups().get(0).groupType());
        Assertions.assertEquals("u", response.properties().groups().get(0).startGroupActions().get(0).actionName());
        Assertions.assertEquals("yg", response.properties().groups().get(0).endGroupActions().get(0).actionName());
        Assertions.assertEquals("dzglmuuzpsuhsyp", response.location());
    }
}
