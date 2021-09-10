package ma.learn.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.learn.quiz.bean.EtatEtudiantSchedule;


public interface EtatEtudiantScheduleDao extends JpaRepository<EtatEtudiantSchedule, Long> {

	 int deleteByRef(String ref);
	 EtatEtudiantSchedule findByRef(String ref);
}
