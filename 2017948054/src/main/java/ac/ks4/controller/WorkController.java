package ac.ks4.controller;

import ac.ks4.domain.Work;
import ac.ks4.repository.WorkRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WorkController {

    private WorkRepository workRepository;

    public WorkController(WorkRepository workRepository) {

        this.workRepository = workRepository;
    }

    @GetMapping("/Work")
    public List<String> work(){
        List<String> worklist = new ArrayList<>();

        for(Work s: workRepository.findAll()){
            worklist.add(s.getCompany());
        }
        return worklist;
    }

}
