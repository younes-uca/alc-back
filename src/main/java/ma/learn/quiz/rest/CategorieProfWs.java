package ma.learn.quiz.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.learn.quiz.bean.CategorieProf;
import ma.learn.quiz.service.CategorieProfService;


@RestController
@RequestMapping("learn/categorieprof")
public class CategorieProfWs {
	@Autowired
	private CategorieProfService categorieProfservice;

	 @GetMapping("/")
	public List<CategorieProf> findAll() {
		return categorieProfservice.findAll();
	}

}
