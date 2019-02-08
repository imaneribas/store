package etage;

public class book {
	 private String titre,auteur;
	 private int nbPages;
	 private double prix;
	 public book(String unAuteur,String unTitre) {
		 auteur=unAuteur;
		 titre=unTitre;
	 }
	 public String toString() {
		 return "Livre: titre "+ titre + " ,auteur "+ auteur + " ,nb pages"+nbPages+ ", prix "+prix;
	 }
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public int getNbPages() {
		return nbPages;
	}
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	 }
