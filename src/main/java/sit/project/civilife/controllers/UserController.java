package sit.project.civilife.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import sit.project.civilife.config.token.TokenSecurityUtil;
import sit.project.civilife.exception.BaseException;
import sit.project.civilife.exception.UserException;
import sit.project.civilife.models.LoginRequest;
import sit.project.civilife.models.SignupRequest;
import sit.project.civilife.models.User;
import sit.project.civilife.service.TokenService;
import sit.project.civilife.service.UserService;

import java.util.Optional;

@Service
public class UserController {

    private final UserService userService;

    private final TokenService tokenService;

    public UserController(UserService userService, TokenService tokenService) {
        this.userService = userService;
        this.tokenService = tokenService;
    }

    public String login(LoginRequest loginRequest) throws BaseException {
        Optional<User> findEmail = userService.findByEmail(loginRequest.getEmail());
        if (findEmail.isEmpty()) {
            //email does not exist
            throw UserException.loginEmailNotFound();
        }
        User user = findEmail.get();

        if (!userService.checkPassword(loginRequest.getPassword(), user.getPassword())) {
            throw UserException.loginPasswordIncorrect();
        }
        return tokenService.tokenize(user);
    }

    public String refreshToken() throws BaseException {
        //who is loging in
        Optional<Long> currentUserId = TokenSecurityUtil.getCurrentUserId();
        if(currentUserId.isEmpty()){
            throw UserException.userUnAuthorized();
        }

        Long requestUserId = currentUserId.get();

        Optional<User> findUserId = userService.findByUserId(requestUserId);
        if (findUserId.isEmpty()){
            throw UserException.userIdNotfound();
        }

        User user = findUserId.get();
        return tokenService.tokenize(user);
    }

    public User signup(SignupRequest signupRequest) throws BaseException {
        User newUser = userService.create(
                signupRequest.getUserId(),
                signupRequest.getFname(),
                signupRequest.getLname(),
                signupRequest.getAge(),
                signupRequest.getEmail(),
                signupRequest.getPassword()
        );
        return newUser;
    }
}
