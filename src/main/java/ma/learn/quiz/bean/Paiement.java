package ma.learn.quiz.bean;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date dateDebut;
    private Date dateFin;
    private BigDecimal nbrSeceance;
    private BigDecimal totalHeure;
    private BigDecimal montant;
    private int nonPaye;
    @ManyToOne
    private Prof prof;



    public BigDecimal getMontant() {
        return montant;
    }


    public int getNonPaye() {
        return nonPaye;
    }

    public void setNonPaye(int nonPaye) {
        this.nonPaye = nonPaye;
    }

    public Prof getProf() {
        return prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public BigDecimal getNbrSeceance() {
        return nbrSeceance;
    }

    public void setNbrSeceance(BigDecimal nbrSeceance) {
        this.nbrSeceance = nbrSeceance;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public BigDecimal getTotalHeure() {
        return totalHeure;
    }

    public void setTotalHeure(BigDecimal totalHeure) {
        this.totalHeure = totalHeure;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
}
