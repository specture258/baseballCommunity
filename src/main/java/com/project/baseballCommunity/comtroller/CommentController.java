package com.project.baseballCommunity.comtroller;

import com.project.baseballCommunity.domain.Comment;
import com.project.baseballCommunity.domain.Post;
import com.project.baseballCommunity.service.CommentService;
import com.project.baseballCommunity.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;
    private final PostService postService;


    @PostMapping("/baseball/freeboard/{id}")
    public String addComment(@PathVariable("id") Long id, @ModelAttribute Comment comment) {
        commentService.createComment(comment.getContent(), id);
        return  String.format("redirect:/baseball/freeboard/%d", id);
    }


}
