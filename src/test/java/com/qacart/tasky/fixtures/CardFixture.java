package com.qacart.tasky.fixtures;

import com.qacart.tasky.model.CreditCard;

public final class CardFixture {
    private CardFixture() {}

    public static CreditCard getDefaultCardInfo() {
        return CreditCard
                .builder()
                .setCardNumber("4111111111111111")
                .setExpiryMonth("01")
                .setExpiryYear("2029")
                .setCvv("123")
                .build();
    }
}
