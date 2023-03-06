package com.study.board.service;

import com.study.board.domain.Post;
import com.study.board.repository.PostRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository){
        this.postRepository = postRepository;
    }

    public List<Post> showAllPost(){
        return postRepository.findAllPost();
    }

    public Post postDetail(Long postId) {
        return postRepository.findPost(postId);
    }

    public Post addPost(Post post) {
        return postRepository.save(post);
    }

    public void editPost(Long postId, Post post) {
        postRepository.updatePost(postId, post);
    }

    public void deletePost(Long postId) {
        postRepository.deletePost(postId);
    }

    @PostConstruct
    private void init() {
        postRepository.save(new Post("AAA", "java", "This is java"));
        postRepository.save(new Post("BBB", "python", "This is python"));
        postRepository.save(new Post("CCC", "javascript", "This is javascript"));
        postRepository.save(new Post("DDD", "docker", "This is docker"));
    }

}
