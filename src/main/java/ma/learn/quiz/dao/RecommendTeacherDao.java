package ma.learn.quiz.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.learn.quiz.bean.RecommendTeacher;

public interface RecommendTeacherDao extends JpaRepository<RecommendTeacher,Long>{
	
	Optional<RecommendTeacher> findById(Long id);
	RecommendTeacher findRecommendTeacherById(Long id) ;
	
	List<RecommendTeacher> findRecommendTeacherByProfId(Long id) ;

}
