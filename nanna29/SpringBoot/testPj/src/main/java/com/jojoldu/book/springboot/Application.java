package com.jojoldu.book.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing //삭제
@SpringBootApplication
public class Application {
    public static void main(String[] args){

        SpringApplication.run(Application.class, args);
    }
}
