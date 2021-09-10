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

import ma.learn.quiz.bean.CategorieSection;
import ma.learn.quiz.service.CategorieSectionService;

@RestController
@RequestMapping("learn/categoriesection")
public class CategorieSectionWS {

    @Autowired
    public CategorieSectionService categorieSectionService;

    @PostMapping("/")
    public int save(@RequestBody CategorieSection categorieSection) {
        return categorieSectionService.save(categorieSection);
    }

    @GetMapping("/code/{code}")
    public CategorieSection findByCode(@PathVariable String code) {
        return categorieSectionService.findByCode(code);
    }
   

    @GetMapping("/")
    public List<CategorieSection> findAll() {
        return categorieSectionService.findAll();
    }

    @PutMapping("/")
	public void update(@RequestBody CategorieSection categorieSection) {
		categorieSectionService.update(categorieSection);
	}

    @DeleteMapping("/code/{code}")
	public int deleteByCode(@PathVariable String code) {
		return categorieSectionService.deleteByCode(code);
	}
	@GetMapping("/libelle/{libelle}")
	public List<CategorieSection> findByLibelle(@PathVariable String libelle) {
		return categorieSectionService.findByLibelle(libelle);
	}
   


	 

    
}

