package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the admin database table.
 * 
 */
@Entity
@NamedQuery(name="Admin.findAll", query="SELECT a FROM Admin a")
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idAdmin;



	private String mail;


	private String nomComplet;



	private String password;



	public Admin() {
	}

	public int getIdAdmin() {
		return this.idAdmin;
	}

	

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
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