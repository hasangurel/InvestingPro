package com.example.investingpro.Portfolio;

import com.example.investingpro.FinancialInstrument.FinancialInstrument;
import com.example.investingpro.User.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id")
    private User user;

    private String name;

    private Date createDate;

    private Date updatedDate;

    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinTable(joinColumns = @JoinColumn,
            inverseJoinColumns = @JoinColumn)
    private List<FinancialInstrument> instruments;


}
