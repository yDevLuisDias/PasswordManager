package com.example.pm_backend.Service;

import com.example.pm_backend.Entitys.EntityUser;
import com.example.pm_backend.Repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    
    public List<EntityUser> findALL(){
        return userRepository.findAll();
    }
    public EntityUser findByid(Long id){
      return userRepository.findById(id).orElse(null);
    }
    public EntityUser save(EntityUser user){
        return userRepository.save(user);
    }
    public void delete(Long id){
        userRepository.deleteById(id);
    }
}