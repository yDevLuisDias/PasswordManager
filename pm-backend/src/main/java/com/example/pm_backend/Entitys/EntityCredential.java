package com.example.pm_backend;
package com.example.pm_backend.Entitys;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EntityCredential{


        @Id
        @GenerateValue(Strategy = Generationtype.IDENTITY)
        private long id;

        private String title;
        private String url;
        private String user;
        private String password;
        private String site;
        private String email;
    
    public CredentialEntity(){
    }

    public CredentialEntity(String title, String url, String user, String password, String site, String email){
        this.title = title;
        this.url = url;
        this.user = user;
        this.password = password;
        this.site = site;
        this.email = email;
    }
    //getters e setters

    public getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public getUrl(){
        return url;
    }
    public void setUrl(String url){
        this.url = url;
    }

    public getUser(){
        return user;
    }
    public void setUser(String user){
        this.user = user;
    }

    public getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public getSite(){
        return site;
    }
    public void setSite(String site){
        this.site = site;
    }

    public getEmail(){
        return email;
    }
    public void setEmail(String Email){
        this.email = email;
    }
}