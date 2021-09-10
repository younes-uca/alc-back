package ma.learn.quiz.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.learn.quiz.bean.FaqProf;
import ma.learn.quiz.service.FaqProfService;

@RestController
@RequestMapping("learn/faqProf")
public class FaqProfRest {

	@Autowired
	private FaqProfService faqProfService;

	@PutMapping("/")
	public void update(@RequestBody FaqProf faqProf) {
		faqProfService.update(faqProf);
	}

	@GetMapping("/libelle/{libelle}")
	public FaqProf findByLibelle(@PathVariable String libelle) {
		return faqProfService.findByLibelle(libelle);
	}

	@GetMapping("/critere/prof/{idProf}/type/{idType}")
	public List<FaqProf> findByCritere(@PathVariable Long idProf,@PathVariable Long idType) {
		return faqProfService.findByCritere(idProf, idType);
	}

	@GetMapping("/")
	public List<FaqProf> findAll() {
		return faqProfService.findAll();
	}

	@GetMapping("/id/{id}")
	public Optional<FaqProf> findById(@PathVariable Long id) {
		return faqProfService.findById(id);
	}

	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id) {
		faqProfService.deleteById(id);
	}

	@GetMapping("/faqType/id/{id}")
	public List<FaqProf> findByFaqTypeId(@PathVariable Long id) {
		return faqProfService.findByFaqTypeId(id);
	}

	@DeleteMapping("/faqType/id/{id}")
	public int deleteByFaqTypeId(@PathVariable Long id) {
		return faqProfService.deleteByFaqTypeId(id);
	}

	@GetMapping("/prof/id/{id}")
	public List<FaqProf> findByProfId(@PathVariable Long id) {
		return faqProfService.findByProfId(id);
	}

	@DeleteMapping("/prof/id/{id}")
	public int deleteByProfId(@PathVariable Long id) {
		return faqProfService.deleteByProfId(id);
	}

	@PostMapping("/")
	public int save(@RequestBody FaqProf faqProf) {
		return faqProfService.save(faqProf);
	}

	
	
}
