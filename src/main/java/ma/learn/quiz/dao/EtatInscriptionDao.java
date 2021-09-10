package ma.learn.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.learn.quiz.bean.EtatInscription;




public interface EtatInscriptionDao  extends JpaRepository<EtatInscription,Long> {
	
	 int deleteByRef(String ref);
	 EtatInscription findByRef(String ref);
	 EtatInscription findEtatInscriptionById(Long id);
}
