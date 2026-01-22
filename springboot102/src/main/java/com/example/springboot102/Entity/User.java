package com.example.springboot102.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String name;
    public int age;
    public String phonenom;

    public User(){
        this.id=id;
        this.name=name;
        this.age=age;
        this.phonenom=phonenom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getPhonenom() {
        return phonenom;
    }

    public void setPhonenom(String phonenom) {
        this.phonenom = phonenom;
    }
}
