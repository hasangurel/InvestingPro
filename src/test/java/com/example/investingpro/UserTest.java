package com.example.investingpro;

import com.example.investingpro.User.UserController;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RequiredArgsConstructor
public class UserTest {
    private final UserController controller;
}
