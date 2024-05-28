package com.example.investingpro;

import com.example.investingpro.News.NewsController;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RequiredArgsConstructor
public class NewsTest {
    private final NewsController controller;
}
