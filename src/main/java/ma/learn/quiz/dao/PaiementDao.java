package ma.learn.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.learn.quiz.bean.Paiement;

@Repository
public interface PaiementDao extends JpaRepository<Paiement, Long> {
    
	 

}