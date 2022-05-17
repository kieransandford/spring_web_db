package com.example.spring_web_db.service;

import com.example.spring_web_db.model.Hobbit;
import com.example.spring_web_db.repository.HobbitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HobbitService {

    @Autowired
    private HobbitRepository hobbitRepository;

    public List<Hobbit> getAll(){
        return hobbitRepository.findAll();
    }

    public Hobbit save(Hobbit hobbit) {
        return hobbitRepository.save(hobbit);
    }
}
