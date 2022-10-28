package io.takima.demo.controllers;

import io.takima.demo.Repository.CvRepository;
import io.takima.demo.models.Cv;
import io.takima.demo.models.Utilisateur;
import io.takima.demo.service.CvService;
import io.takima.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/cvs")
public class WebController {

    @Autowired
    private CvService cvService;
    @Autowired
    CvRepository cvRepository;
    @Autowired
    private UserService userService;

    @PostMapping("/mysave")
    public Utilisateur saveUser(@RequestBody Utilisateur utilisateur){
        return userService.save(utilisateur);
    }

    @DeleteMapping("/mydeleteUser/{idu}")
    public void deleteUser(@PathVariable Long idu) {
        userService.deleteUser(idu);
    }

    @PostMapping("/myaddUser")
    public Utilisateur addUser(@RequestBody Utilisateur utilisateur) {
        return userService.addUser(utilisateur);
    }

//////////////////// Cv Mapping Functions///////////////////////
    @GetMapping("/cvs")
    public ResponseEntity<List<Cv>> getAllCvs(@RequestParam(required = false) String prenom) {
        try {
            List<Cv> cvs = new ArrayList<Cv>();

            if (prenom == null)
               cvRepository.findAll().forEach(cvs::add);

            if (cvs.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(cvs, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/cvs/{id}")
    public ResponseEntity<Cv> getCvById(@PathVariable("id") long id) {
        Optional<Cv> cvData = cvRepository.findById(id);

        if (cvData.isPresent()) {
            return new ResponseEntity<>(cvData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/cvs")
    public void create(@RequestBody Cv cv) {
        cvService.save2(cv);
    }


   @DeleteMapping("/cvs/{id}")
    public ResponseEntity<HttpStatus> deleteCv(@PathVariable("id") long id) {
        try {
            cvRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/cvs")
    public ResponseEntity<HttpStatus> deleteAllCvs() {
        try {
            cvRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @PutMapping("/cvs/{id}")
    public ResponseEntity<Cv> updateCv(@PathVariable("id") long id, @RequestBody Cv cv) {
        Optional<Cv> cvData = cvRepository.findById(id);

        if (cvData.isPresent()) {
            Cv _cv = cvData.get();
            _cv.setPrenom(cv.getPrenom());
            _cv.setNom(cv.getNom());
            _cv.setDateNaissance(cv.getDateNaissance());
            _cv.setAdresse(cv.getAdresse());
            _cv.setDescription(cv.getDescription());
            _cv.setTelephone(cv.getTelephone());
            _cv.setEmail(cv.getEmail());
            _cv.setEducations(cv.getEducations());
            _cv.setExperiences(cv.getExperiences());
            _cv.setProjets(cv.getProjets());
            _cv.setReseauxSx(cv.getReseauxSx());
            _cv.setHobbies(cv.getHobbies());

            return new ResponseEntity<>(cvRepository.save(_cv), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
