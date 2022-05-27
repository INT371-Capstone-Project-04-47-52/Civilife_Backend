package sit.project.civilife.api;

import org.springframework.web.bind.annotation.*;
import sit.project.civilife.exception.BaseException;
import sit.project.civilife.exception.UserException;
import sit.project.civilife.models.User;
import sit.project.civilife.repositories.UserRepository;

@RestController
@RequestMapping("/api/admin")
public class AdminApi {

    private final UserRepository userRepository;

    public AdminApi(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/max-userId")
    public long maxUserId() {
        return userRepository.getMaxUserId();
    }

    @GetMapping("/allUsers")
    public Iterable<User> allUsers() {
        return userRepository.findAll();
    }

    @DeleteMapping("/delete/user/{userId}")
    public void deleteUser(@PathVariable Long userId) throws BaseException {
        if (!userRepository.existsById(userId)) {
            throw UserException.userIdNotfound();
        } else
            userRepository.deleteById(userId);
    }

}
