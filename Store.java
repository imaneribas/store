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
    JTextField name=new JTextField();		
    JTextField ID=new JTextField();	
    JTextField quantite=new JTextField();	
    JTextField prix=new JTextField();	
    JTextField type=new JTextField();
    JTextField other=new JTextField();
    Object [] Messages ={"Enter item name",name," Enter item Number", ID, " Enter item prix",
    		prix," Enter item type",type," Enter item other",other};
    int yes_no =JOptionPane.showConfirmDialog(null,Messages);
    }
    
	}


