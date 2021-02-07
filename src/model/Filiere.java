package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the filiere database table.
 * 
 */
@Entity
@NamedQuery(name="Filiere.findAll", query="SELECT f FROM Filiere f")
public class Filiere implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idFiliere;



	private String nomfiliere;



	//bi-directional many-to-one association to Promotion
	@ManyToOne
	@JoinColumn(name="idPromotion")
	private Promotion promotion;

	public Filiere() {
	}

	
	public int getIdFiliere() {
		return this.idFiliere;
	}

	public void setIdFiliere(int idFiliere) {
		this.idFiliere = idFiliere;
	}

	
	public String getNomfiliere() {
		return this.nomfiliere;
	}

	public void setNomfiliere(String nomfiliere) {
		this.nomfiliere = nomfiliere;
	}

	public Promotion getPromotion() {
		return this.promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

}