package ma.learn.quiz.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class FaqProf {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String libelle;
	private String description;
	@ManyToOne
	private Prof prof;
	@ManyToOne
	private FaqType faqType;
	@ManyToOne
	private Admin admin;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Prof getProf() {
		return prof;
	}
	public void setProf(Prof prof) {
		this.prof = prof;
	}
	public FaqType getFaqType() {
		return faqType;
	}
	public void setFaqType(FaqType faqType) {
		this.faqType = faqType;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	

}
