package ma.learn.quiz.rest;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.learn.quiz.bean.Cours;
import ma.learn.quiz.service.CoursService;

@RestController
@RequestMapping("learn/cours")

public class CoursWS {

    @Autowired
    private CoursService coursService ;
    

   
  

    @GetMapping("/order/id/{id}")
    public List<Cours> findByCriteria(@PathVariable Long id) {
		return coursService.findByCriteria(id);
	}

	@GetMapping("/id/{id}")
    public int init(@PathVariable Long id) {
		return coursService.init(id);
	}

	@GetMapping("/libelle/{libelle}")
	public List<Cours> findByLibelle(@PathVariable String libelle) {
		return coursService.findByLibelle(libelle);
	}

	
	

    @DeleteMapping("/entity/{entity}")
	public void delete(Cours entity) {
		coursService.delete(entity);
	}
    @DeleteMapping("/id/{id}")
    public int deleteCoursById(@PathVariable Long id) {
		return coursService.deleteCoursById(id);
	}
	@GetMapping("/")
	public List<Cours> findAll() {
		return coursService.findAll();
	}

    
	@PutMapping("/")
	public Cours update(@RequestBody Cours cours) {
		return coursService.update(cours);
	}
	
	
	@DeleteMapping("/parcours/code/{code}")
	public int deleteByParcoursCode(@PathVariable String code) {
		return coursService.deleteByParcoursCode(code);
	}

	@GetMapping("/parcours/id/{id}")
	public List<Cours> findByParcoursId(@PathVariable Long id) {
		return coursService.findByParcoursId(id);
	}
	
	@PostMapping("/")
	public int save(@RequestBody Cours cours) {
		return coursService.save(cours);
	}
	 @PostMapping("/delete-multiple-by-id")
	public int deleteCoursById(@RequestBody List<Cours> courss) {
		return coursService.deleteCoursById(courss);
	}
	
	

  
}
