package sit.project.civilife.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.project.civilife.models.Landmark;

public interface LandmarkRepository extends JpaRepository<Landmark, Long> {
}
