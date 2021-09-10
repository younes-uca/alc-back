package ma.learn.quiz.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.learn.quiz.bean.EtudiantCours;


public interface EtudiantCoursDao extends JpaRepository<EtudiantCours,Long> {
	EtudiantCours findByCoursIdAndEtudiantId(Long id, Long ids);

}
