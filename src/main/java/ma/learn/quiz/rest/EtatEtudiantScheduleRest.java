package ma.learn.quiz.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.learn.quiz.bean.EtatEtudiantSchedule;
import ma.learn.quiz.service.EtatEtudiantScheduleService;

@RestController
@RequestMapping("learn/etatEtudiantSchedule")
public class EtatEtudiantScheduleRest {

	@Autowired
	private EtatEtudiantScheduleService etatEtudiantScheduleService;

	@DeleteMapping("/ref/{ref}")
	public int deleteByRef(String ref) {
		return etatEtudiantScheduleService.deleteByRef(ref);
	}

	@GetMapping("/ref/{ref}")
	public EtatEtudiantSchedule findByRef(String ref) {
		return etatEtudiantScheduleService.findByRef(ref);
	}

	@PostMapping("/")
	public int save(EtatEtudiantSchedule etatEtudiantSchedule) {
		return etatEtudiantScheduleService.save(etatEtudiantSchedule);
	}

	@GetMapping("/")
	public List<EtatEtudiantSchedule> findAll() {
		return etatEtudiantScheduleService.findAll();
	}

	@GetMapping("/id/{id}")
	public Optional<EtatEtudiantSchedule> findById(Long id) {
		return etatEtudiantScheduleService.findById(id);
	}

}
