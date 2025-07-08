package me.shinsunyoung.springbootdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 모든 클래스의 메인 클래스

// SpringBootApplication : 스프링 부트 사용에 필요한 기본 설정을 해주는 애너테이션
@SpringBootApplication
public class SpringBootDeveloperApplication {
    public static void main(String[] args) {
        // 애플리케이션 실행 (첫 번째 인수 : 스프링부트3 메인 클래스, 두 번째 인수 : 커맨드 라인 인수)
        SpringApplication.run(SpringBootDeveloperApplication.class, args);
    }
}
