package ma.learn.quiz.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.learn.quiz.bean.Faq;

public interface FaqDao extends JpaRepository<Faq, Long>{
	
	Optional<Faq> findById(Long id);
	void deleteById(Long id);
	List<Faq> findByFaqTypeId(Long id);
	int deleteByFaqTypeId(Long id);
}
