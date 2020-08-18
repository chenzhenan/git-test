package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//声明该类是个SpringBoot引导类
@SpringBootApplication
public class MySpringBootApplication {
    //main是Java程序的入口
    public static void main(String[] args) {
        //run方法 表示运行springboot的引导类，run参数就是springboot的引导类的字节码对象
        SpringApplication.run(MySpringBootApplication.class);
    }

}
