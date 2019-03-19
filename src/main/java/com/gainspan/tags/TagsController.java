package com.gainspan.tags;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
@RestController

public class TagsController {
	@Autowired
    private TagsRepository tagsRepository;
	@CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/production")
    public List<Tags> index() {
        return tagsRepository.findByServer("P");
    }
	@CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/development")  
    public List<Tags> developmentTags() {
        return tagsRepository.findByServer("D");
    }
    @RequestMapping("/local")  
    public List<Tags> localTags() {
        return tagsRepository.findByServer("L");
    }
}