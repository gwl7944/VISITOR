package com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


/**
 * @ProjectName: VISITOR
 * @Package: com.web
 * @ClassName: VisitorGo
 * @Author: gwl
 * @Description:
 * @Date: 2021/1/5 19:03
 * @Version: 1.0
 */
@SpringBootApplication
@ServletComponentScan
public class VisitorGo {

        public static void main(String[] args) {
                SpringApplication.run(VisitorGo.class,args);
        }
}
