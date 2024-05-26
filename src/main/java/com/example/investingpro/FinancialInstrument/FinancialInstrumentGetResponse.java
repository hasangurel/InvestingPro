package com.example.investingpro.FinancialInstrument;

import com.example.investingpro.MarketData.MarketDataGetResponse;
import lombok.Builder;

@Builder
public record FinancialInstrumentGetResponse(
        String name,

        String symbol,

        String type,

        String market,

        String currency,

        MarketDataGetResponse marketData
) {

}
