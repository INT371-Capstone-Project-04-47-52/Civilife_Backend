package sit.project.civilife.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sit.project.civilife.models.Landmark;
import sit.project.civilife.repositories.LandmarkRepository;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class LandmarkController {

    private final LandmarkRepository landmarkRepository;

    public LandmarkController(LandmarkRepository landmarkRepository) {
        this.landmarkRepository = landmarkRepository;
    }

    @GetMapping("/allLandmarks")
    public List<Landmark> showAllLandmarks() {
        return landmarkRepository.findAll();
    }


}
