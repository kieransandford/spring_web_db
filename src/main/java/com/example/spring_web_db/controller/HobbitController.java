package com.example.spring_web_db.controller;

import com.example.spring_web_db.model.Hobbit;
import com.example.spring_web_db.service.HobbitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HobbitController {

    @Autowired
    private HobbitService hobbitService;

    @GetMapping("/hobbits")
    public List<Hobbit> getAll(){
        return hobbitService.findAll();
    }

    @PostMapping("/hobbits")
    Hobbit post(@RequestBody Hobbit hobbit){
        return hobbitService.save(hobbit);
    }

}
