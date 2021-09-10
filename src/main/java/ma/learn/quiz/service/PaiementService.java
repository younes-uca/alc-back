package ma.learn.quiz.service;

import ma.learn.quiz.bean.Admin;
import ma.learn.quiz.bean.Paiement;
import ma.learn.quiz.dao.AdminDao;
import ma.learn.quiz.dao.PaiementDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.persistence.EntityManager;

@Service
public class PaiementService {
  

    public List<Paiement> findAll() {
        return paiementDao.findAll();
    }
    
    public int save(Paiement paiement) {
     
        paiementDao.save(paiement);
        return 1;
    }
    @Autowired
    private PaiementDao paiementDao;
}
