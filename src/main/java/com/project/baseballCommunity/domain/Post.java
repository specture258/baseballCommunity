package com.project.baseballCommunity.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Post {

    protected Post(){

    }

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Id @GeneratedValue
    @Column(name = "post_id")
    private Long id;

    private String title;

    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Comment> comment;

    public void update(String title, String content) {
       setTitle(title);
       setContent(content);
    }
}
