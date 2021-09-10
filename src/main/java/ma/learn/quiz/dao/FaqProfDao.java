package ma.learn.quiz.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.learn.quiz.bean.FaqProf;

public interface FaqProfDao extends JpaRepository<FaqProf, Long>{
	
	Optional<FaqProf> findById(Long id);
	void deleteById(Long id);
	List<FaqProf> findByFaqTypeId(Long id);
	int deleteByFaqTypeId(Long id);
	List<FaqProf> findByProfId(Long id);
	int deleteByProfId(Long id);
	FaqProf findByLibelle(String libelle);
}
