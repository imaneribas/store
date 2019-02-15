package store;

public class Item {
		private int ID,quantite;
		private double prix;
		private String name,type,nameItem,Author;

		public Item(int id,int quant,double price,String name,String type,String nameItem,String Author) {
			id=ID;
			quantite=quant;
			prix=price;
			this.name=name;
			this.type=type;
			this.nameItem=nameItem;
			this.Author=Author;
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
		public String gettype() {
			return type;
		}
		public void settype(String type) {
			this.type = type;
		}
		public String getnameItem() {
			return nameItem;
		}
		public void setnameItem(String nameItem) {
			this.nameItem = nameItem;
		}
		public String getAuthor() {
			return Author;
		}
		public void setAuthor(String Author) {
			this.Author = Author;
		}
		public void AddQuant(int quan) {
			quantite+=quan;
		}
		}
