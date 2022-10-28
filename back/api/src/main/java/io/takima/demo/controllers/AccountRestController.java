package io.takima.demo.controllers;

import io.takima.demo.models.SignInFrom;
import io.takima.demo.models.SignupForm;
import io.takima.demo.models.Utilisateur;
import io.takima.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
public class AccountRestController {

    @Autowired
    private UserService userService;

    @PostMapping("/signin")
    public boolean login(@RequestBody SignInFrom signInFrom) {
        Utilisateur  utilisateur = this.userService.findUserByUserName(signInFrom.getEmail());
        if(signInFrom.getEmail().equals(utilisateur.getEmail()) && signInFrom.getPassword().equals(utilisateur.getPassword())) {
            return true;
        }
        return false;
    }

    @PostMapping("/utilisateur")
    public Utilisateur saveUser(@RequestBody Utilisateur utilisateur) {
        return userService.save(utilisateur);
    }

    @PostMapping("/signup")
    public Utilisateur register(@RequestBody SignupForm signupForm) {
        System.out.println(signupForm);
        if (!signupForm.getPassword().equals(signupForm.getRepassword())) {
            throw new RuntimeException("You must confirm your password");
        }
        Utilisateur user = userService.findUserByUserName(signupForm.getEmail());
        if (user != null) {
            throw new RuntimeException("This User already exists");
        }

        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setPrenom(signupForm.getPrenom());
        utilisateur.setNom(signupForm.getNom());
        utilisateur.setDateNaissance(signupForm.getDateNaissance());
        utilisateur.setTelephone(signupForm.getTelephone());
        utilisateur.setAdresse(signupForm.getAdresse());
        utilisateur.setDescription(signupForm.getDescription());
        utilisateur.setEmail(signupForm.getEmail());
        utilisateur.setPassword(signupForm.getPassword());
        userService.save(utilisateur);
        return utilisateur;
    }
}
