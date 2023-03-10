package com.neuedu.comtroller;

import com.neuedu.comtroller.utils.R;
import com.neuedu.entity.User;
import com.neuedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping("/login")
    public R login(@RequestBody User user){
        R r;
        try {
            r = R.success(userService.login(user));
        }catch (Exception e){
            r = R.fail(e.getMessage());
        }
        return r;
    }


}
