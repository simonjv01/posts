package com.example.posts;

public record Post(Integer id, Integer userId, String title, String body, Integer version) {
}
