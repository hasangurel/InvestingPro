package com.example.investingpro.FinancialInstrument;


import com.example.investingpro.MarketData.MarketData;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FinancialInstrument {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String symbol;

    private String type;

    private String market;

    private String currency;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "marketData_id")
    private MarketData marketData;


}
