package sit.project.civilife.models;

import lombok.Data;

import java.sql.Date;

@Data
public class SignupRequest {

    private long userId;
    private String fname;
    private String lname;
    private Date birthday;
    private String email;
    private String password;

}
