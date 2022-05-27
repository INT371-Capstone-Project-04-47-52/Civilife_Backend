package sit.project.civilife.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Date;
import java.util.List;

@Data
@Entity
public class User {

    @Id
    private long userId;
    private String fname;
    private String lname;
    private Date birthday;
    private String email;
    @JsonIgnore
    private String password;
    @JsonBackReference
    @OneToMany(mappedBy = "user")
    private List<Player> players;

}
