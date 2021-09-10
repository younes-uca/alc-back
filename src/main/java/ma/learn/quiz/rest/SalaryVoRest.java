package ma.learn.quiz.rest;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.learn.quiz.service.SalaryVoService;
import ma.learn.quiz.vo.SalaryVo;
@RestController
@RequestMapping(value = "learn/salary")
public class SalaryVoRest {
	@Autowired
	private SalaryVoService SalaryService;
	 @GetMapping("/id/{id}")
	public List<SalaryVo> findSalaryVoById(@PathVariable Long id) {
		return SalaryService.findSalaryVoById(id);
	}
	 @GetMapping("/mois/{mois}/annee/{annee}")
	 public List<SalaryVo> findByMoisAndAnnee(Date mois, Date annee) {
		return SalaryService.findByMoisAndAnnee(mois, annee);
	}

	@GetMapping("/prof/id/{id}")
	 public SalaryVo findSalaryVoByProfId(@PathVariable Long id) {
		return SalaryService.findSalaryVoByProfId(id);
	}
	@GetMapping("/mois/{mois}/annee/{annee}/prof/id/{id}")
	public SalaryVo findSalaryVoByMoisAndAnneeAndProfId(String mois, String annee, Long id) {
		return SalaryService.findSalaryVoByMoisAndAnneeAndProfId(mois, annee, id);
	}
	
}
