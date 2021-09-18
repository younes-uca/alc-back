package ma.learn.quiz.bean;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Prof extends User{
    private String numero;
    private String login;
	private String email;
	private String ref;
	private String addresse;
	@ManyToOne
	private CategorieProf categorieProf;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "responsable")
    private List<ClassRoom> classRooms ;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "prof")
    private List<RecommendTeacher> recommendTeacher ;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "prof")
    private List<Etudiant> etudiantList ;

	public Prof() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	
	public List<Etudiant> getEtudiantList() {
		return etudiantList;
	}





	public Prof(String numero, String nom, String prenom, String login, String password, String email, String ref,
			String addresse, String image, CategorieProf categorieProf, List<ClassRoom> classRooms,
			List<RecommendTeacher> recommendTeacher, List<Etudiant> etudiantList) {
		super();
		this.numero = numero;
		this.login = login;
		this.email = email;
		this.ref = ref;
		this.addresse = addresse;
		this.categorieProf = categorieProf;
		this.classRooms = classRooms;
		this.recommendTeacher = recommendTeacher;
		this.etudiantList = etudiantList;
	}





	public void setEtudiantList(List<Etudiant> etudiantList) {
		this.etudiantList = etudiantList;
	}




	public String getAddresse() {
		return addresse;
	}


	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}


	public List<RecommendTeacher> getRecommendTeacher() {
		return recommendTeacher;
	}

	public void setRecommendTeacher(List<RecommendTeacher> recommendTeacher) {
		this.recommendTeacher = recommendTeacher;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<ClassRoom> getClassRooms() {
		return classRooms;
	}

	public void setClassRooms(List<ClassRoom> classRooms) {
		this.classRooms = classRooms;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	

	public CategorieProf getCategorieProf() {
		return categorieProf;
	}

	public void setCategorieProf(CategorieProf categorieProf) {
		this.categorieProf = categorieProf;
	}
    
}
