package sit.project.civilife.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sit.project.civilife.models.Characters;

public interface CharacterRepository extends JpaRepository<Characters, Long> {

}
