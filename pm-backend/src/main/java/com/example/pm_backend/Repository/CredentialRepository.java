package com.example.pm_backend.Repository;

import com.example.pm_backend.Entitys.EntityCredential;
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialRepository extends JpaRepository<EntityCredential, Long>{

    EntityCredential findByEmail(String email);
    EntityCredential findByUser(String user);
    EntityCredential findByTitle(String title);
    EntityCredential findByUrl(String URL);
    EntityCredential findBySite(String site);
    EntityCredential findByPassword(String password);
} 