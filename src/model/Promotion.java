package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(name="Promotion.findAll", query="SELECT p FROM Promotion p")

public class Promotion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	int idPromotion;
	int anneeDebut;
	int anneeFin;
	int idEtudiant;
	
	
	@ManyToOne
	@JoinColumn(name="idEtudiant")
	private Etudiant etudiant;

	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public int getIdPromotion() {
		return idPromotion;
	}
	public void setIdPromotion(int idPromotion) {
		this.idPromotion = idPromotion;
	}
	public int getAnneeDebut() {
		return anneeDebut;
	}
	public void setAnneeDebut(int anneeDebut) {
		this.anneeDebut = anneeDebut;
	}
	public int getAnneeFin() {
		return anneeFin;
	}
	public void setAnneeFin(int anneeFin) {
		this.anneeFin = anneeFin;
	}
	public int getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

}
