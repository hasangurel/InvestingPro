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

    public FinancialInstrumentGetResponse getFinancialInstrument(String id) {
        return converter.getResponseConverter(findById(id));
    }
    public FinancialInstrumentUpdateResponse updateFinancialInstrument( FinancialInstrumentUpdateRequest request) {
        FinancialInstrument byId = findById(request.id());
        byId.setName(request.name());
        byId.setType(request.type());
        byId.setCurrency(request.currency());
        byId.setMarket(request.market());
        financialInstrumentRepository.save(byId);
        return FinancialInstrumentUpdateResponse.builder()
                .type(byId.getType())
                .name(byId.getName())
                .market(byId.getMarket())
                .symbol(byId.getSymbol())
                .currency(byId.getCurrency()).build();
    }
    private FinancialInstrument findById(String id) {
        return financialInstrumentRepository.findById(id).orElseThrow(() -> new RuntimeException("Instrument Not Found"));
    }
}
