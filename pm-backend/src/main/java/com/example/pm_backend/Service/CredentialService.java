package com.example.pm_backend.Service;

import com.example.pm_backend.Entitys.EntityCredential;
import com.example.pm_backend.Repository.CredentialRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CredentialService {
    private final CredentialRepository credentialRepository;

    public CredentialService(CredentialRepository credentialRepository){
    this.credentialRepository = credentialRepository;
    }    
    public List<EntityCredential> findALL() {
        return credentialRepository.findAll(); 
    }
    public EntityCredential findById(Long id){
        return credentialRepository.findById(id).orElse(null);
    }
    public EntityCredential save(EntityCredential credential){
        return credentialRepository.save(credential);
       }
    public void delete(Long id){
        credentialRepository.deleteById(id); 
    }
}

