package ma.learn.quiz.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.learn.quiz.bean.Etudiant;
import ma.learn.quiz.bean.Prof;
import ma.learn.quiz.bean.SessionCours;
import ma.learn.quiz.dao.SessionCoursDao;


@Service
public class SessionCoursService {
	 @Autowired 
		public EntityManager entityManager;
    @Autowired
    private SessionCoursDao sessionCoursDao;
    @Autowired
    private EtudiantService etudiantService;
    @Autowired
    private ProfService profService;
    
    public List<SessionCours> findByCriteria (SessionCours sessionCours ){
		String query = "SELECT e FROM SessionCours e WHERE 1=1";
		if (sessionCours.getProf().getNom() != null  )
		{
			query += " AND  e.prof.nom LIKE '%" + sessionCours.getProf().getNom()+"%'";
		}
		if (sessionCours.getEtudiant().getNom() != null)
		{
			query+= "  AND  e.etudiant.nom LIKE '%" + sessionCours.getEtudiant().getNom()+"'";
		}
		
		
		return  entityManager.createQuery(query).getResultList();	
	}


    public SessionCours findSessionCoursById(Long id) {
		return sessionCoursDao.findSessionCoursById(id);
	}


	public int save(SessionCours sessionCours) {
		SessionCours session = findSessionCoursById(sessionCours.getId());
		Etudiant etd = etudiantService.findEtudiantById(sessionCours.getEtudiant().getId());
		Prof prof = profService.findProfById(sessionCours.getProf().getId());
        if (session != null) {
        	
        return -1 ;
        }else {
        	sessionCours.setEtudiant(etd);
        	sessionCours.setProf(prof);
        sessionCoursDao.save(sessionCours);
        return 1;
        }
    }


    public SessionCours update(SessionCours sessionCours) {
    	SessionCours session = findSessionCoursById(sessionCours.getId());
		Etudiant etd = etudiantService.findEtudiantById(sessionCours.getEtudiant().getId());
		Prof prof = profService.findProfById(sessionCours.getProf().getId());
		session.setEtudiant(etd);
    	session.setProf(prof);
    	session.setReference(sessionCours.getReference());
    	session.setDuree(sessionCours.getDuree());
    	session.setDateDebut(sessionCours.getDateDebut());
    	session.setDateFin(sessionCours.getDateFin());
    	session.setPayer(sessionCours.getPayer());
        return sessionCoursDao.save(session);
    }

    public List<SessionCours> findByProfId(Long id) {

        return sessionCoursDao.findByProfId(id);
    }

    public List<SessionCours> findAll() {
        return sessionCoursDao.findAll();
    }


    @Transactional
    public int deleteSessionCoursById(Long id) {
        return sessionCoursDao.deleteSessionCoursById(id);
    }


    @Transactional
    public int deleteSessionCoursById(List<SessionCours> sessionCourss) {
        int res = 0;
        for (int i = 0; i < sessionCourss.size(); i++) {
            res += deleteSessionCoursById(sessionCourss.get(i).getId());
        }
        return res;
    }
}
