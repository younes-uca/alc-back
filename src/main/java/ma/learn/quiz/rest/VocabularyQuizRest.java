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

import ma.learn.quiz.bean.VocabularyQuiz;
import ma.learn.quiz.service.VocabularyQuizService;

@RestController
@RequestMapping(value = "learn/vocabularyQuiz")
public class VocabularyQuizRest {

	@PutMapping("/")
	public void update(@RequestBody VocabularyQuiz vocabularyQuiz) {
		vocabularyQuizService.update(vocabularyQuiz);
	}

	@GetMapping("/ref/{ref}")
	public VocabularyQuiz findByRef(@PathVariable String ref) {
		return vocabularyQuizService.findByRef(ref);
	}

	@DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String Ref) {
		return vocabularyQuizService.deleteByRef(Ref);
	}

	@GetMapping("/section/id/{id}")
	public VocabularyQuiz findBySectionId(@PathVariable Long id) {
		return vocabularyQuizService.findBySectionId(id);
	}

	@PostMapping("/")
	public int save(@RequestBody VocabularyQuiz vocabularyQuiz) {
		return vocabularyQuizService.save(vocabularyQuiz);
	}

	@GetMapping("/")
	public List<VocabularyQuiz> findAll() {
		return vocabularyQuizService.findAll();
	}

	@Autowired
	private VocabularyQuizService vocabularyQuizService;
}
