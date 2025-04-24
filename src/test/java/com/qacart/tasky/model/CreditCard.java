package com.qacart.tasky.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder(setterPrefix = "set")
public class CreditCard {
    private String cardNumber;
    private String expiryMonth;
    private String expiryYear;
    private String cvv;
}
