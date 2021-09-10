package ma.learn.quiz.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.learn.quiz.bean.Etudiant;
import ma.learn.quiz.bean.Question;
import ma.learn.quiz.bean.QuizEtudiant;
import ma.learn.quiz.bean.Reponse;
import ma.learn.quiz.bean.ReponseEtudiant;
import ma.learn.quiz.dao.ReponseEtudiantDao;



@Service
public class ReponseEtudiantService {

	@Transactional
	public int deleteByQuizEtudiantId(Long id) {
		return reponseEtudiantDao.deleteByQuizEtudiantId(id);
	}

	@Autowired
	private ReponseEtudiantDao reponseEtudiantDao;

	@Autowired
    private EntityManager entityManager;
	
	public List<ReponseEtudiant> findByCriteria(String refQuizEtudiant, Long numeroQuestion) {
		String query = "SELECT r FROM ReponseEtudiant r WHERE r.quizEtudiant.ref= '"+refQuizEtudiant+"' and r.reponse.question.numero='"+numeroQuestion+"'";
		return entityManager.createQuery(query).getResultList();
	}

	public List<ReponseEtudiant> findByQuizEtudiantRef(String ref) {
		return reponseEtudiantDao.findByQuizEtudiantRef(ref);
	}

	@Autowired
	private QuizEtudiantService quizEtudiantService;
	@Autowired
	private QuestionService questionService;
	@Autowired
	private ReponseService reponseService;
	@Autowired
	private EtudiantService etudiantService;

	public ReponseEtudiant findByRef(String ref) {
		return reponseEtudiantDao.findByRef(ref);
	}

	@Transactional
	public int deleteByRef(String Ref) {
		return reponseEtudiantDao.deleteByRef(Ref);
	}

	public List<ReponseEtudiant> findByReponseQuestionRef(String ref) {
		return reponseEtudiantDao.findByReponseQuestionRef(ref);
	}

	public List<ReponseEtudiant> findByQuizEtudiantEtudiantRef(String ref) {
		return reponseEtudiantDao.findByQuizEtudiantEtudiantRef(ref);
	}

	@Transactional
	public int deleteByReponseQuestionRef(String ref) {
		return reponseEtudiantDao.deleteByReponseQuestionRef(ref);
	}

	@Transactional
	public int deleteByQuizEtudiantEtudiantRef(String ref) {
		return reponseEtudiantDao.deleteByQuizEtudiantEtudiantRef(ref);
	}

	public int save(ReponseEtudiant reponseEtudiant) {
		/*if(findByRef(reponseEtudiant.getRef())!=null)
		{
			return -1;
		}
        Reponse reponse = reponseService.findByRef(reponseEtudiant.getReponse().getRef());
        QuizEtudiant quizEtudiant = quizEtudiantService.findByRef(reponseEtudiant.getQuizEtudiant().getRef());
        reponseEtudiant.setReponse(reponse);
        reponseEtudiant.setQuizEtudiant(quizEtudiant);
         if(reponse==null){
             return -2;
          }
         if(quizEtudiant==null)
         {
        	 return -3;
         }
         else {
        	 reponseEtudiantDao.save(reponseEtudiant);
        	 return 1;
         }*/
		reponseEtudiantDao.save(reponseEtudiant);
   	 return 1;
	}

	public List<ReponseEtudiant> findAll() {
		return reponseEtudiantDao.findAll();
	}

	
}
