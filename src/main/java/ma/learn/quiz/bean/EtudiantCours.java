package ma.learn.quiz.bean;

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
