package store;

public class Sale {
	int idCustomer, idItem, Quan;
	String nameItem;
	public Sale(int idCustomer, int idItem, int quan, String nameItem) {
		super();
		this.idCustomer = idCustomer;
		this.idItem = idItem;
		Quan = quan;
		this.nameItem = nameItem;
	}
	public int getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	public int getIdItem() {
		return idItem;
	}
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	public int getQuan() {
		return Quan;
	}
	public void setQuan(int quan) {
		Quan = quan;
	}
	public String getNameItem() {
		return nameItem;
	}
	public void setNameItem(String nameItem) {
		this.nameItem = nameItem;
	}
	

}
