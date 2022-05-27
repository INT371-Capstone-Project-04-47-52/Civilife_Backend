package sit.project.civilife.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sit.project.civilife.models.Player;
import sit.project.civilife.repositories.PlayerRepository;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class PlayerController {

    private final PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @GetMapping("/allPlayers")
    public List<Player> showAllLandmarks() {
        //show only user 1 account
        return playerRepository.findAll();
    }
}
