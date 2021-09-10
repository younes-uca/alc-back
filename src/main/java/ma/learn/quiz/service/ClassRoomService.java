package ma.learn.quiz.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.learn.quiz.bean.ClassRoom;
import ma.learn.quiz.dao.ClassRoomDao;
import ma.learn.quiz.dao.EtudiantClassRoomDao;

@Service
public class ClassRoomService {
	@Autowired
	private ClassRoomDao classRoomDao;
	@Autowired
	private ProfService profService;
	@Autowired
	private EtudiantClassRoomService etudiantClassRoomService;
	@Autowired
	private QuizClassRoomService quizClassRoomService;
	
	
	public int save(ClassRoom classRoom) {
		classRoomDao.save(classRoom);
		return 1;
	}
	
	public Optional<ClassRoom> findById(Long id) {
		return classRoomDao.findById(id);
	}
	
	public List<ClassRoom> findByResponsableId(Long id) {
		return classRoomDao.findByResponsableId(id);
	}
	
	public List<ClassRoom> findAll() {
		return classRoomDao.findAll();
	}
	
	@Transactional
	public int deleteByResponsableId(Long id) {
		int deleteByResponsable= classRoomDao.deleteByResponsableId(id);
		int deleteByEtudiant= etudiantClassRoomService.deleteByClassRoomId(id);
		int deleteQuiz=quizClassRoomService.deleteByClassRoomId(id);
		return deleteByResponsable;
	}
	
}
