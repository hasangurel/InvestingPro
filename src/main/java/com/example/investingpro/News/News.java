package com.example.investingpro.News;

import com.example.investingpro.FinancialInstrument.FinancialInstrument;
import jakarta.persistence.*;
import jakarta.websocket.Decoder;
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
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String title;

    private String content;
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinTable(joinColumns = @JoinColumn,
            inverseJoinColumns = @JoinColumn)
    private List<FinancialInstrument> relatedInstruments ;

    private String author;

    private String source;

    private Date publishDate;


}
