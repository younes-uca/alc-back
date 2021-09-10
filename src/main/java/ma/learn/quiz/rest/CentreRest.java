package ma.learn.quiz.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.learn.quiz.bean.Centre;
import ma.learn.quiz.service.CentreService;

@RestController
@RequestMapping("learn/centre")
public class CentreRest {
	@Autowired
	public CentreService centreService;
	@PostMapping("/")
	public int save(@RequestBody Centre centre) {
		return centreService.save(centre);
	}
	@DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String ref) {
		return centreService.deleteByRef(ref);
	}
	@GetMapping("/")
	public List<Centre> findAll() {
		return centreService.findAll();
	}
	@GetMapping("/ref/{ref}")
	public Centre findByRef(@PathVariable String ref) {
		return centreService.findByRef(ref);
	}
	
	

}
