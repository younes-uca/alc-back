package ma.learn.quiz.service;


import ma.learn.quiz.bean.EtatEtudiant;
import ma.learn.quiz.dao.EtatEtudiantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EtatEtudiantService {
    @Autowired
    private EtatEtudiantDao etatEtudiantDao;


    public EtatEtudiant findByReference(String reference) {
        return etatEtudiantDao.findByReference(reference);
    }


    public EtatEtudiant save(EtatEtudiant etatEtudiant) {
        if (findByReference(etatEtudiant.getReference()) == null) {
            etatEtudiantDao.save(etatEtudiant);
        }
        return etatEtudiant;
    }


    public EtatEtudiant update(EtatEtudiant etatEtudiant) {
        return etatEtudiantDao.save(etatEtudiant);
    }

    public List<EtatEtudiant> findAll() {
        return etatEtudiantDao.findAll();
    }

    @Transactional
    public int deleteByReference(String reference) {
        return etatEtudiantDao.deleteByReference(reference);
    }


    @Transactional
    public int deleteByReference(List<EtatEtudiant> etatEtudiants) {
        int res = 0;
        for (int i = 0; i < etatEtudiants.size(); i++) {
            res += deleteByReference(etatEtudiants.get(i).getReference());
        }
        return res;
    }

}
