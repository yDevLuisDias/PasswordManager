package com.example.pm_backend.Entitys;
//package com.example.pm_backend;

import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SecurePassword {
    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private Long id;

    private String GeneratedPassword;
    private String EncryptedPassword;

    public SecurePassword(){
    }

    public SecurePassword(String GeneratedPassword, String EncryptedPassword){
        this.GeneratedPassword = GeneratedPassword;
        this.EncryptedPassword = EncryptedPassword;
    }

    //Getters e setters

    public GetGenerated(){
        return GeneratedPassword;
    }
    public void SetGenerated(String GeneratedPassword){
        this.GeneratedPassword = GeneratedPassword;
    }

    public GetEncrypted(){
        return EncryptedPassword;
    }
    public void SetEncrypted(String EncryptedPassword){
        this.EncryptedPassword = EncryptedPassword;
    }
}
