package com.cobo.api.client;

import com.cobo.api.client.impl.CoboApiRestClientImpl;

public class CoboApiClientFactory {

    private final String apiKey;
    private final ApiSigner signer;
    private final String coboPub;

    private CoboApiClientFactory(String apiKey, ApiSigner signer, String coboPub) {
        this.apiKey = apiKey;
        this.signer = signer;
        this.coboPub = coboPub;
    }

    public static CoboApiClientFactory newInstance(String apiKey, ApiSigner signer, String coboPub) {
        return new CoboApiClientFactory(apiKey, signer, coboPub);
    }

    public CoboApiRestClient newRestClient() {
        return new CoboApiRestClientImpl(apiKey, signer, coboPub);
    }
}
