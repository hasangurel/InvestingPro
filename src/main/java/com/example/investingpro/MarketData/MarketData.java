package com.example.investingpro.MarketData;

import com.example.investingpro.FinancialInstrument.FinancialInstrument;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MarketData {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "Financial_id")
    private FinancialInstrument financialInstrument;

    private String dataId;

    private Float open;

    private Float close;

    private Float high;

    private Float low;

    private Date date;

    private Integer volume;

}
