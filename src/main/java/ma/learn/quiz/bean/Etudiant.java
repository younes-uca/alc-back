package ma.learn.quiz.bean;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Etudiant extends User{

	private String ref;
	private int age;
	private String login;
	private String numero;
	private String ville;
	private String address;
	private String password;
	private String gmail;
	@ManyToOne
	private Prof prof;
	@ManyToOne
	private EtatEtudiantSchedule etatEtudiantSchedule;
	@ManyToOne
	private Parcours parcours;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToMany(mappedBy = "etudiant")
	private List<QuizEtudiant> quizEtudiant;

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public Prof getProf() {
		return prof;
	}

	public void setProf(Prof prof) {
		this.prof = prof;
	}

    public Etudiant(String ref, String nom, String prenom, int age, String login, String ville, String address, String password, String image, String gmail, Prof prof, EtatEtudiantSchedule etatEtudiantSchedule, Parcours parcours, List<QuizEtudiant> quizEtudiant) {
        this.ref = ref;
        this.age = age;
        this.login = login;
        this.ville = ville;
        this.address = address;
        this.password = password;
        this.gmail = gmail;
        this.prof = prof;
        this.etatEtudiantSchedule = etatEtudiantSchedule;
        this.parcours = parcours;
        this.quizEtudiant = quizEtudiant;
    }


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public List<QuizEtudiant> getQuizEtudiant() {
		return quizEtudiant;
	}

	public void setQuizEtudiant(List<QuizEtudiant> quizEtudiant) {
		this.quizEtudiant = quizEtudiant;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Parcours getParcours() {
		return parcours;
	}

	public void setParcours(Parcours parcours) {
		this.parcours = parcours;
	}

	public EtatEtudiantSchedule getEtatEtudiantSchedule() {
		return etatEtudiantSchedule;
	}

	public void setEtatEtudiantSchedule(EtatEtudiantSchedule etatEtudiantSchedule) {
		this.etatEtudiantSchedule = etatEtudiantSchedule;
	}

}