package ma.learn.quiz.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.learn.quiz.bean.FaqType;

public interface FaqTypeDao extends JpaRepository<FaqType, Long>{
	
	Optional<FaqType> findById(Long id);
	void deleteById(Long id);
	
	List<FaqType> findByDestinataire(String destinataire);

}
