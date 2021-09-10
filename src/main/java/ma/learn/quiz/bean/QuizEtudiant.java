package ma.learn.quiz.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
public class QuizEtudiant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Etudiant etudiant;
	@ManyToOne
	private Quiz quiz;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToMany(mappedBy = "quizEtudiant")
	private List<ReponseEtudiant> reponseEtudiant;
	private Double note;
	private String  resultat;
	private String ref;
	private Long questionCurrent;

	public Long getQuestionCurrent() {
		return questionCurrent;
	}

	public void setQuestionCurrent(Long questionCurrent) {
		this.questionCurrent = questionCurrent;
	}

	public List<ReponseEtudiant> getReponseEtudiant() {
		return reponseEtudiant;
	}
	public void setReponseEtudiant(List<ReponseEtudiant> reponseEtudiant) {
		this.reponseEtudiant = reponseEtudiant;
	}
	public Long getId() {
		return id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getResultat() {
		return resultat;
	}
	public void setResultat(String resultat) {
		this.resultat = resultat;
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
	public Quiz getQuiz() {
		return quiz;
	}
	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}
	public Double getNote() {
		return note;
	}
	public void setNote(Double note) {
		this.note = note;
	}
}
