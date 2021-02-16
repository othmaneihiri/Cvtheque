package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the promotion database table.
 * 
 */
@Entity
@NamedQuery(name="Promotion.findAll", query="SELECT p FROM Promotion p")
public class Promotion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idPromotion;

	private int anneeDebut;

	private int anneeFin;

	//bi-directional many-to-one association to Filiere
	@OneToMany(mappedBy="promotion")
	private List<Filiere> filieres;

	//bi-directional many-to-one association to Etudiant
	@ManyToOne
	@JoinColumn(name="idEtudiant")
	private Etudiant etudiant;

	public Promotion() {
	}

	public int getIdPromotion() {
		return this.idPromotion;
	}

	public void setIdPromotion(int idPromotion) {
		this.idPromotion = idPromotion;
	}

	public int getAnneeDebut() {
		return this.anneeDebut;
	}

	public void setAnneeDebut(int anneeDebut) {
		this.anneeDebut = anneeDebut;
	}

	public int getAnneeFin() {
		return this.anneeFin;
	}

	public void setAnneeFin(int anneeFin) {
		this.anneeFin = anneeFin;
	}

	public List<Filiere> getFilieres() {
		return this.filieres;
	}

	public void setFilieres(List<Filiere> filieres) {
		this.filieres = filieres;
	}

	public Filiere addFiliere(Filiere filiere) {
		getFilieres().add(filiere);
		filiere.setPromotion(this);

		return filiere;
	}

	public Filiere removeFiliere(Filiere filiere) {
		getFilieres().remove(filiere);
		filiere.setPromotion(null);

		return filiere;
	}

	public Etudiant getEtudiant() {
		return this.etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

}