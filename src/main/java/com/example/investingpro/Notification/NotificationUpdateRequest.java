package com.example.investingpro.Notification;

public record NotificationUpdateRequest(
        String name,
        
        String symbol,

        String type,

        String market,

        String currency
) {
}
