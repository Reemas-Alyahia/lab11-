package com.example.lab11.Controller;

import com.example.lab11.ApiResponce.ApiResponce;
import com.example.lab11.Model.Post;
import com.example.lab11.Model.User;
import com.example.lab11.Service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/post")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
//
//
//    @PostMapping("/add")
//    public ResponseEntity addPost(@RequestBody @Valid Post post, Errors errors){
//        if(errors.hasErrors()){
//            return ResponseEntity.status(400).body(errors.getFieldError().getDefaultMessage());
//        }
//        postService.addPost(post);
//        return ResponseEntity.status(200).body(new ApiResponce("Post Added"));
//    }
//
//    @PutMapping("/update/{id}")
//    public ResponseEntity updatePost(@PathVariable Integer id,@RequestBody @Valid Post post,Errors errors){
//        if(errors.hasErrors()){
//            return ResponseEntity.status(400).body(errors.getFieldError().getDefaultMessage());
//        }
//       postService.updatePost(post,id);
//        return ResponseEntity.status(200).body(new ApiResponce("Post updated"));
//    }
//
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity deletePost(@PathVariable Integer id){
//       postService.deletePost(id);
//        return ResponseEntity.status(200).body(new ApiResponce("post Deleted"));
//    }



}
