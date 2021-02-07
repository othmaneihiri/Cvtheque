package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the competance database table.
 * 
 */
@Entity
@NamedQuery(name="Competance.findAll", query="SELECT c FROM Competance c")
public class Competance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCompetance;

	private String nomCompetance;

	

	//bi-directional many-to-one association to Cv
	@OneToMany(mappedBy="competance")
	private List<Cv> cvs;

	public Competance() {
	}

	public int getIdCompetance() {
		return this.idCompetance;
	}

	public void setIdCompetance(int idCompetance) {
		this.idCompetance = idCompetance;
	}

	
	
	public String getNomCompetance() {
		return this.nomCompetance;
	}

	public void setNomCompetance(String nomCompetance) {
		this.nomCompetance = nomCompetance;
	}

	public List<Cv> getCvs() {
		return this.cvs;
	}

	public void setCvs(List<Cv> cvs) {
		this.cvs = cvs;
	}

	public Cv addCv(Cv cv) {
		getCvs().add(cv);
		cv.setCompetance(this);

		return cv;
	}

	public Cv removeCv(Cv cv) {
		getCvs().remove(cv);
		cv.setCompetance(null);

		return cv;
	}

}