package ma.learn.quiz.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.learn.quiz.bean.FaqEtudiant;
import ma.learn.quiz.bean.FaqProf;

public interface FaqEtudiantDao extends JpaRepository<FaqEtudiant, Long>{
	
	Optional<FaqEtudiant> findById(Long id);
	void deleteById(Long id);
	List<FaqEtudiant> findByFaqTypeId(Long id);
	int deleteByFaqTypeId(Long id);
	List<FaqEtudiant> findByEtudiantId(Long id);
	int deleteByEtudiantId(Long id);
	FaqEtudiant findByLibelle(String libelle);
}
