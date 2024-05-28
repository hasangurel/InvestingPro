package com.example.investingpro;

import com.example.investingpro.Watchlist.Watchlist;
import com.example.investingpro.Watchlist.WatchlistController;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RequiredArgsConstructor
public class WatchlistTest {
    private final WatchlistController controller;
}
