package sit.project.civilife.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.project.civilife.models.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
