package com.project.baseballCommunity.service;

import com.project.baseballCommunity.domain.Post;
import com.project.baseballCommunity.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public void savePost(Post post) {
        postRepository.save(post);
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post getPostById(Long id) {
        return postRepository.findById(id);
    }

    public void createPost(String title, String content) {
        Post post = new Post(title, content);
        savePost(post);
    }



}
