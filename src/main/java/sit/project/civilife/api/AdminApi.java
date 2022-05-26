package sit.project.civilife.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

}
