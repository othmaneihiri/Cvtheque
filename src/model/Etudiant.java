package model;

import java.io.Serializable;
import javax.persistence.*;


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

	

	private Object profil;



	//bi-directional one-to-one association to Cv
	@OneToOne(mappedBy="etudiant")
	private Cv cv1;

	//bi-directional many-to-one association to Cv
	@ManyToOne
	@JoinColumn(name="idCv")
	private Cv cv2;

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

	

	public Object getProfil() {
		return this.profil;
	}

	public void setProfil(Object profil) {
		this.profil = profil;
	}

	public Cv getCv1() {
		return this.cv1;
	}

	public void setCv1(Cv cv1) {
		this.cv1 = cv1;
	}

	public Cv getCv2() {
		return this.cv2;
	}

	public void setCv2(Cv cv2) {
		this.cv2 = cv2;
	}

}