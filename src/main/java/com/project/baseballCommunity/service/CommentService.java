package com.project.baseballCommunity.service;

import com.project.baseballCommunity.domain.Comment;
import com.project.baseballCommunity.domain.Post;
import com.project.baseballCommunity.repository.CommentRepository;
import com.project.baseballCommunity.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    public void saveComment(Comment comment) {
        commentRepository.save(comment);
    }

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    public Comment getCommentById(Long id) {
        return commentRepository.findById(id);
    }

    public void createComment(String content, Long id){
        Post post = postRepository.findById(id);
        Comment comment = Comment.createComment(content, post);
        saveComment(comment);
    }


}
