package com.example.pm_backend.Entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class EntityUser{

    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
   


      private String UserEmail;
    private String UserPassword;

    public EntityUser(){
    }

    public EntityUser(String UserEmail, String UserPassword){

        this.UserEmail = UserEmail;
        this.UserPassword = UserPassword;
    }

    //Getters e Setters

    public String GetEmail() {
        return UserEmail;
    }

    public void SetEmail(String UserEmail){
        this.UserEmail = UserEmail;
    }

    public String GetPassword() {
        return UserPassword;
    }

    public void SetPassword(String UserPassword){
        this.UserPassword = UserPassword;
    }
}