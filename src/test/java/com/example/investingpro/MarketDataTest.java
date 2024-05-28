package com.example.investingpro;
import com.example.investingpro.MarketData.MarketDataController;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RequiredArgsConstructor
public class MarketDataTest {
    private final MarketDataController controller;
}
