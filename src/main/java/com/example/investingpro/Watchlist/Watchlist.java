package com.example.investingpro.Watchlist;

import com.example.investingpro.User.User;
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
public class Watchlist {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private User user;

    private String name;

    private Date createdDate;

    private Date updatedDate;


}
