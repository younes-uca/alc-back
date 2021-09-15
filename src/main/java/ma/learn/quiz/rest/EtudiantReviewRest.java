package ma.learn.quiz.rest;



import ma.learn.quiz.bean.EtudiantReview;
import ma.learn.quiz.service.EtudiantReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("learn/etudiantReview")
public class EtudiantReviewRest {
    @Autowired
    public EtudiantReviewService etudiantReviewService;

    public EtudiantReview findByReview(int review) {
        return etudiantReviewService.findByReview(review);
    }

    public int deleteByReview(int review) {
        return etudiantReviewService.deleteByReview(review);
    }

    public List<EtudiantReview> findAll() {
        return etudiantReviewService.findAll();
    }

    public int save(EtudiantReview etudiantReview) {
        return etudiantReviewService.save(etudiantReview);
    }
}
