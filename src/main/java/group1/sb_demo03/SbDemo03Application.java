package group1.sb_demo03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//添加扫描mybatis的dao层接口，生成实现类
@MapperScan(value = "group1.sb_demo03.dao")
public class SbDemo03Application {

    public static void main(String[] args) {
        SpringApplication.run(SbDemo03Application.class, args);
    }

}
