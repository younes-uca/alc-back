package ma.learn.quiz.bean;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class EtudiantCours {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 @ManyToOne
	private Etudiant etudiant;
 @ManyToOne
    private Cours cours ;
 @ManyToOne
    private Prof prof ;
	private String dateDebut;
	private String dateFin;

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
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

 
}
