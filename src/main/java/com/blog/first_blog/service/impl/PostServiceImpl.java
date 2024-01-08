package com.blog.first_blog.service.impl;

import com.blog.first_blog.entity.Post;
import com.blog.first_blog.payload.PostDto;
import com.blog.first_blog.repository.PostRepository;
import com.blog.first_blog.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = new Post();
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        post.setTitle(postDto.getTitle());
        Post savePost = postRepository.save(post);
        System.out.println(post.getTitle());

        PostDto dto = new PostDto();
        dto.setTitle(savePost.getTitle());
        dto.setDescription(savePost.getDescription());
        dto.setContent(savePost.getContent());
        return dto;
    }
}
