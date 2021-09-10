package ma.learn.quiz.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.learn.quiz.bean.Centre;
import ma.learn.quiz.bean.ClassRoom;
import ma.learn.quiz.bean.Cours;

@Repository
public interface ClassRoomDao extends JpaRepository<ClassRoom,Long>  {
	 void deleteById(Long id);
	 Optional<ClassRoom> findById(Long id);
	 List< ClassRoom> findByResponsableId(Long id); 
     int deleteByResponsableId(Long id);
}
