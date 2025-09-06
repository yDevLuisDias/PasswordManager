package com.example.pm_backend.Service;

import com.example.pm_backend.Entitys.SecurePassword;
import com.example.pm_backend.Repository.PasswordRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PasswordService {
    public final PasswordRepository passwordRepository;

    public PasswordService(PasswordRepository passwordRepository){
        this.passwordRepository = passwordRepository;
    }

    public List<SecurePassword> findALL(){
        return passwordRepository.findAll();
    }
    public SecurePassword findById(Long id){
        return passwordRepository.findById(id).orElse(null);
    }
    public SecurePassword save(SecurePassword securePassword){
        return passwordRepository.save(securePassword);
    }
    public void delete(Long id){
        passwordRepository.deleteById(id);
    }


    
}
