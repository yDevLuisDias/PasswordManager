package com.example.pm_backend.Entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class SecurePassword {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public String GetGenerated(){
        return GeneratedPassword;
    }
    public void SetGenerated(String GeneratedPassword){
        this.GeneratedPassword = GeneratedPassword;
    }

    public String GetEncrypted(){
        return EncryptedPassword;
    }
    public void SetEncrypted(String EncryptedPassword){
        this.EncryptedPassword = EncryptedPassword;
    }
}
