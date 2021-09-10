package ma.learn.quiz.rest;


import java.util.List;

import ma.learn.quiz.bean.SectionItem;
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
import ma.learn.quiz.bean.Cours;
import ma.learn.quiz.bean.Section;
import ma.learn.quiz.service.SectionService;

@RestController
@RequestMapping("learn/section")
public class SectionWS {
 @Autowired
    private SectionService sectionservice;
 @PostMapping("/delete-multiple-by-id")
    public int deleteSectionById(@RequestBody List<Section> sections) {
	return sectionservice.deleteSectionById(sections);
}
 
    @PostMapping("/")
	public int save(@RequestBody Section section) {
	return sectionservice.save(section);
}

	@GetMapping("/")
    public List<Section> findAll( ) {
        return sectionservice.findAll();
    }

	@GetMapping("/transform")
	public void transformurl() {
		sectionservice.transformurl();
	}

	@GetMapping("/transformvid")
	public void transformurlvideo() {
		sectionservice.transformurlvideo();
	}

	@DeleteMapping("/id/{id}")
    public int deleteSectionById(@PathVariable Long id) {
		return sectionservice.deleteSectionById(id);
	}
	
    @GetMapping("/code/{code}")
    public Section findByCode(@PathVariable String code) {
        return sectionservice.findByCode(code);
    }

    

	@PutMapping("/")
    public Section update(@RequestBody Section section) {
        return sectionservice.update(section);
    }

	
	@GetMapping("/cours/id/{id}")
	public List<Section> findByCoursId(@PathVariable Long id) {
		return sectionservice.findByCoursId(id);
	}
	@GetMapping("/order/id/{id}")
	public List<Section> findByCriteria(@PathVariable Long id) {
		return sectionservice.findByCriteria(id);
	}
	@GetMapping("/cours/id/{id}/categorie/libelle/{libelle}")
	public Section findByCoursIdAndCategorieSectionLibelle(@PathVariable Long id,@PathVariable String libelle) {
		return sectionservice.findByCoursIdAndCategorieSectionLibelle(id, libelle);
	}
	@GetMapping("/section/id/{id}")
	public Section findSectionById(@PathVariable Long id) {
		return sectionservice.findSectionById(id);
	}
	@GetMapping("/cours/id/{id}/numeroOrder/{numeroOrder}")
	public Section findByCoursIdAndNumeroOrder(@PathVariable Long id,@PathVariable int numeroOrder) {
		return sectionservice.findByCoursIdAndNumeroOrder(id, numeroOrder);
	}


	@GetMapping("/idsection/{id}")
	public List<SectionItem> findSectionItemsBySection(@PathVariable Long id) {
 	    Section section=sectionservice.findSectionById(id);
		return section.getSectionItems();
	}

	@PostMapping("/idSection/{id}")
	public int setSectionItems(@PathVariable Long id, @RequestBody List<SectionItem> sectionItems) {
		return sectionservice.setSectionItems(id, sectionItems);
	}
    
    
}
