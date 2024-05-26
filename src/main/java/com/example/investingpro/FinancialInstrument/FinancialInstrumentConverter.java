package com.example.investingpro.FinancialInstrument;

import com.example.investingpro.MarketData.MarketDataGetResponse;
import org.springframework.stereotype.Component;


@Component
public class FinancialInstrumentConverter {
    public FinancialInstrumentGetResponse getResponseConverter(FinancialInstrument financialInstrument) {
        return FinancialInstrumentGetResponse.builder()
                .currency(financialInstrument.getCurrency())
                .name(financialInstrument.getName())
                .type(financialInstrument.getType())
                .market(financialInstrument.getMarket())
                .symbol(financialInstrument.getSymbol())
                .marketData(MarketDataGetResponse.builder().build()).build();


    }
}
