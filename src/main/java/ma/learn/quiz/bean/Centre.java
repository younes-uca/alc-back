package ma.learn.quiz.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Centre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String libelle;
	private String description ;
	private String log;
	private String password;
	private String ref;
	
	 @JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	    @OneToMany(mappedBy="centre")
	    private List<Parcours> parcourss;
	   
	
	public List<Parcours> getParcourss() {
		return parcourss;
	}
	public void setParcourss(List<Parcours> parcourss) {
		this.parcourss = parcourss;
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
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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

	
}

