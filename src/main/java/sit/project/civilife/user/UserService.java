//package sit.project.civilife.user;
//
//import lombok.AllArgsConstructor;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//import sit.project.civilife.signup.Token;
//import sit.project.civilife.signup.TokenService;
//
//import java.time.LocalDateTime;
//import java.util.UUID;
//
//@Service
//@AllArgsConstructor
//public class UserService implements UserDetailsService {
//
//    private final static String USER_NOT_FOUND = "Email %s not found";
//    private final UserRepository userRepository;
//    private final BCryptPasswordEncoder bCryptPasswordEncoder;
//    private final TokenService tokenService;
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        return userRepository.findByEmail(email)
//                .orElseThrow(() -> new UsernameNotFoundException(String.format(USER_NOT_FOUND, email)));
//    }
//
//    public String signUpUser(User user) {
//        boolean userExists = userRepository.findByEmail(user.getEmail()).isPresent();
//
//        if(userExists) {
//            throw new IllegalStateException("Email already exist!");
//        }
//
//        String encodedPassword = bCryptPasswordEncoder.encode(user.getPassword());
//        user.setPassword(encodedPassword);
//        userRepository.save(user);
//
//        String uuidToken = UUID.randomUUID().toString();
//
//        Token token = new Token(
//                uuidToken,
//                LocalDateTime.now(),
//                LocalDateTime.now().plusMinutes(15),
//                user
//        );
//
//        tokenService.saveToken(token);
//
//        return uuidToken;
//    }
//}
