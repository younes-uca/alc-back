package ma.learn.quiz.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.learn.quiz.bean.QuizClassRoom;



@Repository
public interface QuizClassRoomDao extends JpaRepository<QuizClassRoom,Long>{
 
	 List<QuizClassRoom> findByClassRoomId(Long id);
	 int deleteByClassRoomId(Long id);
}
