package com.qacart.tasky.mocker;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public final class ProfileMock {
    private ProfileMock() {}
    private static final String testUrl = "/api/auth/profile";
    public static void mockRegularProfile(){
        String responseMockFile = "regularUser_successfulSubscription.json";
        stubFor(
                get(
                        urlEqualTo(testUrl))
                        .willReturn(
                                aResponse()
                                .withStatus(200)
                                        .withBodyFile(responseMockFile)
                        )
        );
    }

    public static void mockSubscribedProfile_1(){
        String responseMockFile = "activatedProfile_SuccessfulSubscription.json";
        stubFor(
                get(
                        urlEqualTo(testUrl))
                        .willReturn(
                                aResponse()
                                        .withStatus(200)
                                        .withBodyFile(responseMockFile)
                        )
        );
    }


}
