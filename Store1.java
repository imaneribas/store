package store1;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Store1 {

	public static Item1 item[]=new Item1[20];
	public static int  size=0;
	public static void main(String[] args) {
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
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
			
		case 8:
			System.exit(0);
			break;
	}}
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
    	int result1=1,result2=1,result3=1;
    	if(type.getText().toUpperCase().equals("B")){
    		result1=JOptionPane.showConfirmDialog(null,Book);
    		}
    	if(type.getText().toUpperCase().equals("G")){
    		result2=JOptionPane.showConfirmDialog(null,Game);
    		}
    	if(type.getText().toUpperCase().equals("S")){
    		result3=JOptionPane.showConfirmDialog(null,Shoes);
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
    			item[size]=new Item1(ID,Quan,PRICE,Name,TYPE,NAMETYPE,PLACE); 
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
	}

