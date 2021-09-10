package ma.learn.quiz.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class EtatEtudiant {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String reference;
    private String username;
    private String firstName;
    private String lastName;
    private String nationnalité;
    private String schedule1;
    private String schedule2;
    private String lastClass;
    private String nbr_class;
    private String etat;
    private Long etatNumber;

    public String getNbr_class() {
		return nbr_class;
	}

	public void setNbr_class(String nbr_class) {
		this.nbr_class = nbr_class;
	}

	public Long getEtatNumber() {
        return etatNumber;
    }

    public void setEtatNumber(Long etatNumber) {
        this.etatNumber = etatNumber;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getSchedule1() {
        return schedule1;
    }

    public void setSchedule1(String schedule1) {
        this.schedule1 = schedule1;
    }

    public String getSchedule2() {
        return schedule2;
    }

    public void setSchedule2(String schedule2) {
        this.schedule2 = schedule2;
    }

    public String getLastClass() {
        return lastClass;
    }

    public void setLastClass(String lastClass) {
        this.lastClass = lastClass;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationnalité() {
        return nationnalité;
    }

    public void setNationnalité(String nationnalité) {
        this.nationnalité = nationnalité;
    }
}
