package com.project.baseballCommunity.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String userName;

    private String password;

    private String email;

    private String nickName;

    @OneToMany(mappedBy = "member")
    private List<Comment> commentList;

    @OneToMany(mappedBy = "member")
    private List<Post> postList;
}
