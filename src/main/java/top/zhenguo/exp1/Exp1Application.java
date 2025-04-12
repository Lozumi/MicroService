package top.zhenguo.exp1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@MapperScan("top.zhenguo.exp1")
public class Exp1Application {

    public static void main(String[] args) {
        SpringApplication.run(Exp1Application.class, args);
    }

}
