package com.poogle.board.controller.post;

import com.poogle.board.model.post.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;

@Builder
@AllArgsConstructor
@Getter
public class PostRequest {

    @NotEmpty
    private String title;

    @NotEmpty
    private String content;

    @NotEmpty
    private String writer;

    protected PostRequest() {
    }

    public Post newPost() {
        return Post.of(title, content, writer);
    }
}
