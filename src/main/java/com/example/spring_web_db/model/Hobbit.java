package com.example.spring_web_db.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hobbit {
    @Id
    private Long id;
    private String name;
    private String lastName;

    public Hobbit(){

    }

    public Hobbit(Long id, String name, String lastName){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
