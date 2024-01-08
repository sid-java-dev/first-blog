package com.blog.first_blog.service;

import com.blog.first_blog.payload.PostDto;

public interface PostService {
    PostDto createPost(PostDto postDto);
}
