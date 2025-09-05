package com.example.pm_backend.Repository;

import com.example.pm_backend.Entitys.EntityCredential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialRepository extends JpaRepository<EntityCredential, Long>{
    
}