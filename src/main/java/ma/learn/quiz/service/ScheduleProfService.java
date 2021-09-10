package ma.learn.quiz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.learn.quiz.bean.EtatEtudiantSchedule;
import ma.learn.quiz.bean.Etudiant;
import ma.learn.quiz.bean.Quiz;
import ma.learn.quiz.bean.ScheduleProf;
import ma.learn.quiz.dao.ScheduleProfDao;
import ma.learn.quiz.vo.SchdeduleVo;

@Service
public class ScheduleProfService {
	
	/*@Transactional
	public int deleteByScheduleId(Long id) {
		return scheduleProfDao.deleteByScheduleId(id);
	}

	public List<ScheduleProf> findByScheduleId(Long id) {
		return scheduleProfDao.findByScheduleId(id);
	}*/

	public ScheduleProf findByRef(String ref) {
		return scheduleProfDao.findByRef(ref);
	}

	@Transactional
	public int deleteByRef(String ref) {
		return scheduleProfDao.deleteByRef(ref);
	}

	public int save(ScheduleProf scheduleProf) {
		Etudiant etudiant = etudiantService.findByRef(scheduleProf.getEtudiant().getRef());
		EtatEtudiantSchedule etatEtudiantSchedule = etatEtudiantScheduleService
				.findByRef(scheduleProf.getEtudiant().getEtatEtudiantSchedule().getRef());
		scheduleProf.setEtudiant(etudiant);
		if (findByRef(scheduleProf.getRef()) != null) {
			return -1;
		} else {
			etudiantService.save(etudiant);
			etatEtudiantScheduleService.update(etatEtudiantSchedule);
			scheduleProfDao.save(scheduleProf);
			return 1;
		}

	}

	public int saveAll(ScheduleProf scheduleProf) {
		if (findByRef(scheduleProf.getRef()) != null) {
			return -1;
		} else {
			scheduleProfDao.save(scheduleProf);
			etudiantService.saveAll(scheduleProf, scheduleProf.getEtudiant());
			return 1;
		}
	}

	public List<SchdeduleVo> findSchedule() {
		List<ScheduleProf> sheduls = scheduleProfDao.findAll();
		List<SchdeduleVo> schdeduleVos = new ArrayList<SchdeduleVo>();
		for (ScheduleProf s : sheduls) {
			SchdeduleVo schdeduleVo = new SchdeduleVo();
			schdeduleVo.setId(s.getId());
			schdeduleVo.setTitle(s.getEtudiant().getNom());
			schdeduleVo.setStart(s.getDateDebut());
			schdeduleVo.setEnd(s.getDateFin());
			schdeduleVo.setRef(s.getRef());
			schdeduleVo.setColor(s.getEtudiant().getEtatEtudiantSchedule().getCouleur());
			schdeduleVos.add(schdeduleVo);
		}
		return schdeduleVos;
	}

	public List<ScheduleProf> findAll() {
		return scheduleProfDao.findAll();
	}
	
public ScheduleProf update(ScheduleProf scheduleProf) {
	return scheduleProfDao.save(scheduleProf);
}



	@Autowired
	private ScheduleProfDao scheduleProfDao;
	@Autowired
	private EtudiantService etudiantService;
	@Autowired
	private EtatEtudiantScheduleService etatEtudiantScheduleService;
}
