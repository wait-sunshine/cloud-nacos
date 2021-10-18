package com.it.zhou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ZYH
 * @date 2021/10/18 14:47
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MainCloud01 {
    public static void main(String[] args){
        SpringApplication.run(MainCloud01.class,args);
    }
}
