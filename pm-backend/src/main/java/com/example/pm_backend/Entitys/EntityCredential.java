package com.example.pm_backend.Entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class EntityCredential {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String url;
    private String user;
    private String password;
    private String site;
    private String email;

    public EntityCredential() { }

    public EntityCredential(String title, String url, String user, String password, String site, String email) {
        this.title = title;
        this.url = url;
        this.user = user;
        this.password = password;
        this.site = site;
        this.email = email;
    }

    // getters e setters
    public Long getId() {
         return id;
    }
    public void setId(Long id) {
        
        this.id = id; 
    }

    public String getTitle() { 
        return title;
    }
    public void setTitle(String title) { 
        this.title = title; 
    }

    public String getUrl() { 
        return url; 
    }
    public void setUrl(String url) { 
        this.url = url; 
    }

    public String getUser() {
         return user; 
        }
    public void setUser(String user){
         this.user = user; 
        }

    public String getPassword() {
        return password;
     }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getSite(){
        return site; 
    }
    public void setSite(String site) { this.site = site; }

    public String getEmail(){ 
        return email;
     }
    public void setEmail(String email) {
         this.email = email; 
    }
}
