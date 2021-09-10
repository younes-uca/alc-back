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

import ma.learn.quiz.bean.News;
import ma.learn.quiz.service.NewsService;

@RestController
@RequestMapping("learn/news")
public class NewsRest {

	@Autowired
	private NewsService newsService;

	@GetMapping("/critere/destinataire/{destinataire}")
	public List<News> findByCritere(@PathVariable String destinataire) {
		return newsService.findByCritere(destinataire);
	}

	@PutMapping("/")
	public void update(@RequestBody News news) {
		newsService.update(news);
	}

	@GetMapping("/ref/{ref}")
	public News findByRef(@PathVariable String ref) {
		return newsService.findByRef(ref);
	}

	@DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String ref) {
		return newsService.deleteByRef(ref);
	}

	@PostMapping("/")
	public int save(@RequestBody News news) {
		return newsService.save(news);
	}

	@GetMapping("/")
	public List<News> findAll() {
		return newsService.findAll();
	}
}
