package ac.ks4.controller;

import ac.ks4.domain.Basic;
import ac.ks4.repository.BasicRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BasicController {

    private BasicRepository basicRepository;

    public BasicController(BasicRepository basicRepository) {

        this.basicRepository = basicRepository;
    }//의존성 주입

    @GetMapping("/basic")//화면에 가져옴
    public List<String> basic(){
        List<String> basiclist = new ArrayList<>();

        for(Basic s: basicRepository.findAll()){
            basiclist.add(s.getName());
        }

        return basiclist;
    }
}
