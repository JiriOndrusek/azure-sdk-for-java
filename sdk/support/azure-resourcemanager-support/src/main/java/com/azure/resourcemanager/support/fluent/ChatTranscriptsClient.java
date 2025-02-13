// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.support.fluent.models.ChatTranscriptDetailsInner;

/** An instance of this class provides access to all the operations defined in ChatTranscriptsClient. */
public interface ChatTranscriptsClient {
    /**
     * Lists all chat transcripts for a support ticket under subscription.
     *
     * @param supportTicketName Support ticket name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Chat Transcripts resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ChatTranscriptDetailsInner> list(String supportTicketName);

    /**
     * Lists all chat transcripts for a support ticket under subscription.
     *
     * @param supportTicketName Support ticket name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Chat Transcripts resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ChatTranscriptDetailsInner> list(String supportTicketName, Context context);

    /**
     * Returns chatTranscript details for a support ticket under a subscription.
     *
     * @param supportTicketName Support ticket name.
     * @param chatTranscriptName ChatTranscript name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents a Chat Transcript resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ChatTranscriptDetailsInner> getWithResponse(
        String supportTicketName, String chatTranscriptName, Context context);

    /**
     * Returns chatTranscript details for a support ticket under a subscription.
     *
     * @param supportTicketName Support ticket name.
     * @param chatTranscriptName ChatTranscript name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents a Chat Transcript resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ChatTranscriptDetailsInner get(String supportTicketName, String chatTranscriptName);
}
