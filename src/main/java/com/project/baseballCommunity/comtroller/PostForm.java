package com.project.baseballCommunity.comtroller;

import lombok.Getter;

@Getter
public class PostForm {

    protected PostForm() {
    }

    public PostForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    private Long id;

    private String title;

    private String content;

}
