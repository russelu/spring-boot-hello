package com.teacher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String welcome() {
        return "awesome, your first spring boot application here.";
    }

    @GetMapping("/msg/{content}")
    public Message showMsg(@PathVariable String content) {
        Message msg = new Message("hello", content);
        return msg;
    }
}
