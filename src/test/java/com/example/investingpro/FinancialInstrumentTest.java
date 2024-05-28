package com.example.investingpro;
import com.example.investingpro.FinancialInstrument.FinancialInstrumentController;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RequiredArgsConstructor
public class FinancialInstrumentTest {
    private final FinancialInstrumentController controller;
}
