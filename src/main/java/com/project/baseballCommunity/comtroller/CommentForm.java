package com.project.baseballCommunity.comtroller;

import com.project.baseballCommunity.domain.Post;
import lombok.Getter;

@Getter
public class CommentForm {

    private String content;

    private Post post;
}
