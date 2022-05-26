package sit.project.civilife.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Landmark {
    @Id
    @Column(name = "land_id")
    private long landId;
    @Column(name = "land_name")
    private String landName;

}
