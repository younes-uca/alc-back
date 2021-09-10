package ma.learn.quiz.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class FaqType {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String libelle;
	private String destinataire;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToMany(mappedBy = "faqType")
	private List<Faq> faq;
	
	public String getDestinataire() {
		return destinataire;
	}
	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}
	public List<Faq> getFaq() {
		return faq;
	}
	public void setFaq(List<Faq> faq) {
		this.faq = faq;
	}
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
	
	

}
