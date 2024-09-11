package com.project.baseballCommunity.comtroller;

import com.project.baseballCommunity.domain.Comment;
import com.project.baseballCommunity.domain.Post;
import com.project.baseballCommunity.service.CommentService;
import com.project.baseballCommunity.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    private final CommentService commentService;

    @GetMapping("/baseball/freeboard")
    public String getAllPosts(Model model){
        List<Post> posts = postService.getAllPosts();
        model.addAttribute("posts", posts );
        return "freeboard/board";
    }

    @GetMapping("/baseball/freeboard/register")
    public String getPostForm(Model model){
        model.addAttribute("postForm", new PostForm());
        return "freeboard/register";
    }

    @PostMapping("/baseball/freeboard/register")
    public String createPostForm(@ModelAttribute PostForm postForm){
        postService.createPost(postForm.getTitle(), postForm.getContent());
        return "redirect:/baseball/freeboard";
    }

    @GetMapping("/baseball/freeboard/{id}")
    public String postDetail(@PathVariable Long id, Model model, Comment comment){
        Post post = postService.getPostById(id);
        model.addAttribute("post", post);
        model.addAttribute("comment", comment);
        return "freeboard/postDetail";
    }






}
