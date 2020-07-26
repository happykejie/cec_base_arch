package cec.arch.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cec.arch.base.mapper")
public class CecArchBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CecArchBaseApplication.class, args);
    }

}
