package ma.learn.quiz.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class HomeWork {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelle;
    private String urlImage;
    private String urlVideo;
    private String question;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "homeWork")
     private List<HomeWorkEtudiant> homeWorkEtudiant;
    @OneToOne
    private Section section;
    @OneToOne
    private Quiz quiz;
    @OneToOne
    private TypeHomeWork typeHomeWork;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public TypeHomeWork getTypeHomeWork() {
        return typeHomeWork;
    }

    public void setTypeHomeWork(TypeHomeWork typeHomeWork) {
        this.typeHomeWork = typeHomeWork;
    }
}
