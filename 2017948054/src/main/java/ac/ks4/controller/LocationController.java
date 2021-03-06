package ac.ks4.controller;

import ac.ks4.domain.Location;
import ac.ks4.repository.LocationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LocationController {
    private LocationRepository locationRepository;

    public LocationController(LocationRepository locationRepository) {

        this.locationRepository = locationRepository;
    }

    @GetMapping("/Location")
    public List<String> Location(){
        List<String> locationlist = new ArrayList<>();

        for(Location s: locationRepository.findAll()){
            locationlist.add(s.getAddress());
        }

        return locationlist;
    }
}
