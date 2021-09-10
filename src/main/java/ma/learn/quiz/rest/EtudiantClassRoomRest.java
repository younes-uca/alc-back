package ma.learn.quiz.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.learn.quiz.bean.EtudiantClassRoom;
import ma.learn.quiz.service.EtudiantClassRoomService;
@RestController
@RequestMapping("learn/etudiant-classRoom")
public class EtudiantClassRoomRest {
	@Autowired
	private EtudiantClassRoomService etudiantClassRoomService;
	
	@GetMapping("etudiant/ref/{ref}")
	public List<EtudiantClassRoom> findByEtudiantRef(@PathVariable String ref) {
		return etudiantClassRoomService.findByEtudiantRef(ref);
	}
	
	@DeleteMapping("etudiant/ref/{ref}")
	public int deleteByEtudiantRef(@PathVariable String ref) {
		return etudiantClassRoomService.deleteByEtudiantRef(ref);
	}
	
	@PostMapping("/")
	public int save(@RequestBody EtudiantClassRoom etudiantClassRoom) {
		return etudiantClassRoomService.save(etudiantClassRoom);
	}
	@GetMapping("/id/{id}")
	public List<EtudiantClassRoom> findByClassRoomId(@PathVariable Long id) {
		return etudiantClassRoomService.findByClassRoomId(id);
	}
	@DeleteMapping("/id/{id}")
	public int deleteByClassRoomId(@PathVariable Long id) {
		return etudiantClassRoomService.deleteByClassRoomId(id);
	}
	@GetMapping("/")
	public List<EtudiantClassRoom> findAll() {
		return etudiantClassRoomService.findAll();
	}
	
}
