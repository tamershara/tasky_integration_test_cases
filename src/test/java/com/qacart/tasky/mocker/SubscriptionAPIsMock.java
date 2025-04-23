package com.qacart.tasky.mocker;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public final class SubscriptionAPIsMock {
    private SubscriptionAPIsMock() {}

    public static void mockSubscriptionTypes() {
        String testURL = "/api/subscription-types";
        String responseMockFile = "subscriptionTypes.json";
        stubFor(
                get(
                        urlEqualTo(testURL))
                        .willReturn(
                                aResponse()
                                        .withStatus(200)
                                        .withBodyFile(responseMockFile)
                        )
        );
    }

    public static void mockSuccessfulSubscriptionResponse() {
        String testURL = "/api/subscriptions";
        String responseMockFile = "successfulSubscriptionResponse.json";
        stubFor(
                post(
                        urlEqualTo(testURL))
                        .willReturn(
                                aResponse()
                                        .withStatus(201)
                                        .withBodyFile(responseMockFile)
                        )
        );
    }

}
