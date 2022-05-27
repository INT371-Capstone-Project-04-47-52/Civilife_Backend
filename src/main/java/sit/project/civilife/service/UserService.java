package sit.project.civilife.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import sit.project.civilife.exception.BaseException;
import sit.project.civilife.exception.UserException;
import sit.project.civilife.models.User;
import sit.project.civilife.repositories.UserRepository;

import java.sql.Date;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Optional<User> findByUserId(Long userId) {
        return userRepository.findById(userId);
    }

    public boolean checkPassword(String rawPassword, String endcodePassword) {
        return passwordEncoder.matches(rawPassword, endcodePassword);
    }

    public User create(long userId,
                       String fname,
                       String lname,
                       Date birthday,
                       String email,
                       String password
    ) throws BaseException {

        if (Objects.isNull(email)) {
            throw UserException.createEmailNull();
        }

        if (Objects.isNull(password)) {
            throw UserException.createPasswordNull();
        }

        if (userRepository.existsById(userId)) {
            throw UserException.createUserIdExist();
        }

        if (userRepository.existsByEmail(email)) {
            throw UserException.creatEmailExist();
        }

        User newUser = new User();
        newUser.setUserId(userId);
        newUser.setFname(fname);
        newUser.setLname(lname);
        newUser.setBirthday(birthday);
        newUser.setEmail(email);
        newUser.setPassword(passwordEncoder.encode(password));

        return userRepository.save(newUser);
    }
}
