package sit.project.civilife.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sit.project.civilife.exception.BaseException;
import sit.project.civilife.models.LoginRequest;
import sit.project.civilife.models.SignupRequest;
import sit.project.civilife.models.User;
import sit.project.civilife.controllers.UserController;

@RestController
@RequestMapping("/api")
public class BaseApi {

    private final UserController userController;

    public BaseApi(UserController userController) {
        this.userController = userController;
    }

    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody SignupRequest signupRequest) throws BaseException {
        User response = userController.signup(signupRequest);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) throws BaseException {
        String response = userController.login(loginRequest);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/refresh-token")
    public ResponseEntity<String> refreshToken() throws BaseException {
        String response = userController.refreshToken();
        return ResponseEntity.ok(response);
    }


}
