package com.wwclr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangwu on 2019/3/4.
 */
@RestController("/ww")
public class helloController {

        @RequestMapping("/hello")
        public  Object  sayHello(){
                return  "hello springBoot";
        }
}
