package auteur;

public class auteur {
String nom;
MaDate naissance;
public auteur(String nom) {
	this.nom=nom;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public MaDate getNaissance() {
	return naissance;
}
public void setNaissance(MaDate naissance) {
	this.naissance = naissance;
}
public String toString() {
	
	return "votre nom est:"+nom+" votre date de naissance est:"+naissance;
}
public boolean equals(Object o) {
	if(this==o)return true;
	else return false;
}

}
