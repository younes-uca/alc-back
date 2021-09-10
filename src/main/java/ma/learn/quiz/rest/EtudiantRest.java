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

import ma.learn.quiz.bean.Etudiant;
import ma.learn.quiz.service.EtudiantService;
import ma.learn.quiz.service.vo.EtudiantVo;

@RestController
@RequestMapping("learn/etudiant")
public class EtudiantRest {
	@Autowired
	public EtudiantService  etudiantService;
	
	
	@GetMapping("/prof/id/{id}")
	public List<Etudiant> findEtudiantByProfId(@PathVariable Long id) {
		return etudiantService.findEtudiantByProfId(id);
	}
	@PostMapping("/search")
	public List<Etudiant> findByCriteria(@RequestBody EtudiantVo etudiantVo) {
		return etudiantService.findByCriteria(etudiantVo);
	}
	@GetMapping("/parcours/code/{code}")
	public List<Etudiant> findByParcoursCode(@PathVariable String code) {
		return etudiantService.findByParcoursCode(code);
	}
	@PostMapping("/")
	public int save(@RequestBody Etudiant etudiant) {
		return etudiantService.save(etudiant);
	}
	@GetMapping("/ref/{ref}")
	public Etudiant findByRef(@PathVariable String ref) {
		return etudiantService.findByRef(ref);
	}
	@GetMapping("/nom/{nom}")
	public Etudiant findByNom(@PathVariable String nom) {
		return etudiantService.findByNom(nom);
	}
	
	
	@GetMapping("/")
	public List<Etudiant> findAll() {
		return etudiantService.findAll();
	}

	 @PostMapping("/delete-multiple-by-id")	
	public int deleteEtudiantById(@RequestBody List<Etudiant> etudiant) {
		return etudiantService.deleteEtudiantById(etudiant);
	}
	@DeleteMapping("/id/{id}")
	public int deleteByEtudiantId(@PathVariable Long id) {
		return etudiantService.deleteEtudiantById(id);
	}
	@GetMapping("/login/{login}/password/{password}")
	public Object findByCritere(@PathVariable String login,@PathVariable String password) {
		return etudiantService.findByCritere(login, password);
	}
	@PutMapping("/")
	public Etudiant update(@RequestBody Etudiant etudiant) {
		return etudiantService.update(etudiant);
	}
	
	
	
}
