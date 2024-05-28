package com.example.investingpro;

import com.example.investingpro.Portfolio.PortfolioController;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RequiredArgsConstructor
public class PortfolioTest {
    private final PortfolioController controller;
}
