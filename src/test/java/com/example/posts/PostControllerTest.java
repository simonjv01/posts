package com.example.posts;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

@WebMvcTest(PostController.class)
@AutoConfigureMockMvc
public class PostControllerTest {

    @Autowired
    MockMvc mockMvc;

    List<Post> posts = new ArrayList<>();

    @BeforeEach
    void SetUp() {
        // create some posts
        posts = List.of(
                new Post(1,1,"Hello, World!", "This is my first post.", null),
                new Post(2,1,"Second Post", "This is my second post.", null)
        );
    }

    // REST API

    // list
    @Test
    public void shouldFindAllPosts() throws Exception {

        mockMvc.perform(get("/api/posts"))
                .andExpect(status().isOk());
    }

}
