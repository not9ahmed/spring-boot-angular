package com.notahmed.demo_app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {


    @Value("${my.message}")
    private String myMessage;

    @RequestMapping("/")
    @ResponseBody
    public String sayHello(){
        return "Hello from spring boot app updated";
    }


    @RequestMapping("/message")
    @ResponseBody
    public String showMessage(){
        return myMessage;
    }

}
