package fr.nvne.espacecollaborateur.web;

public class EntrepriseForm {
	private String nomEntreprise;
	private String nom;
	private String prenom;
	private String dateDeNaissance;
	private String tel;
	private String email;
	private String ackCallBack;
	private String ackCgu;
	public EntrepriseForm() {
		super();
	}
	public EntrepriseForm(String nomEntreprise, String nom, String prenom, String dateDeNaissance, String tel,
			String email, String ackCallBack, String ackCgu) {
		super();
		this.nomEntreprise = nomEntreprise;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.tel = tel;
		this.email = email;
		this.ackCallBack = ackCallBack;
		this.ackCgu = ackCgu;
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAckCallBack() {
		return ackCallBack;
	}
	public void setAckCallBack(String ackCallBack) {
		this.ackCallBack = ackCallBack;
	}
	public String getAckCgu() {
		return ackCgu;
	}
	public void setAckCgu(String ackCgu) {
		this.ackCgu = ackCgu;
	}
}
