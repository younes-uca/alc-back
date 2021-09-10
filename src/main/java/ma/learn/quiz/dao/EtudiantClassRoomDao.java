package ma.learn.quiz.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.learn.quiz.bean.EtudiantClassRoom;


@Repository
public interface EtudiantClassRoomDao extends JpaRepository<EtudiantClassRoom,Long> {

	 List<EtudiantClassRoom> findByClassRoomId(Long id);
	 int deleteByClassRoomId(Long id);
	 
	 List<EtudiantClassRoom> findByEtudiantRef(String ref);
	 int deleteByEtudiantRef(String ref);

}
