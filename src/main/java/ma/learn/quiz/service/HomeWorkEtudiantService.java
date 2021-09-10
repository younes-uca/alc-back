package ma.learn.quiz.service;

import ma.learn.quiz.bean.*;
import ma.learn.quiz.dao.HomeWorkEtudiantDao;
import ma.learn.quiz.dao.QuizEtudiantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;


@Service
public class HomeWorkEtudiantService {

	public Optional<HomeWorkEtudiant> findById(Long id) {
		return homeWorkEtudiantDao.findById(id);
	}

	@Transactional
	public void deleteById(Long id) {
		homeWorkEtudiantDao.deleteById(id);
	}

	public List<HomeWorkEtudiant> findByEtudiantId(Long id) {
		return homeWorkEtudiantDao.findByEtudiantId(id);
	}

	public List<HomeWorkEtudiant> findByHomeWorkId(Long id) {
		return homeWorkEtudiantDao.findByHomeWorkId(id);
	}

	@Transactional
	public int deleteByEtudiantId(Long id) {
		return homeWorkEtudiantDao.deleteByEtudiantId(id);
	}

	@Transactional
	public int deleteByHomeWorkId(Long id) {
		return homeWorkEtudiantDao.deleteByHomeWorkId(id);
	}

	public List<HomeWorkEtudiant> findAll() {
		return homeWorkEtudiantDao.findAll();
	}

	public int save(HomeWorkEtudiant homeWorkEtudiant) {
		if(homeWorkService.findById(homeWorkEtudiant.getHomeWok().getId()) == null)
		{
			return -1;
		}
		homeWorkEtudiantDao.save(homeWorkEtudiant);
		return 1;
	}

	@Autowired
		private HomeWorkEtudiantDao homeWorkEtudiantDao;
	@Autowired
		private HomeWorkService homeWorkService;
	@Autowired
		private EtudiantService etudiantService;
	@Autowired
		private EntityManager entityManager;


	public Object findByCritere(Long idEtudiant, Long idHomeWork)
	{
		String query = "SELECT h FROM HomeWorkEtudiant h WHERE h.etudiant.id= '"+idEtudiant+"' and h.homeWok.id"+idEtudiant+"'";
		return entityManager.createQuery(query).getSingleResult();
	}

}
