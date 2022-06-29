package com.lyj.exam1.user.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/users") // 브라우저 요청
public class UserController { // 브라우저의 요청에 반응
    @RequestMapping("")
    @ResponseBody
    public String users(){
        return "users :-))";
    }

    @RequestMapping("1")
    @ResponseBody
    public String user(){
        return "user :(";
    }
}
