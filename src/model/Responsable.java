package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the responsable database table.
 * 
 */
@Entity
@NamedQuery(name="Responsable.findAll", query="SELECT r FROM Responsable r")
public class Responsable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idResponsable;

	private String mail;

	private String nomComplet;

	private String password;

	public Responsable() {
	}

	public int getIdResponsable() {
		return this.idResponsable;
	}

	public void setIdResponsable(int idResponsable) {
		this.idResponsable = idResponsable;
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

}