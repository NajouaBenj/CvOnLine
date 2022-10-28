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
public class Project implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idp;
    @Column
    private String title;
    @Column
    private String startDateP;

    @Column
    private String endDateP;
    @Column
    private String descriptionP;
   /* @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "projets")
    private   Cv cv;
    public void setCv(Cv cv) {
        this.cv = cv;
    }*/

    public Long getIdp() {
        return idp;
    }

    public void setIdp(Long idp) {
        this.idp = idp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDateP() {
        return startDateP;
    }

    public void setStartDateP(String startDateP) {
        this.startDateP = startDateP;
    }

    public String getEndDateP() {
        return endDateP;
    }

    public void setEndDateP(String endDateP) {
        this.endDateP = endDateP;
    }

    public String getDescriptionP() {
        return descriptionP;
    }

    public void setDescriptionP(String descriptionP) {
        this.descriptionP = descriptionP;
    }


}
