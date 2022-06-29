package com.lyj.exam1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api") // 브라우저 요청
public class UserController { // 브라우저의 요청에 반응
    @RequestMapping("/users")
    @ResponseBody
    public String users(){
        return "HI";
    }
}
