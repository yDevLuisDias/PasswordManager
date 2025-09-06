package com.example.pm_backend.Repository;

import com.example.pm_backend.Entitys.SecurePassword;
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordRepository extends JpaRepository<SecurePassword, Long> {
    SecurePassword findByGeneratedPassword(String GeneretatedPassword);
    SecurePassword findByEncryptedPassword(String EncryptedPassword);  
}
