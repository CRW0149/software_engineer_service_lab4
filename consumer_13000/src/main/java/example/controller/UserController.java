package example.controller;


import example.entity.Result;
import example.entity.User;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @GetMapping("getUserById")
    public Result<User> getUserById(@RequestParam(name = "userId")Integer userId){
        User user=new User("陈汝卫",userId,21);
        return Result.success(user,"消费者13000" );
    }
}
