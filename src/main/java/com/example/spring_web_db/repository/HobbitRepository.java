package com.example.spring_web_db.repository;

import com.example.spring_web_db.model.Hobbit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbitRepository extends JpaRepository<Hobbit, Long> {
}
