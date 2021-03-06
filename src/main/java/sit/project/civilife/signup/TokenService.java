//package sit.project.civilife.signup;
//
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@AllArgsConstructor
//public class TokenService {
//
//    private final TokenRepository tokenRepository;
//
//    public void saveToken(Token token) {
//        tokenRepository.save(token);
//    }
//
//    public Optional<Token> getToken(String token) {
//        return tokenRepository.findByToken(token);
//    }
//
//    public int setConfirmedAt(String token) {
//        return tokenRepository.updateConfirmedAt(
//                token, LocalDateTime.now());
//    }
//}
