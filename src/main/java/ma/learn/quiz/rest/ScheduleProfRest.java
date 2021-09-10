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

import ma.learn.quiz.bean.ScheduleProf;
import ma.learn.quiz.service.ScheduleProfService;
import ma.learn.quiz.vo.SchdeduleVo;

@RestController
@RequestMapping(value = "learn/scheduleProf")
public class ScheduleProfRest {

	/*@DeleteMapping("/id/{id}")
	public int deleteByScheduleId(Long id) {
		return scheduleProfService.deleteByScheduleId(id);
	}

	@PutMapping("/")
	public ScheduleProf update(@RequestBody ScheduleProf scheduleProf) {
		return scheduleProfService.update(scheduleProf);
	}*/

/*	@GetMapping("/id/{id}")
	public List<ScheduleProf> findByScheduleId(Long id) {
		return scheduleProfService.findByScheduleId(id);
	}*/

	@PostMapping("/save/")
	public int saveAll(ScheduleProf scheduleProf) {
		return scheduleProfService.saveAll(scheduleProf);
	}

	@GetMapping("/vo/")
	public List<SchdeduleVo> findSchedule() {
		return scheduleProfService.findSchedule();
	}

	@Autowired
	private ScheduleProfService scheduleProfService;

	@GetMapping("/ref/{ref}")
	public ScheduleProf findByRef(@PathVariable String ref) {
		return scheduleProfService.findByRef(ref);
	}

	@DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String ref) {
		return scheduleProfService.deleteByRef(ref);
	}

	@PostMapping("/")
	public int save(@RequestBody ScheduleProf scheduleProf) {
		return scheduleProfService.save(scheduleProf);
	}

	@GetMapping("/")
	public List<ScheduleProf> findAll() {
		return scheduleProfService.findAll();
	}

}
