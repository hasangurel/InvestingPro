package com.example.investingpro.MarketData;

import com.example.investingpro.MarketData.MarketData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketDataRepository extends JpaRepository<MarketData,String > {
}
