//package sit.project.civilife.signup;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import sit.project.civilife.user.User;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@Getter
//@Setter
//@NoArgsConstructor
////@Entity
//public class Token {
//
////    @SequenceGenerator(
////            name = "confirmation_token_sequence",
////            sequenceName = "confirmation_token_sequence",
////            allocationSize = 1
////    )
////    @Id
////    @GeneratedValue(
////            strategy = GenerationType.SEQUENCE,
////            generator = "confirmation_token_sequence"
////    )
//
//    private Long id;
//    @Column(nullable = false)
//    private String token;
//    @Column(nullable = false)
//    private LocalDateTime createdTime;
//    @Column(nullable = false)
//    private LocalDateTime expiresTime;
//    @Column(nullable = false)
//    private LocalDateTime comfirmedTime;
//    @ManyToOne
//    @JoinColumn(nullable = false, name = "user_id")
//    private User user; // 1 user can have many confirmation token
//
//    public Token(String token,
//                 LocalDateTime createdTime,
//                 LocalDateTime expiredTime,
//                 User user) {
//        this.token = token;
//        this.createdTime = createdTime;
//        this.expiresTime = expiredTime;
//        this.user = user;
//    }
//}
