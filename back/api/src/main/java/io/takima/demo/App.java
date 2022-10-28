package io.takima.demo;

import io.takima.demo.Repository.CvRepository;
import io.takima.demo.models.Experience;
import io.takima.demo.models.Utilisateur;
import io.takima.demo.service.CvService;
import io.takima.demo.service.UserService;
import io.takima.demo.models.Cv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class App implements CommandLineRunner, RepositoryRestConfigurer {

    @Autowired
    private CvService cvService;

    @Autowired
    private CvRepository cvRepository;

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        // Initialize spring
        new SpringApplicationBuilder(App.class).run(args);
    }

    //@Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Cv.class);
        config.exposeIdsFor(Utilisateur.class);
    }


    @Override
    public void run(String... args) throws Exception {
       /* Cv cv = new Cv();
        cv.setPrenom("toto");
        cv.setNom("toto");
        cv.setTelephone("toto");
        cv.setDescription("toto");

        List<Experience> experiences = new ArrayList<>();
        Experience experience1 = new Experience();
        experience1.setTitle("titleexp1");
        experience1.setDescription("desc1");
        experiences.add(experience1);

        Experience experience2 = new Experience();
        experience2.setTitle("titleexp2");
        experience2.setDescription("desc2");
        experiences.add(experience2);

        cv.setExperiences(experiences);

        cvRepository.save(cv);*/
    }
}
