package sit.project.civilife.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class Gamecharacter {

    @Id
    private long chaId;
    private String chaName;
    private String career;
    private String story;
    private long salary;
    private long powerBegin;
    private long happyBegin;
    private String images;
    @JsonBackReference
    @OneToOne(mappedBy = "gamecharacter")
    private Player player;

}
