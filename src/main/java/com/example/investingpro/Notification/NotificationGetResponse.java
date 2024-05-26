package com.example.investingpro.Notification;

import lombok.Builder;

@Builder
public record NotificationGetResponse(
        String name,

        String symbol,

        String type,

        String market,

        String currency
) {

}
