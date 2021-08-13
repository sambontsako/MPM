package com.mpm.services;

import com.mpm.entities.user.User;
import com.mpm.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long id){
        return userRepository.getById(id);
    }

    public Optional<User> getUserByEmail(String email){
       return userRepository.findByEmail(email);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public void addNewUser(User user) {

        Optional<User> userOptional = userRepository.findByEmail(user.getEmail());
        if(userOptional.isPresent()){
            throw new IllegalStateException("Email taken");
        }
        userRepository.save(user);
    }

    public void deleteUser(Long userId) {
        if(!userRepository.existsById(userId)){
            throw new IllegalStateException("User with id " + userId + " does not exist");
        }
        userRepository.deleteById(userId);
    }

    @Transactional
    public void updateUser(Long userId, String name, String surname, String email) {
        com.mpm.entities.user.User user = userRepository.findById(userId).
                orElseThrow(() -> new IllegalStateException("User with id " + userId + " does not exist"));

        if(name != null && name.length() > 0 && Objects.equals(user.getName(), name)){
            user.setName(name);
        }

        if(surname != null && surname.length() > 0 && Objects.equals(user.getSurname(), surname)){
            user.setSurname(surname);
        }

        if(email != null && email.length() > 0 && Objects.equals(user.getEmail(), email)){
            Optional<User> userOptional = userRepository.findByEmail(user.getEmail());
            if(userOptional.isPresent()){
                throw new IllegalStateException("Email taken");
            }
            user.setEmail(email);
        }
        //userRepository.saveAll()
    }
}
