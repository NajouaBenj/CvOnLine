package io.takima.demo.service;


import io.takima.demo.models.Utilisateur;

public interface UserService {
   Utilisateur save(Utilisateur utilisateur);

   void deleteUser(Long idu);

   void updateUser(Long idu, Utilisateur utilisateur);

    Utilisateur addUser(Utilisateur utilisateur);

    Utilisateur findUserByUserName(String email);
}
