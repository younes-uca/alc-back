package ma.learn.quiz.bean;

import javax.persistence.*;

@Entity
public class EtudiantReview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Etudiant etudiant;
    @ManyToOne
    private Prof prof;
    @ManyToOne
    private Cours cours;
    private int review;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Prof getProf() {
        return prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }
}
