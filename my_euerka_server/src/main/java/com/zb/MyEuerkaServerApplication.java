package com.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
//张三丰123
//王玉鹏
public class MyEuerkaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyEuerkaServerApplication.class, args);
    }

}
