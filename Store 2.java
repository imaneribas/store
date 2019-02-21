package store;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Store {

	public static Item item[]=new Item[20];
	public static int  size=0;
	public static int  [] cart=new int [10];
	public static Customer [] customer=new Customer[20];
	public static int size1=0;
	public static Sale sale[]=new Sale[20];
	public static int size2=0;
	public static void main(String[] args) {
		for(int i=0;i<cart.length;i++){
			cart[i]=-1;
			}
		mainMenu();
	}
	public static void mainMenu() {
		while(true) {
		String Menu="1 Store system Menu \n"
	                 +"2 Add a new item to the Store\n"
				+"3 Add a new Custmer to the Store \n"
	                 +"4 Remove an item from Custmer shopping cart \n"
				+"5 View the items in custmer shopping cart \n"
	                 +"6 End shoping and go to checkout \n"
				+"7 Empty Custmer shopping cart \n"
	                 +"8 Exist the program";
		String Num=JOptionPane.showInputDialog(null,Menu);
		int ch=Integer.parseInt(Num);switch(ch){
		case 1:
			AddItem();
			break;
		case 2:
			AddCustomer();
			break;
		case 3:
			Addanitemcustomershoppingincart();
			break;
		case 4:
			String ID=JOptionPane.showInputDialog(null, "entrer num du customer");
			int id=Integer.parseInt(ID);
			RemoveanitemfromCustomershoppingcart(id);
			break;
		case 5:
			String IDC=JOptionPane.showInputDialog(null, "entrer id");
			 int idc=Integer.parseInt(IDC);
			 Display(idc);
			break;
		case 6:
			String iDc=JOptionPane.showInputDialog(null, "entrer id");
			 int IDc=Integer.parseInt(iDc);
			endshoppingandgotocheckout(IDc);
			break;
		case 7:
			break;
			
		case 8:
			System.exit(0);
			break;
	}}
	}
	private static void endshoppingandgotocheckout(int id) {
		// TODO Auto-generated method stub
		if(-1 !=SearchIdCustomer(id)) {
			Display(id);
			for(int i=0;i<size1;i++) {
				if(id==customer[i].getId()) {
					for(int j=i;j<size1;j++) {
						if(size1-1==j) {
							size1--;
							JOptionPane.showMessageDialog(null, "delete success");
							break;
					}customer[i]=customer[i+1];
					}
					
				}
			}
		}else {
			JOptionPane.showMessageDialog(null, "customer doesn t exist");
		
			
		}
		
	}
	private static void Display(int id) {
		// TODO Auto-generated method stub
		if(-1 !=SearchIdCustomer(id)) {
			int TOTAL=0;
			String Data="item no item name quantity quantityprice totalprice";
			for(int i=0;i<size2;i++) {
				int qu=sale[i].getQuan();
				int index=searchNameItem(sale[i].getNameItem());
				int Total=(int) (qu*item[index].getPrix());
				TOTAL+=Total;
						Data=" \n     "+sale[i].getIdItem()+"         "+sale[i].getNameItem()+"          "+qu+"            "+item[index].getPrix()+"           "+Total;
			}
			Data=" \n\n     prix"+TOTAL;
			JOptionPane.showMessageDialog(null, Data);
		}
		else {
			JOptionPane.showMessageDialog(null, "customer doesn t exist");
		}
		
	}
	private static void RemoveanitemfromCustomershoppingcart(int id) {
		// TODO Auto-generated method stub
		int searchId=SearchIdCustomer(id);
		if(searchId != - 1) {
			ArrayList<String> nameItemSale=new ArrayList<>();
			ArrayList<Integer> indexSale=new ArrayList<>();
			String data="the customer no:"+customer[searchId].getId()+",the customer name : "+customer[searchId].getName()+"\n";
		    for(int i=0;i<size2;i++) {
		    	if(id==sale[i].getIdCustomer()) {
		    		nameItemSale.add(sale[i].getNameItem());
		    		indexSale.add(i);
		    		data+="\n "+(i+1)+"- "+sale[i].getIdItem()+" "+sale[i].getNameItem()+"  ["+sale[i].getQuan()+"]  \n" ;
		    	}
		    }
		    String data1="hat do you want to modify?\n"
		    		+"R.Remove item from the shopping cart \n"
		    		+"M.Return to the main menu\n"
		    		+"entrer your choice [RRemove, M main Menu] \n";
		    String ch =JOptionPane.showInputDialog(null, data+"\n"+data1);
		    if(ch.toUpperCase().equals("M")) {
		    	return;
		    	
		    }else if(ch.toUpperCase().equals("R")) {
		    	String CH=JOptionPane.showInputDialog(null, data); 
		    	int Ch=Integer.parseInt(CH);
		    	if(Ch==0) {
		    		return;
		    	}
		    	String nameItem=nameItemSale.get(Ch-1);
		    	String Message="the item ("+sale[indexSale.get(Ch-1)].getIdItem()+"  "+"nameItem"+"["+sale[indexSale.get(Ch-1)].getQuan()+"IS REMOVED";
		    	int Quan=DeleteItem(nameItem,id);
		    	int indexNameItem=searchNameItem(nameItem);
		    	int total=item[indexNameItem].getQuantite()+Quan;
		    	item[indexNameItem].setQuantite(total);
		    	JOptionPane.showMessageDialog(null, Message);
		    }
		}else {
			JOptionPane.showMessageDialog(null, "num n exciste pas deja");
		}
		
	}
	private static int DeleteItem(String nameItem, int id) {
		// TODO Auto-generated method stub
		 for(int i=0;i<size2;i++) {
			 if(id==sale[i].getIdCustomer()) {
				 if(nameItem.equals(sale[i].getNameItem())) {
					 if(size2-1==i) {
						 int quan=sale[i].getQuan();
						 size2--; 
						 return quan;
					 }
					 int quan=sale[i].getQuan();
					 sale[i]=sale[i+1];
					 size2--; 
					 return quan;
				 }
			 }
		 }
		return 0;
	}
	private static void Addanitemcustomershoppingincart() {
		int un=-1;
		do{
			String IDCustomer=JOptionPane.showInputDialog(null,"entrer numero customer");
			int id=Integer.parseInt(IDCustomer);
			int index=SearchIdCustomer(id);
			if(index!=1) {
				int no =addItemCart(index);
				if(no==0) {
					return;
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "no customer dispo");
			}
			String NumberYes=JOptionPane.showInputDialog(null, "do you want to try 1/0?");
			un=Integer.parseInt(NumberYes);
		}while(un==1);
		
	}
	private static int addItemCart(int index) {
		int un=-1;
		do {
		// TODO Auto-generated method stub
		String data="the customer no:"+customer[index].getId()+",the customer name :"+customer[index].getName()+".\nIems in the store";
		 ArrayList<String> list=new ArrayList<>();
		for (int i=0;i<size;i++) {
			list.add(item[i].getname()); 
			data+="\n "+(i+1)+"- "+item[i].getID()+" "+item[i].getname()+"  ["+item[i].getQuantite()+"]  \n" ;
		}
		data+=".....\n"
		       +"0.Return to a main menu \n"
		       +"entrer your item choice:";
		String NumberChoose=JOptionPane.showInputDialog(null, data);
		int numberChoose=Integer.parseInt(NumberChoose);
		if(numberChoose==0) {
		return 0;
	}else{
		String Choose="";
		String nameItem="";
		int Quan=0;
		int idItem=1; 
		for(int i=0;i<size;i++){
		if(list.get(numberChoose-1).equals(item[i].getname())){
		Quan=item[i].getQuantite();
		idItem=item[i].getID();
		nameItem=item[i].getname();
		Choose="The item is ["+idItem+"   "+nameItem+"    ["+Quan+"]]  \\nEnter the required quantity:";
		break;
		
		}
		}
		String Ch=JOptionPane.showInputDialog(null,Choose);
		int quan=Integer.parseInt(Ch);
		if(Quan>=quan && quan >0 && Quan!=0){
			sale[size2]=new Sale(customer[index].getId(),idItem,Quan,nameItem);
			int total=Quan-quan;
			int IndexNameItem=searchNameItem(nameItem);
			item[IndexNameItem].setQuantite(total);
			size2++;
			JOptionPane.showMessageDialog(null,"le produit est ajouté au chariot");
			return -1;

		}
		String yes_no=JOptionPane.showInputDialog(null,"sorry the required quantity is not available, the available quantity is ["+Quan+"],try again! \n"+"Do you want add another item to shopping cart (y/n)?y");
		un =Integer.parseInt(yes_no);
	}
	}while(un==1);
	
		return index-1;
	}
	private static void AddItem() {
		int nu=-1;
		do {
		    JTextField id=new JTextField();  
		    JTextField name=new JTextField();			
		    JTextField quan=new JTextField();	
		    JTextField price=new JTextField();	
		    JTextField type=new JTextField();
		    JTextField nameType=new JTextField();
		    JTextField palceandother=new JTextField();
		    Object [] Messages ={" Enter item Number", id,"Enter item name",name," Enter item quantit�",quan," Enter item prix",price," Enter item type of item (B)Book, (S)shoes, (G)Game ?",type};
    int yes_no =JOptionPane.showConfirmDialog(null,Messages);
    if(yes_no==0){
    	Object [] Book={"Enter Book Title : " ,nameType,"Enter booki author: ",palceandother };
    	Object [] Game ={"Enter Game number: " ,nameType,"Enter place of manufacture: ",palceandother };
    	Object [] Shoes={"Enter shoes number: " ,nameType,"Enter place of manufacture: ",palceandother };
    	int result1=1;
    	if(type.getText().toUpperCase().equals("B")){
    		result1=JOptionPane.showConfirmDialog(null,Book);
    		}
    	if(type.getText().toUpperCase().equals("G")){
    		result1=JOptionPane.showConfirmDialog(null,Game);
    		}
    	if(type.getText().toUpperCase().equals("S")){
    		result1=JOptionPane.showConfirmDialog(null,Shoes);
    		}
    	if(yes_no==JOptionPane.YES_OPTION && result1== JOptionPane.YES_OPTION) {
    		int ID=Integer.parseInt(id.getText());
    		String Name=name.getText();
    		String TYPE=type.getText();
    		String NAMETYPE=nameType.getText();
    		String PLACE =palceandother.getText();
    		int Quan=Integer.parseInt(quan.getText());
    		int PRICE=Integer.parseInt(price.getText());
    		
    		int index=searchIDITem(ID);
    		int indexName=searchNameItem(Name);
    		if(indexName!=-1) {
    			item[indexName]. AddQuant(Quan); 
    			JOptionPane.showMessageDialog(null, "nom existe deja");
    			
    		}
    		if(index ==-1) {
    			item[size]=new Item(ID,Quan,PRICE,Name,TYPE,NAMETYPE,PLACE); 
    			size++;
    			JOptionPane.showMessageDialog(null, "bien saisi");
    		}
    	}
    		else {
    			JOptionPane.showMessageDialog(null, "existe deja");
    		}
    }
  
    String re=JOptionPane.showInputDialog(null, "do you want add onother item 1/0");
    nu=Integer.parseInt(re);
    
}while(nu == 1);} 
	private static int searchNameItem(String name) {
		// TODO Auto-generated method stub
		for (int i=0;i<size;i++) {
    		if(name.equals(item[i].getname())) {
    			return i;
    		}
    		
    	}
    	return -1;
    }
	
	
	private static int searchIDITem(int iD) {
		
		// TODO Auto-generated method stub
		for (int i=0;i<size;i++) {
		if(iD==item[i].getID()) {
			return i;
		}
		}
	
	return -1;
}
	private static void AddCustomer() {
		int nu=-1;
		do{
		JTextField id = new JTextField();
		JTextField name = new JTextField();
		Object message[]={"Enter Customer number :",id,"Enter Customer name",name};
		int yes =JOptionPane.showConfirmDialog(null,message);
		if(yes==JOptionPane.YES_OPTION){
			int ID=Integer.parseInt(id.getText());
			int index=SearchCart(ID);
			if(SearchIdCustomer(ID)!=-1){
				JOptionPane.showMessageDialog(null,"client deja ajouté");
				return;
				}
			if(index!=-1) {
				customer[size1]=new Customer(ID,index+1,name.getText());
				size1++;
				JOptionPane.showMessageDialog(null,"client ajouté");
				}
			else {
				JOptionPane.showMessageDialog(null,"il n'ya pas de cart vide");
			}
		}
		String re=JOptionPane.showInputDialog(null, "do you want add onother item 1/0");
	    nu=Integer.parseInt(re);
		}while(nu==1);
		
	}
	
	private static int SearchCart(int ID) {
		for(int i=0;i<cart.length;i++){
			if(cart[i]==-1){
			cart[i]=ID;
			return i;
			}
			}
			return -1;
	}
	private static int SearchIdCustomer(int ID) {
		for(int i=0;i<size1;i++){
			if(customer[i].getId()==ID){
			return i;
			}
			}
			return -1;
	}
	}