package com.example.investingpro.FinancialInstrument;

import lombok.Builder;

@Builder
public record FinancialInstrumentGetRequest(
         String name
) {
}