package com.example.btvn_con_restcon.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
public class todo {

    @GetMapping("/todo")
    public String Todo(Model model){
        List<String> list = new ArrayList<>();
        list.add("sang nay học Jsp");
        list.add("chieu nay hoc servlet");
        list.add("toi học Spring Boot");
        model.addAttribute("todoList", list);
        return "todo";
    }
}
