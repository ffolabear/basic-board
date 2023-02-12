package com.study.board.domain;

public class Post {

    Long id;
    String author;
    String title;
    String content;

    public Post(Long id, String author, String title, String content) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.content = content;
    }
    
}
