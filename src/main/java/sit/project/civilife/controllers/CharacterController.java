package sit.project.civilife.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sit.project.civilife.models.Characters;
import sit.project.civilife.repositories.CharacterRepository;

import java.util.List;

@RestController
@RequestMapping("/api/user/")
public class CharacterController {

    private final CharacterRepository characterRepository;

    public CharacterController(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @GetMapping("/allCharacters")
    public List<Characters> showAllGameCharacters() {
        return characterRepository.findAll();
    }
}
