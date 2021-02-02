package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gujiachun
 */
@RestController
public class DemoController {

    @GetMapping("/test1")
    public  String getTest1(){
        String result="";
        int sum=0;
        for (int i=0;i<100;i++){
            sum += i;
        }
        result = "0～99相加总和：" + sum;

        return result;
    }
}
