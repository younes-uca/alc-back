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
import ma.learn.quiz.bean.EtatInscription;
import ma.learn.quiz.service.EtatInscriptionService;



@RestController
@RequestMapping("learn/etatInscription")
public class EtatInscriptionRest {
	@Autowired
	public EtatInscriptionService etatInscriptionService;
	@DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String ref) {
		return etatInscriptionService.deleteByRef(ref);
	}
	@GetMapping("/")
	public List<EtatInscription> findAll() {
		return etatInscriptionService.findAll();
	}
	@GetMapping("/ref/{ref}")
	public EtatInscription findByRef(@PathVariable String ref) {
		return etatInscriptionService.findByRef(ref);
	}
	@PostMapping("/")
	public int save(@RequestBody  EtatInscription etatInscription) {
		return etatInscriptionService.save(etatInscription);
	}
}
