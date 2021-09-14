package ma.learn.quiz.dao;

import ma.learn.quiz.bean.EtudiantReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantReviewDao extends JpaRepository<EtudiantReview, Long> {
    EtudiantReview findByReview (int review);
    int deleteByReview (int review);
    EtudiantReview findByEtudiantIdAndCoursId (long id,long ids);

}
