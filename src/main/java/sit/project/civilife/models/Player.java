package sit.project.civilife.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Player {

  @Id
  private long playerId;
  private String playerName;
  private long statusMoney;
  private long statusEnergy;
  private long statusHappy;
  private long bankMoney;
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
  @JsonBackReference
  @OneToOne(mappedBy = "player")
  private Characters character;

}
