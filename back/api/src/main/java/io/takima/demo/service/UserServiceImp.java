package io.takima.demo.service;

import io.takima.demo.Repository.UserRepository;
import io.takima.demo.models.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImp implements UserService{

    @Autowired
    public UserRepository userRepository;

    @Override
    public Utilisateur save(Utilisateur utilisateur) {
        userRepository.save(utilisateur);
        return utilisateur;
    }

    @Override
    public void deleteUser(Long idu) {
        userRepository.deleteById(idu);

    }


        @Override
        public void updateUser(Long idu, Utilisateur utilisateur) {
            userRepository.deleteById(idu);
            utilisateur.setIdu(idu);
            userRepository.save(utilisateur);

        }

    @Override
    public Utilisateur addUser(Utilisateur utilisateur) {
        return userRepository.save(utilisateur);
    }

    @Override
    public Utilisateur findUserByUserName(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }
}
