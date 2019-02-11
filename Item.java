package store;

public class Item {
private int ID,quantite;
private double prix;
private String name;
public Item(int ID,double prix,String name) {
	this.ID=ID;
	this.prix=prix;
	this.name=name;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public String getname() {
	return name;
}
public void setname(String name) {
	this.name = name;
}


}
