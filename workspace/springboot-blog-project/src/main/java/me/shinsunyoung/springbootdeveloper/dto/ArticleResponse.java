package me.shinsunyoung.springbootdeveloper.dto;

// 블로그 글 목록 조회 컨트롤러 메서드

import lombok.Getter;
import me.shinsunyoung.springbootdeveloper.domain.Article;

@Getter
public class ArticleResponse {
    private final String title;
    private final String content;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
