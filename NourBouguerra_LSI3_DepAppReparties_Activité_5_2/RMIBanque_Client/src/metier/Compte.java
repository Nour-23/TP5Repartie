package metier;

import java.util.Date;

public class Compte {
	private int compte;
	private double solde;
	private Date datecrea;

	public Compte(int i, double d, Object object) {
		// TODO Auto-generated constructor stub
	}

	public int getCompte() {
		return compte;
	}

	public void setCompte(int compte) {
		this.compte = compte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Date getDatecrea() {
		return datecrea;
	}

	public void setDatecrea(Date datecrea) {
		this.datecrea = datecrea;
	}
}
