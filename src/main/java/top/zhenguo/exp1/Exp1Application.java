package top.zhenguo.exp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Exp1Application {

    public static void main(String[] args) {
        SpringApplication.run(Exp1Application.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

}
