package com.spring.user_rating.Controller;

import com.spring.user_rating.Dto.Userdto;
import com.spring.user_rating.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public  String getUserLogin(@ModelAttribute Userdto userdto){
        return "index";
    }
}
