package ma.learn.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.learn.quiz.bean.News;

public interface NewsDao extends JpaRepository<News,Long>{
	
	News findByRef(String ref);
	int deleteByRef(String ref);

}
