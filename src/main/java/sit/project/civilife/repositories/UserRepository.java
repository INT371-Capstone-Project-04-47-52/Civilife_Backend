package sit.project.civilife.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import sit.project.civilife.models.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {


    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);

    @Query(value = "SELECT max(userId) FROM User")
    Long getMaxUserId();
}
