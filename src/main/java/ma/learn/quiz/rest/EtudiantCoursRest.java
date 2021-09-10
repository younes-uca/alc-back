package ma.learn.quiz.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.learn.quiz.bean.EtudiantCours;
import ma.learn.quiz.service.EtudiantCoursService;

@RestController
@RequestMapping("learn/etudiantCours")
public class EtudiantCoursRest {
	@Autowired
	private EtudiantCoursService etudiantCoursService;

	@GetMapping("/id/{id}/ids/{ids}")
	public EtudiantCours findByCoursIdAndEtudiantId(@PathVariable Long id,@PathVariable  Long ids) {
		return etudiantCoursService.findByCoursIdAndEtudiantId(id, ids);
	}
	@PostMapping("/")
	public int save(@RequestBody EtudiantCours etudiantCours) {
		return etudiantCoursService.save(etudiantCours);
	}
	@GetMapping("/")
	public List<EtudiantCours> findAll() {
		return etudiantCoursService.findAll();
	}

	
}
