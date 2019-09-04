package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloSpringBoot {
    @RequestMapping("/hello")
    public ModelAndView printWord(ModelAndView mode){
        System.out.println("hello");
        mode.addObject("name","huzhili");
        mode.setViewName("redirect:/test");
        return mode;
    }
}
