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
import ma.learn.quiz.bean.SuperCategorieSection;
import ma.learn.quiz.service.SuperCategorieSectionService;

@RestController
@RequestMapping("learn/supercategoriesection")
public class SuperCategorieSectionWS {
	@Autowired
	private SuperCategorieSectionService superCategorieSectionService;
	@GetMapping("/code/{code}")
	public SuperCategorieSection findByCode(@PathVariable String code) {
		return superCategorieSectionService.findByCode(code);
	}
	@DeleteMapping("/code/{code}")
	public int deleteByCode(@PathVariable String code) {
		return superCategorieSectionService.deleteByCode(code);
	}
	 @PostMapping("/")
	public int save(@RequestBody SuperCategorieSection superCategorieSection) {
		return superCategorieSectionService.save(superCategorieSection);
	}
	 @GetMapping("/")
	public List<SuperCategorieSection> findAll() {
		return superCategorieSectionService.findAll();
	}
	@PutMapping("/")
	public void update(@RequestBody SuperCategorieSection superCategorieSection) {
		superCategorieSectionService.update(superCategorieSection);
	}
	@DeleteMapping("/entity/{entity}")
	public void deleteAll() {
		superCategorieSectionService.deleteAll();
	}
	
	@GetMapping("/libelle/{libelle}")
public List<SuperCategorieSection> findByLibelle(@PathVariable String libelle) {
		return superCategorieSectionService.findByLibelle(libelle);
	}
	
	

}
