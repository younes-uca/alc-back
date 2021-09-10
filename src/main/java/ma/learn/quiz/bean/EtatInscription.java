package ma.learn.quiz.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class EtatInscription {
	 @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String libelle;
	private String ref;
	
	//@OneToOne
	//private Inscription inscription ;
	 
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
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	
	

}
