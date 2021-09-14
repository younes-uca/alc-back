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

    public EtudiantReview findByEtudiantIdAndCoursId(long id, long ids) {
        return etudiantReviewDao.findByEtudiantIdAndCoursId(id, ids);
    }

    public int save(EtudiantReview etudiantReview) {
        EtudiantReview ETDV = etudiantReviewDao.findByEtudiantIdAndCoursId(etudiantReview.getEtudiant().getId(),etudiantReview.getCours().getId());
        if (etudiantReview.getReview() == 0) {
            return -1;
        }else if (ETDV != null) {
            return -2;
        } else {
            etudiantReview.setProf(etudiantReview.getEtudiant().getProf());
            etudiantReviewDao.save(etudiantReview);
            return 1;
        }
    }
}
