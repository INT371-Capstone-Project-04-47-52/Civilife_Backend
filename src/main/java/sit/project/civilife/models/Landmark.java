package sit.project.civilife.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Landmark {
    @Id
    private long landId;
    private String landName;

}
