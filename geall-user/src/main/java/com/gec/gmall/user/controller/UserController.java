package com.gec.gmall.user.controller;

import com.gec.gmall.user.bean.UmsMember;
import com.gec.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    //输出json格式
    @ResponseBody
    public String demo1(){
        List<UmsMember> umsMembers = userService.selectAllUser();
        for (UmsMember umsMember : umsMembers) {
            System.out.println(umsMember);
        }
        return umsMembers.get(1).toString();
    }
}
