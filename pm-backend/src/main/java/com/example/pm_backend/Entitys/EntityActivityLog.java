package com.example.pm_backend.Entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class EntityActivityLog {


     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     String PasswordHistory;
     String UserHistory;


            
    public EntityActivityLog(){
    }

    public EntityActivityLog(String PasswordHistory, String UserHistory){

        this.PasswordHistory = PasswordHistory;
        this.UserHistory = UserHistory;
    }

    public String GetPassword(){
        return PasswordHistory;
    }

    public void SetPassword(String PasswordHistory){
        this.PasswordHistory = PasswordHistory;
    }

    public String GetUser(){
        return UserHistory;
    }

    public void SetUser(String UserHistory){
        this.UserHistory = UserHistory;
    }
}