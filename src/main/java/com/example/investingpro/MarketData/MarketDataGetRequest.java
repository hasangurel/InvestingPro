package com.example.investingpro.MarketData;

import lombok.Builder;

@Builder
public record MarketDataGetRequest(
         String name
) {
}