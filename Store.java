package store;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Store {

	public static void main(String[] args) {
		mainMenu();
	}
	public static void mainMenu() {
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
	}
	}
	private static void AddItem() {
		    JTextField id=new JTextField();  
		    JTextField name=new JTextField();			
		    JTextField quan=new JTextField();	
		    JTextField price=new JTextField();	
		    JTextField type=new JTextField();
		    JTextField nameType=new JTextField();
		    JTextField palceandother=new JTextField();
		    Object [] Messages ={" Enter item Number", id,"Enter item name",name," Enter item quantité",quan," Enter item prix",price," Enter item type of item (B)Book, (S)shoes, (G)Game ?",type};
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
    	
    }
    
	}
}

