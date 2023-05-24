package com.example.chaeumapi.controller;

import com.example.chaeumapi.mapper.UsersMapper;
import com.example.chaeumapi.model.UsersProfile;
import org.springframework.web.bind.annotation.*;



import java.sql.Date;
import java.util.List;


@RestController
public class UsersController {

    private UsersMapper mapper;

    public UsersController(UsersMapper mapper){
        this.mapper = mapper;
    }

    @GetMapping("/user/{c_id}")
    public UsersProfile getUsers(@PathVariable("c_id") String c_id){
        return mapper.getUsers(c_id);
    }

    @GetMapping("/user/all")
    public List<UsersProfile> getUsersList(){
        return mapper.getUsersList();
    }

    @PostMapping("/user/{c_id}")
    public void PostUsers(@RequestParam("c_name") String c_name, @PathVariable("c_id") String c_id,
                         @RequestParam("c_pw") String c_pw, @RequestParam("c_date") Date c_date){
        mapper.insertUsers(c_name, c_id, c_pw, c_date);
    }

    @PutMapping("/user/{c_id}")
    public void putUsers(@RequestParam("c_name") String c_name, @PathVariable("c_id") String c_id,
                          @RequestParam("c_pw") String c_pw, @RequestParam("c_date") Date c_date){
        mapper.updateUsers(c_name, c_id, c_pw, c_date);
    }

    @DeleteMapping("/user/{c_id}")
    public void deleteUsers(@PathVariable("c_id") String c_id){
        mapper.deleteUsers(c_id);
    }

}
