package com.qacart.tasky.mocker;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;

public final class CurrentSubscriptionMock {
    private CurrentSubscriptionMock() {}
    private static final String testURL = "/api/subscriptions/current";

    public static void mockActivatedCurrentSubscription() {
        String responseMockFile = "currentSubscriptionData_SuccessfulSubscription.json";
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

    public static void mockSubscribedCurrentSubscription() {
        String responseMockFile = "currentSubscriptionCloseToBeExpired.json";
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


}
