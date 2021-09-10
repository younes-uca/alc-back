package ma.learn.quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.learn.quiz.bean.EtatEtudiantSchedule;
import ma.learn.quiz.bean.Quiz;
import ma.learn.quiz.dao.EtatEtudiantScheduleDao;

@Service
public class EtatEtudiantScheduleService {
	@Autowired
	private EtatEtudiantScheduleDao etatEtudiantScheduleDao;

	@Transactional
	public int deleteByRef(String ref) {
		return etatEtudiantScheduleDao.deleteByRef(ref);
	}

	public EtatEtudiantSchedule findByRef(String ref) {
		return etatEtudiantScheduleDao.findByRef(ref);
	}

	public int save(EtatEtudiantSchedule etatEtudiantSchedule) {
		if (findByRef(etatEtudiantSchedule.getRef()) != null) {
			return -1;
		} else {
			etatEtudiantScheduleDao.save(etatEtudiantSchedule);
			return 1;
		}
	}

    public void update(EtatEtudiantSchedule etatEtudiantSchedule){
        etatEtudiantScheduleDao.save(etatEtudiantSchedule);
    }
	public List<EtatEtudiantSchedule> findAll() {
		return etatEtudiantScheduleDao.findAll();
	}

	public Optional<EtatEtudiantSchedule> findById(Long id) {
		return etatEtudiantScheduleDao.findById(id);
	}

}
