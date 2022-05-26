package sit.project.civilife.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    private long userId;
    private String fname;
    private String lname;
    private String age;
    private String email;
    @JsonIgnore
    private String password;
//    private String username;
//    private long chaId;
//    private String role;

}
