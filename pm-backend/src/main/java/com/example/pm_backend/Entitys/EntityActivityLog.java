package com.example.pm_backend;
package com.example.pm_backend.Entitys;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EntityActivityLog {


     @Id
     @GeneratedValue(Strategy = GenerationType.IDENTITY)
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