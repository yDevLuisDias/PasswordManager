package com.example.pm_backend;
package com.example.pm_backend.Entitys;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EntityUser{

    @Id
    private String UserEmail;
    private String UserPassword;

    public EntityUserUser(){
    }

    public EntityUserUser(String UserEmail, String UserPassword){

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