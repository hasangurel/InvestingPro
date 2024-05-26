package com.example.investingpro.MarketData;

import lombok.Builder;

@Builder
public record MarketDataGetResponse(
        String name,

        String symbol,

        String type,

        String market,

        String currency
) {

}
