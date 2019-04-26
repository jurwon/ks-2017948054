package ac.ks4.controller;

import ac.ks4.domain.Profile;
import ac.ks4.repository.ProfileRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProfileController {

    private ProfileRepository profileRepository;

    public ProfileController(ProfileRepository profileRepository) {

        this.profileRepository = profileRepository;
    }

    @GetMapping("/Profile")
    public List<String> profile(){
        List<String> profilelist = new ArrayList<>();

        for(Profile s: profileRepository.findAll()){
            profilelist.add(s.getUsername());
        }
        return profilelist;
    }
}
