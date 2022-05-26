package sit.project.civilife.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Player {

  @Id
  private long playerId;
  private String playerName;
  private long money;
  private long power;
  private long happy;
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
  @OneToOne
  @JoinColumn(name = "cha_id")
  private Gamecharacter gamecharacter;

}
