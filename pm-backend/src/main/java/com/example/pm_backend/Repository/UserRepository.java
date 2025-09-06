package com.example.pm_backend.Repository;

import com.example.pm_backend.Entitys.EntityUser;
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<EntityUser, Long>{
    EntityUser findByUserEmail(String UserEmail);
    EntityUser findByUserPassword(String UserPassword);
    
}
