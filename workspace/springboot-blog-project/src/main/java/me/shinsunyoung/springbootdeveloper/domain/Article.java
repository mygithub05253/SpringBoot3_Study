package me.shinsunyoung.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity // 엔터티로 지정
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {
    @Id // id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키를 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false) // title이라는 not null 컬럼과 매핑
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Builder // Builder 패턴으로 객체 생성
    // 객체를 유연하고 직관적으로 생성 가능
    // 어느 필드에 어떤 값이 들어가는 지 명시적으로 파악 가능
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // 블로그 글 수정 메서드
    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

//    // 기본 생성자
//    protected Article() {
//    }
//
//    // Getter
//    public Long getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getContent() {
//        return content;
//    }
}
