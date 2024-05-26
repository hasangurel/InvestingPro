package com.example.investingpro.MarketData;

public record MarketDataUpdateRequest(
        String name,
        
        String symbol,

        String type,

        String market,

        String currency
) {
}
