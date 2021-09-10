package ma.learn.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.learn.quiz.bean.CategorieProf;


@Repository
public interface CategorieProfDao extends JpaRepository<CategorieProf,Long>{
	CategorieProf findCategorieProfById(Long id);
	int deleteCategorieProfById(Long id);
}
