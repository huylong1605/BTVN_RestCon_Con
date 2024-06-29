package com.example.btvn_con_restcon.service.implement;

import com.example.btvn_con_restcon.service.TodoService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class todoServiceImplement2 implements TodoService {

    public static final List<String> todo  =  new ArrayList();
    @Override

    public List<String> addAction(String action) {
        todo.add("haha");
        todo.add(action);
        return todo;
    }
}
