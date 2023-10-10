package com.example.posts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api/posts")
public class PostController {

    @GetMapping("")
    List<Post> findAll() {
        return null;
    }
}
