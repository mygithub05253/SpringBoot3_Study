package me.shinsunyoung.springbootdeveloper.dto;

// DTO : 계층끼리 데이터를 교환하기 위해 사용하는 객체
// 데이터를 단순하게 옮기기 위해 사용하는 전달자 역할 => 별도의 비즈니스 로직 포함 X

// 블로그 글 작성 메서드

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.shinsunyoung.springbootdeveloper.domain.Article;

@NoArgsConstructor // 기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Getter
public class AddArticleRequest {

    private String title;
    private String content;

    // 생성자를 이용해 객체 생성
    public Article toEntity() {
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}
