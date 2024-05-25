package com.example.investingpro.MarketData;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@RequiredArgsConstructor
public class MarketData {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String dataId;

    private Float open;

    private Float close;

    private Float high;

    private Float low;

    private Date date;

    private Integer volume;

}
