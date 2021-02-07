package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the experiencepro database table.
 * 
 */
@Entity
@NamedQuery(name="Experiencepro.findAll", query="SELECT e FROM Experiencepro e")
public class Experiencepro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idExp;

	@Temporal(TemporalType.DATE)
	private Date dateDebut;

	
	@Temporal(TemporalType.DATE)
	private Date dateFin;

	

	private String description;

	

	private String lieu;


	private String nomEntreprise;


	private String poste;



	private String typeEmploi;



	//bi-directional many-to-one association to Cv
	@OneToMany(mappedBy="experiencepro")
	private List<Cv> cvs;

	public Experiencepro() {
	}

	public int getIdExp() {
		return this.idExp;
	}

	public void setIdExp(int idExp) {
		this.idExp = idExp;
	}

	

	public Date getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	

	public Date getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public String getLieu() {
		return this.lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	
	public String getNomEntreprise() {
		return this.nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	

	public String getPoste() {
		return this.poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}



	public String getTypeEmploi() {
		return this.typeEmploi;
	}

	public void setTypeEmploi(String typeEmploi) {
		this.typeEmploi = typeEmploi;
	}

	public List<Cv> getCvs() {
		return this.cvs;
	}

	public void setCvs(List<Cv> cvs) {
		this.cvs = cvs;
	}

	public Cv addCv(Cv cv) {
		getCvs().add(cv);
		cv.setExperiencepro(this);

		return cv;
	}

	public Cv removeCv(Cv cv) {
		getCvs().remove(cv);
		cv.setExperiencepro(null);

		return cv;
	}

}