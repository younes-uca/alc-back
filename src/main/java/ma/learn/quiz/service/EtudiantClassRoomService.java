package ma.learn.quiz.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.learn.quiz.bean.ClassRoom;
import ma.learn.quiz.bean.Etudiant;
import ma.learn.quiz.bean.EtudiantClassRoom;
import ma.learn.quiz.dao.EtudiantClassRoomDao;

@Service
public class EtudiantClassRoomService {
	@Autowired
	private EtudiantClassRoomDao etudiantClassRoomDao;
	@Autowired
	private EtudiantService etudiantService;
	@Autowired
	private ClassRoomService classRoomService;

	public List<EtudiantClassRoom> findByEtudiantRef(String ref) {
		return etudiantClassRoomDao.findByEtudiantRef(ref);
	}

	@Transactional
	public int deleteByEtudiantRef(String ref) {
		return etudiantClassRoomDao.deleteByEtudiantRef(ref);
	}

	public int save(EtudiantClassRoom etudiantClassRoom) {
		
		Optional<ClassRoom> classRoom = classRoomService.findById(etudiantClassRoom.getClassRoom().getId());
		Etudiant etudiant = etudiantService.findByRef(etudiantClassRoom.getEtudiant().getRef());
		if(classRoom == null)
		{
			return -1;
		}
		else if(etudiant == null)
		{
			return -2;
		}
		else
		{
			etudiantClassRoomDao.save(etudiantClassRoom);
			return 1;
		}

	}

	public List<EtudiantClassRoom> findByClassRoomId(Long id) {
		return etudiantClassRoomDao.findByClassRoomId(id);
	}

	@Transactional
	public int deleteByClassRoomId(Long id) {
		return etudiantClassRoomDao.deleteByClassRoomId(id);
	}

	public List<EtudiantClassRoom> findAll() {
		return etudiantClassRoomDao.findAll();
	}
	

}
