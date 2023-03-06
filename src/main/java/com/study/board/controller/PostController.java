package com.study.board.controller;

import com.study.board.domain.Post;
import com.study.board.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/board/posts")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public String showAllPost(Model model) {
        model.addAttribute("posts", postService.showAllPost());
        return "board/posts";
    }

    @GetMapping("/{postId}")
    public String postDetail(@PathVariable Long postId, Model model) {
        model.addAttribute("post", postService.postDetail(postId));
        return "board/post";
    }

    @GetMapping("add")
    public String addForm() {
        return "board/addForm";
    }

    @PostMapping("/add")
    public String addPost(Post post, RedirectAttributes redirectAttributes) {
        Post savedPost = postService.addPost(post);
        redirectAttributes.addAttribute("postId", savedPost.getId());
        redirectAttributes.addAttribute("status", true);
        return "redirect:/board/posts/{postId}";
    }

    @GetMapping("/{postId}/edit")
    public String editForm(@PathVariable Long postId, Model model) {
        Post post = postService.postDetail(postId);
        model.addAttribute("post", post);
        return "board/editForm";
    }

    @PostMapping("/{postId}/edit")
    public String editPost(@PathVariable Long postId, @ModelAttribute Post post) {
        postService.editPost(postId, post);
        return "redirect:/board/posts/{postId}";
    }

    @GetMapping("/{postId}/delete")
    public String deletePost(@PathVariable Long postId) {
        postService.deletePost(postId);
        return "board/posts";
    }


}
