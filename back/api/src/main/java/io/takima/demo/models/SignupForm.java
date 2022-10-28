package io.takima.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignupForm {

        private String prenom;
        private String nom;
        private String dateNaissance;
        private String email;
        private String telephone;
        private String adresse;
        private String description;
        private String password;
        private String repassword;
}
