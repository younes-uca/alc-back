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

import ma.learn.quiz.bean.Faq;
import ma.learn.quiz.service.FaqService;

@RestController
@RequestMapping("learn/faq")
public class FaqRest {

	@Autowired
	private FaqService faqService;

	@GetMapping("/id/{id}")
	public Optional<Faq> findById(@PathVariable Long id) {
		return faqService.findById(id);
	}

	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id) {
		faqService.deleteById(id);
	}

	@GetMapping("/faqType/id/{id}")
	public List<Faq> findByFaqTypeId(@PathVariable Long id) {
		return faqService.findByFaqTypeId(id);
	}

	@DeleteMapping("/faqType/id/{id}")
	public int deleteByFaqTypeId(@PathVariable Long id) {
		return faqService.deleteByFaqTypeId(id);
	}

	@PostMapping("/")
	public int save(@RequestBody Faq faq) {
		return faqService.save(faq);
	}

	@GetMapping("/")
	public List<Faq> findAll() {
		return faqService.findAll();
	}

	
}
