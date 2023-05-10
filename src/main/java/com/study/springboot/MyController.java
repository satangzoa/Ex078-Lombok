package com.study.springboot;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping("/")
    public @ResponseBody String root() throws Exception{
        return "Lombok 사용하기";
    }
 
    @RequestMapping("/test3")///test3?id=바&name=나나 url에 넣어준다
    public String test1(Member member, Model model)
    {
    	System.out.println(member);
        return "test3";       
    }

}
