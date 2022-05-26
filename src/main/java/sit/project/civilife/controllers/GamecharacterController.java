package sit.project.civilife.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sit.project.civilife.models.Gamecharacter;
import sit.project.civilife.models.Landmark;
import sit.project.civilife.repositories.GamecharacterRepository;

import java.util.List;

@RestController
@RequestMapping("/api/user/")
public class GamecharacterController {

    private final GamecharacterRepository gamecharacterRepository;

    public GamecharacterController(GamecharacterRepository gamecharacterRepository) {
        this.gamecharacterRepository = gamecharacterRepository;
    }

    @GetMapping("/allGameCharacters")
    public List<Gamecharacter> showAllGameCharacters() {
        return gamecharacterRepository.findAll();
    }
}
