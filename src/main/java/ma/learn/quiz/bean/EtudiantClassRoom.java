package ma.learn.quiz.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class EtudiantClassRoom {
	@Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private ClassRoom classRoom;
	@ManyToOne
	private Etudiant etudiant;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ClassRoom getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(ClassRoom classRoom) {
		this.classRoom = classRoom;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public EtudiantClassRoom(ClassRoom classRoom, Etudiant etudiant) {
		super();
		this.classRoom = classRoom;
		this.etudiant = etudiant;
	}
	public EtudiantClassRoom() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
