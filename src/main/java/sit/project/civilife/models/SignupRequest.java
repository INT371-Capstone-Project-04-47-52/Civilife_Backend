package sit.project.civilife.models;

import lombok.Data;

@Data
public class SignupRequest {

    private long userId;
    private String fname;
    private String lname;
    private String age;
    private String email;
    private String password;

}
