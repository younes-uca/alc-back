package ma.learn.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.learn.quiz.bean.VocabularyQuiz;

public interface VocabularyQuizDao extends JpaRepository<VocabularyQuiz, Long>{
 VocabularyQuiz findByRef(String ref);
	int deleteByRef(String Ref);

	VocabularyQuiz findBySectionId(Long id);
}
