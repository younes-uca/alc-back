package ma.learn.quiz.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.learn.quiz.bean.FaqType;
import ma.learn.quiz.service.FaqTypeService;

@RestController
@RequestMapping("learn/faqType")
public class FaqTypeRest {

	@Autowired
	private FaqTypeService faqTypeService;

	@GetMapping("/id/{id}")
	public Optional<FaqType> findById(@PathVariable Long id) {
		return faqTypeService.findById(id);
	}

	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id) {
		faqTypeService.deleteById(id);
	}

	@GetMapping("/destinataire/{destinataire}")
	public List<FaqType> findByDestinataire(@PathVariable String destinataire) {
		return faqTypeService.findByDestinataire(destinataire);
	}

	@PostMapping("/")
	public int save(@RequestBody FaqType faqType) {
		return faqTypeService.save(faqType);
	}

	@GetMapping("/")
	public List<FaqType> findAll() {
		return faqTypeService.findAll();
	}

	
}
