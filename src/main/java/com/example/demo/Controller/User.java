package com.example.demo.Controller;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;



public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String UserName;
    @Column
    private String UserPassword;
   // @OneToMany(mappedBy = "User")
   // private List<Task> taskList = new ArrayList<>();

    public User( String UserName, String UserPassword){

        this.UserName = UserName;
        this.UserPassword = UserPassword;
    }


    public User() {
        // Default constructor
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setUserName(String UserName){
        this.UserName = UserName;
    }
    public String getUserName(){
        return this.UserName;
    }
    public void setUserPassWord(String UserName){
        this.UserPassword = UserPassword;
    }
    public String getUserPassword(){return this.UserPassword;}
//  public void addTask(Task task){
//        taskList.add(task);
//    }
//    public void showTask(){
//        for(int i = 0 ; i < taskList.size() ; i++){
//            System.out.println(taskList.get(i));
//        }
//    }
}
