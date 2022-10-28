package io.takima.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cvs")
public class Cv implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String prenom;
    @Column
    private String nom;
    @Column
    private String dateNaissance;
    @Column
    private String email;
    @Column
    private String telephone;
    @Column
    private String adresse;

    @Column
    private String description;

   /* @JsonIgnore
    @OneToMany(mappedBy = "cv",cascade = CascadeType.ALL)*/
   @OneToMany(cascade = CascadeType.PERSIST)
    private List<Experience> experiences = new ArrayList<>();

   /* @JsonIgnore
    @OneToMany(mappedBy = "cv",cascade = CascadeType.ALL)*/
   @OneToMany(cascade = CascadeType.PERSIST)
    private List<Education> educations = new ArrayList<>();

   /* @JsonIgnore
    @OneToMany(mappedBy = "cv",cascade = CascadeType.ALL)*/
   @OneToMany(cascade = CascadeType.PERSIST)
    private List<Hobby> hobbies = new ArrayList<>();
  /*  @JsonIgnore
    @OneToMany(mappedBy = "cv",cascade = CascadeType.ALL)*/

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Project> projets = new ArrayList<>();

/*    @JsonIgnore
    @OneToMany(mappedBy = "cv",cascade = CascadeType.ALL)*/

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<ReseauSociaux> reseauxSx = new ArrayList<>();


    public Cv(String nom, String prenom) {

    }

    public Cv(String nom, String prenom, String email, String dateNaissance, String adresse, String telephone, String description, List<Education> educations, List<Experience> experiences, List<ReseauSociaux> reseauxSx, List<Project> projets, List<Hobby> hobbies) {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    public List<Project> getProjets() {
        return projets;
    }

    public void setProjets(List<Project> projets) {
        this.projets = projets;
    }

    public List<ReseauSociaux> getReseauxSx() {
        return reseauxSx;
    }

    public void setReseauxSx(List<ReseauSociaux> reseauxSx) {
        this.reseauxSx = reseauxSx;
    }

    @Override
    public String toString() {
        return "Cv{" +
                "id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", adresse='" + adresse + '\'' +
                ", description='" + description + '\'' +
                ", experiences=" + experiences +
                ", educations=" + educations +
                ", hobbies=" + hobbies +
                ", projets=" + projets +
                ", reseauxSx=" + reseauxSx +
                '}';
    }

    public String getPrenom() {
        return prenom;
    }
}
