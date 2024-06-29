package com.example.btvn_con_restcon.Controller;

import com.example.btvn_con_restcon.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Controllers")
public class Register {

    private final TodoService todoService;

    @Autowired
    public Register(@Qualifier("todoServiceImplement2") TodoService todoService) {
        this.todoService = todoService;
    }


    @GetMapping("/form")
    public String showForm() {
        return "userForm";
    }

    @PostMapping("/registers")
    public String RegisterUser(Model model, @RequestParam(name = "name", required = false, defaultValue = "user") String userName) {

        model.addAttribute("user", todoService.addAction(userName));

        return "userForm";
    }


}
