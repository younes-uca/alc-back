package ma.learn.quiz.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.learn.quiz.vo.SalaryVo;

@Repository
public interface SalaryVoDao extends JpaRepository<SalaryVo, Long> {
   
	List<SalaryVo> findSalaryVoById(Long id);
	SalaryVo findSalaryVoByProfId(Long id);
	SalaryVo findSalaryVoByMoisAndAnneeAndProfId(String mois, String annee,Long id);
	List<SalaryVo> findByMoisAndAnnee(Date mois, Date annee);
}