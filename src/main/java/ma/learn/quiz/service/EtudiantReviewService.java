package ma.learn.quiz.service;


import ma.learn.quiz.bean.EtudiantReview;
import ma.learn.quiz.dao.EtudiantReviewDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public
class EtudiantReviewService {
    @Autowired
    private EtudiantReviewDao etudiantReviewDao;

    public EtudiantReview findByReview(int review) {
        return etudiantReviewDao.findByReview(review);
    }

    public int deleteByReview(int review) {
        return etudiantReviewDao.deleteByReview(review);
    }

    public List<EtudiantReview> findAll() {
        return etudiantReviewDao.findAll();
    }
    public int save(EtudiantReview etudiantReview) {
        EtudiantReview ETDV = findByReview(etudiantReview.getReview());
        if (ETDV == null) {
            return -1;
        }else if (ETDV != null) {
            return -2;
        } else {
            etudiantReviewDao.save(etudiantReview);
            return 1;
        }
    }

}
