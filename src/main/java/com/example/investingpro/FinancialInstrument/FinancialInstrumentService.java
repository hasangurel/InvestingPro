package com.example.investingpro.FinancialInstrument;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FinancialInstrumentService {
    private final FinancialInstrumentRepository financialInstrumentRepository;

    private final FinancialInstrumentConverter converter;

    public List<FinancialInstrumentGetResponse> getAllFinancialInstruments() {
        List<FinancialInstrument> all = financialInstrumentRepository.findAll();
        return all.stream()
                .map(converter::getResponseConverter)
                .collect(Collectors.toList());
    }


}
