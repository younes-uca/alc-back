package ma.learn.quiz.dao;


import ma.learn.quiz.bean.EtatEtudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatEtudiantDao extends JpaRepository<EtatEtudiant, Long> {
    EtatEtudiant findByReference(String reference);

    int deleteByReference(String reference);
}
