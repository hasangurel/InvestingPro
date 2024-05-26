package com.example.investingpro.User;

import lombok.Builder;

@Builder
public record UserGetRequest(
         String name
) {
}