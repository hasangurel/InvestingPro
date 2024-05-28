package com.example.investingpro.FinancialInstrument;

import com.example.investingpro.MarketData.MarketData;
import com.example.investingpro.MarketData.MarketDataGetResponse;
import lombok.Builder;

@Builder
public record FinancialInstrumentUpdateRequest(
        String id,

        String name,
        
        String symbol,

        String type,

        String market,

        String currency


) {
}
