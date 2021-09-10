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

import ma.learn.quiz.bean.QuizClassRoom;
import ma.learn.quiz.service.QuizClassRoomService;
@RestController
@RequestMapping("learn/quiz-classRoom")
public class QuizClassRoomWS {
	@Autowired
	private QuizClassRoomService quizClassRoomService;

	@PostMapping("/")
	public int save(@RequestBody QuizClassRoom quizClassRoom) {
		return quizClassRoomService.save(quizClassRoom);
	}

	@GetMapping("/id/{id}")
	public List<QuizClassRoom> findByClassRoomId(@PathVariable Long id) {
		return quizClassRoomService.findByClassRoomId(id);
	}

	@DeleteMapping("/id/{id}")
	public int deleteByClassRoomId(@PathVariable Long id) {
		return quizClassRoomService.deleteByClassRoomId(id);
	}

	@GetMapping("/")
	public List<QuizClassRoom> findAll() {
		return quizClassRoomService.findAll();
	}
	
}
