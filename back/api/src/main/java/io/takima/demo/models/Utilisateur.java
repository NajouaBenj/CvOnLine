package io.takima.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idu;
    @Column
    private String prenom;
    @Column
    private String nom;
    @Column
    private String  dateNaissance;
    @Column
    private String email;
    @Column
    private String telephone;
    @Column
    private String adresse;
    @Column
    private String description;

    @Column
    private String password;

    @Override
    public String toString() {
        return "Utilisateur{" +
                "idu=" + idu +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", adresse='" + adresse + '\'' +
                ", description='" + description + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utilisateur that = (Utilisateur) o;
        return Objects.equals(idu, that.idu) && Objects.equals(prenom, that.prenom) && Objects.equals(nom, that.nom) && Objects.equals(dateNaissance, that.dateNaissance) && Objects.equals(email, that.email) && Objects.equals(telephone, that.telephone) && Objects.equals(adresse, that.adresse) && Objects.equals(description, that.description) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idu, prenom, nom, dateNaissance, email, telephone, adresse, description, password);
    }



}
