package com.example.btvn_con_restcon.RestController;

import com.example.btvn_con_restcon.Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/RestCon/User")
public class RestUser {
  /*  @GetMapping("/ListUser")
    public List<User> ListUser() {
        List<User> u = new ArrayList<>();
        u.add(new User("Huy Long", 1605, "Ha Noi"));
        u.add(new User("Huy Thang", 0504, "Ha Noi"));
        return u;
    }*/
}

