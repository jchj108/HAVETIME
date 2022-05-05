package com.ch.freetime.web;


import com.ch.freetime.com.ch.freetime.service.posts.PostsService;
import com.ch.freetime.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    /*
        생성자 주입
        final이 선언된 모든 필드를 인자값으로 하는 생성자를
        롬복의 @RequiredArgsConstructor가 대신 생성해준다.
     */
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }
}
