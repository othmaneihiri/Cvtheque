package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the etudiant database table.
 * 
 */
@Entity
@NamedQuery(name="Etudiant.findAll", query="SELECT e FROM Etudiant e")
public class Etudiant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idEtudiant;

	private String imgEtudiant;

	private String mail;

	private String nomComplet;

	private String password;

	private byte profil;

	//bi-directional many-to-one association to Cv
	@ManyToOne
	@JoinColumn(name="idCv")
	private Cv cv;

	//bi-directional many-to-one association to Promotion
	@OneToMany(mappedBy="etudiant")
	private List<Promotion> promotions;

	public Etudiant() {
	}

	public int getIdEtudiant() {
		return this.idEtudiant;
	}

	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public String getImgEtudiant() {
		return this.imgEtudiant;
	}

	public void setImgEtudiant(String imgEtudiant) {
		this.imgEtudiant = imgEtudiant;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNomComplet() {
		return this.nomComplet;
	}

	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public byte getProfil() {
		return this.profil;
	}

	public void setProfil(byte profil) {
		this.profil = profil;
	}

	public Cv getCv() {
		return this.cv;
	}

	public void setCv(Cv cv) {
		this.cv = cv;
	}

	public List<Promotion> getPromotions() {
		return this.promotions;
	}

	public void setPromotions(List<Promotion> promotions) {
		this.promotions = promotions;
	}

	public Promotion addPromotion(Promotion promotion) {
		getPromotions().add(promotion);
		promotion.setEtudiant(this);

		return promotion;
	}

	public Promotion removePromotion(Promotion promotion) {
		getPromotions().remove(promotion);
		promotion.setEtudiant(null);

		return promotion;
	}

}