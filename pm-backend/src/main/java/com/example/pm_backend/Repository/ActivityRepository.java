package com.example.pm_backend.Repository;

import com.example.pm_backend.Entitys.EntityActivityLog;
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<EntityActivityLog, Long>{
    EntityActivityLog findByPasswordHistory(String PasswordHistory);
    EntityActivityLog findByUserHistory(String UserHistory);
}
