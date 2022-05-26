package sit.project.civilife.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.project.civilife.models.Gamecharacter;

public interface GamecharacterRepository extends JpaRepository<Gamecharacter, Long> {
}
