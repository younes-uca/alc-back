package ma.learn.quiz.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ReponseEtudiant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Reponse reponse;
	private String answer;
	private String ref; 
	@ManyToOne
	private QuizEtudiant quizEtudiant;
	private Double note;

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public QuizEtudiant getQuizEtudiant() {
		return quizEtudiant;
	}
	public void setQuizEtudiant(QuizEtudiant quizEtudiant) {
		this.quizEtudiant = quizEtudiant;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Reponse getReponse() {
		return reponse;
	}
	public void setReponse(Reponse reponse) {
		this.reponse = reponse;
	}
	public Double getNote() {
		return note;
	}
	public void setNote(Double note) {
		this.note = note;
	}
	
	
	
}
