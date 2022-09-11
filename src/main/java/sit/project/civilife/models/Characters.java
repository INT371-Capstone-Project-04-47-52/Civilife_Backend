package sit.project.civilife.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@Entity
public class Characters {

  @Id
  private long charId;
  private String charName;
  private long charEnergy;
  private long charHappy;
  private String charImages;
  @OneToOne
  @JoinColumn(name = "player_id")
  private Player player;


}
