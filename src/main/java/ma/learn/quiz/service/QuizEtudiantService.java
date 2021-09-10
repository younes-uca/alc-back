package ma.learn.quiz.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.learn.quiz.bean.Cours;
import ma.learn.quiz.bean.Etudiant;
import ma.learn.quiz.bean.Parcours;
import ma.learn.quiz.bean.Quiz;
import ma.learn.quiz.bean.QuizEtudiant;
import ma.learn.quiz.dao.QuizEtudiantDao;


@Service
public class QuizEtudiantService {

	@Autowired
	private QuizEtudiantDao quizEtudiantDao;
	public List<QuizEtudiant> findByResultat(String resultat) {
		return quizEtudiantDao.findByResultat(resultat);
	}

	@Autowired
	private QuizService quizService;
	@Autowired
	private EtudiantService etudiantService;
	@Autowired
	private ReponseEtudiantService reponseEtudiantService;
	@Autowired 
	public EntityManager entityManager;

	public QuizEtudiant findByRef(String ref) {
		return quizEtudiantDao.findByRef(ref);
	}

	@Transactional
	public int deleteById(Long id) {
		int reponseEtudiant = reponseEtudiantService.deleteByQuizEtudiantId(id);
		quizEtudiantDao.deleteById(id);
		return reponseEtudiant+1;
	}

	public List<QuizEtudiant> findByQuizRef(String ref) {
		return quizEtudiantDao.findByQuizRef(ref);
	}



	@Transactional
	public int deleteByQuizRef(String ref) {
		return quizEtudiantDao.deleteByQuizRef(ref);
	}



	public int save(QuizEtudiant quizEtudiant) {
		/*if(findByRef(quizEtudiant.getRef()) != null)
		{
			return -1;
		}*/
		Quiz quiz=quizService.findByRef(quizEtudiant.getQuiz().getRef());
        Etudiant etudiant = etudiantService.findByRef(quizEtudiant.getEtudiant().getRef());
        //ReponseEtudiant reponseEtudiant = reponseEtudiantService.findByRef(quizEtudiant.getReponseEtudiant().getRef());
        quizEtudiant.setQuiz(quiz);
        quizEtudiant.setEtudiant(etudiant);
        //quizEtudiant.setReponseEtudiant(reponseEtudiant);
       if(quiz==null){
          return -2;
       }
       if(etudiant==null){
           return -3;
        }
       /*if(reponseEtudiant==null){
           return -4;
        }*/
		else
		{
			quizEtudiantDao.save(quizEtudiant);
			return 1;
		}
		 
	}

	public List<QuizEtudiant> findAll() {
		return quizEtudiantDao.findAll();
	}

	public void update(QuizEtudiant quizEtudiant) {
		quizEtudiant.setNote(quizEtudiant.getNote());
		quizEtudiant.setResultat(quizEtudiant.getResultat());
		quizEtudiantDao.save(quizEtudiant);
		
	}
	
	public Object findByCritere(String refEtudiant, String refQuiz)
	{
		String query = "SELECT q FROM QuizEtudiant q WHERE q.etudiant.ref= '"+refEtudiant+"' and q.quiz.ref='"+refQuiz+"'";
		return entityManager.createQuery(query).getSingleResult();
	}
	
}
