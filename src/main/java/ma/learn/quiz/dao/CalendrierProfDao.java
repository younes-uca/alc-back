package ma.learn.quiz.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.learn.quiz.bean.CalendrierProf;

public interface CalendrierProfDao extends JpaRepository<CalendrierProf, Long> {
	List<CalendrierProf> findByProfId(Long id);
	List<CalendrierProf> findByEtudiantId(Long id);
	CalendrierProf findByRef(String ref);
	CalendrierProf findCalendrierProfById(Long id);
	int deleteByRef(String ref);
	int deleteCalendrierProfById(Long id);
	
}
