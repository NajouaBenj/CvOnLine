package io.takima.demo.Repository;
import io.takima.demo.models.Cv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface CvRepository extends JpaRepository<Cv, Long> {
}
