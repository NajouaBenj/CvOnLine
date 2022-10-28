package io.takima.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Education implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ide;
    @Column
    private String ecole;
    @Column
    private String diplome;
    @Column
    private String  locationE;
    @Column
    private String startDateE;
    @Column
    private String endDateE;
    @Column
    private String descriptionE;
   /* @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "educations")
private Cv cv;

    public void setCv(Cv cv) {
        this.cv = cv;
    }*/

    public Long getIde() {
        return ide;
    }

    public void setIde(Long ide) {
        this.ide = ide;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public String getLocationE() {
        return locationE;
    }

    public void setLocationE(String locationE) {
        this.locationE = locationE;
    }

    public String getStartDateE() {
        return startDateE;
    }

    public void setStartDateE(String startDateE) {
        this.startDateE = startDateE;
    }

    public String getEndDateE() {
        return endDateE;
    }

    public void setEndDateE(String endDateE) {
        this.endDateE = endDateE;
    }

    public String getDescriptionE() {
        return descriptionE;
    }

    public void setDescriptionE(String descriptionE) {
        this.descriptionE = descriptionE;
    }


}
