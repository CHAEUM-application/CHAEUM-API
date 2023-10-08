package com.example.chaeumapi.controller;

import com.example.chaeumapi.mapper.TodoMapper;
import com.example.chaeumapi.model.TodoProfile;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    private TodoMapper mapper;

    public TodoController(TodoMapper mapper) { this.mapper = mapper; }

    @GetMapping("/todo/{id}")
    public List<TodoProfile> getTodo(@PathVariable("id") String id) {return mapper.getTodo(id);}

    @GetMapping("/todo/all")
    public List<TodoProfile> getTodoList() { return mapper.getTodoList();}

    @PostMapping("/todo/{id}")
    public void PostTodo(@PathVariable("id") String id, @RequestParam("year") String year,
                         @RequestParam("month") String month, @RequestParam("week") String week,
                         @RequestParam("text") String text, @RequestParam("status") int status, @RequestParam("feel") int feel){
        mapper.insertTodo(id, year, month, week, text, status, feel);
    }

    @PutMapping("/todo/{id}")
    public int PutTodo(@PathVariable("id") String id, @RequestParam("year") String year,
                         @RequestParam("month") String month, @RequestParam("week") String week,
                         @RequestParam("req_text") String req_text, @RequestParam("res_text") String res_text,
                        @RequestParam("status") int status) {
        if (status < 0) {
            return mapper.updateTodo(id, year, month, week, req_text, res_text);
        }
        else{
            return mapper.updateStatus(id, year, month, week, res_text, status);
        }
    }


    @DeleteMapping("/todo/{id}/{year}/{month}/{week}/{text}")
    public void deleteTodo(
            @PathVariable("id") String id, @PathVariable("year") String year,
            @PathVariable("month") String month, @PathVariable("week") String week,
            @PathVariable("text") String text) {
        mapper.deleteTodo(id, year, month, week, text);
    }
}
