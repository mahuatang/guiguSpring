package com2.test.guigu.ref;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserAction {

    public UserService22 userService;

    @Autowired
    public void setUserService(UserService22 userService) {
        this.userService = userService;
    }

    public void actionSave() {
        userService.serviceSave();
    }
}
