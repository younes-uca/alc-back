package ma.learn.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.learn.quiz.bean.Cours;
import ma.learn.quiz.bean.Etudiant;
import ma.learn.quiz.bean.EtudiantCours;
import ma.learn.quiz.dao.EtudiantCoursDao;

@Service
public class EtudiantCoursService {
	@Autowired
	private EtudiantCoursDao etudiantCoursDao;
	@Autowired
	private CoursService coursService;
	@Autowired
	private EtudiantService etudiantService;

	public EtudiantCours findByCoursIdAndEtudiantId(Long id, Long ids) {
		return etudiantCoursDao.findByCoursIdAndEtudiantId(id, ids);
	}

	

	public List<EtudiantCours> findAll() {
		return etudiantCoursDao.findAll();
	}



	public int save(EtudiantCours etudiantCours) {
		Etudiant etd = etudiantService.findEtudiantById(etudiantCours.getEtudiant().getId());
		Cours cours = coursService.findCoursById(etudiantCours.getCours().getId());
		EtudiantCours etdcours = findByCoursIdAndEtudiantId(cours.getId(), etd.getId());
		if (etd == null) {
			return -1;
		}else if (etdcours != null) {
			return -2;
		} else if (cours == null) {
			return -3;
		}else {
			etudiantCoursDao.save(etudiantCours);
			return 1;
		}
	}
	
}
