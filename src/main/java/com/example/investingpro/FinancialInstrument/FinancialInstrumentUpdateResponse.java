package com.example.investingpro.FinancialInstrument;

import lombok.Builder;

@Builder
public record FinancialInstrumentUpdateResponse(
        String name,

        String symbol,

        String type,

        String market,

        String currency
) {

}
