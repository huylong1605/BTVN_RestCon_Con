package com.example.btvn_con_restcon.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Controllers")
public class Register {

    @GetMapping("/form")
    public String showForm() {
        return "userForm";
    }

    @PostMapping ("/registers")
    public String RegisterUser(Model model,
                               @RequestParam(name = "name",required = false, defaultValue = "user") String userName,
                               @RequestParam(name = "pass",required = false, defaultValue = "pass") String password,
                               @RequestParam(name = "addr",required = false, defaultValue = "Addr") String address) {
        model.addAttribute("userName", userName);
        model.addAttribute("password", password);
        model.addAttribute("address", address);
        return "result";
    }
}
