package com.example.demo.Controller;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Task {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    long order;
    private String description;
    private String status;

    public Task(long order, String description, String status){
        this.order = order;
        this.description = description;
        this.status = status;
    }




}
