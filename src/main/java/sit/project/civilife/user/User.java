//package sit.project.civilife.user;
//
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import javax.persistence.*;
//import java.util.Collection;
//import java.util.Collections;
//
//@Getter
//@Setter
//@EqualsAndHashCode
//@NoArgsConstructor
////@Entity
//public class User implements UserDetails {
//
////    @SequenceGenerator(
////            name = "user_sequence",
////            sequenceName = "user_sequence",
////            allocationSize = 1
////    )
////    @Id
////    @GeneratedValue(
////            strategy = GenerationType.SEQUENCE,
////            generator = "user_sequence"
////    )
//
//    private Long id;
//    private String fisrtName;
//    private String lastName;
//    private String email;
//    private String password;
//    @Enumerated(EnumType.STRING)
//    private UserRole userRole;
//    private Boolean locked;
//    private Boolean enabled;
//
//    public User(String fisrtName,
//                String lastName,
//                String email,
//                String password,
//                UserRole userRole) {
//        this.fisrtName = fisrtName;
//        this.lastName = lastName;
//        this.email = email;
//        this.password = password;
//        this.userRole = userRole;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(userRole.name());
//        return Collections.singletonList(authority);
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return email;
//    }
//
//    public String getFisrtName() {
//        return fisrtName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return !locked;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return enabled;
//    }
//}
