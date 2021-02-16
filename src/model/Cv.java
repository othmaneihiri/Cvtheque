package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cv database table.
 * 
 */
@Entity
@NamedQuery(name="Cv.findAll", query="SELECT c FROM Cv c")
public class Cv implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCv;

	private String adresse;

	private String description;

	private String pays;

	private String titre;

	private String ville;

	//bi-directional many-to-one association to Formation
	@ManyToOne
	@JoinColumn(name="idFormation")
	private Formation formation;

	//bi-directional many-to-one association to Experiencepro
	@ManyToOne
	@JoinColumn(name="idExp")
	private Experiencepro experiencepro;

	//bi-directional many-to-one association to Competance
	@ManyToOne
	@JoinColumn(name="idCompetance")
	private Competance competance;

	//bi-directional many-to-one association to Etudiant
	@OneToMany(mappedBy="cv")
	private List<Etudiant> etudiants;

	public Cv() {
	}

	public int getIdCv() {
		return this.idCv;
	}

	public void setIdCv(int idCv) {
		this.idCv = idCv;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPays() {
		return this.pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Formation getFormation() {
		return this.formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	public Experiencepro getExperiencepro() {
		return this.experiencepro;
	}

	public void setExperiencepro(Experiencepro experiencepro) {
		this.experiencepro = experiencepro;
	}

	public Competance getCompetance() {
		return this.competance;
	}

	public void setCompetance(Competance competance) {
		this.competance = competance;
	}

	public List<Etudiant> getEtudiants() {
		return this.etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public Etudiant addEtudiant(Etudiant etudiant) {
		getEtudiants().add(etudiant);
		etudiant.setCv(this);

		return etudiant;
	}

	public Etudiant removeEtudiant(Etudiant etudiant) {
		getEtudiants().remove(etudiant);
		etudiant.setCv(null);

		return etudiant;
	}

}