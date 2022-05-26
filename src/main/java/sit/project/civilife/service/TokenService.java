package sit.project.civilife.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import sit.project.civilife.models.User;

import java.util.Date;

@Service
public class TokenService {

    @Value("#{${civilife.max-token-interval-hour}*60*60*1000}")
    private long JWT_TOKEN_VALIDITY;

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.issuer-uri}")
    private String issuer;

    private Algorithm algorithm() {
        return Algorithm.HMAC256(secret);
    }

    public String tokenize(User user) {

        Date expireAt = new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY);

        String token = JWT.create()
                .withIssuer(issuer)
                .withClaim("principal", user.getUserId())
                .withClaim("role", "USER")
                .withExpiresAt(expireAt)
                .sign(algorithm());
        return token;
    }

    public DecodedJWT verify(String token) {
        try {
            JWTVerifier verifier = JWT.require(algorithm())
                    .withIssuer(issuer)
                    .build();
            DecodedJWT decodedJWT = verifier.verify(token);
            return decodedJWT;

        } catch (Exception e) {
            return null;
        }

    }
}
