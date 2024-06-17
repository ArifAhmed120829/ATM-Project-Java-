package package_1;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class OptionMenu extends Account{
	Scanner in = new Scanner(System.in);
	DecimalFormat mf = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException{
		int x = 1;
		do {
			try {
				data.put(123456, 654321);
				data.put(789012, 210987);
				
				System.out.println("Welcome to the ATM Project!");
				System.out.println("Enter your card number");
				setCardNumber(in.nextInt());
				System.out.println("Enter your pin number: ");
				setPinNumber(in.nextInt());
			} catch (Exception e) {
				System.out.println("\n" + "Invalid Character(s). Only Numbers." + "\n");
				x = 2;
			}
			int cn = getCardNumer();
			int pn = getPinNumber();
			
			if(data.containsKey(cn) && data.get(cn) == pn) {
				getAccountType();
			} else System.out.println("\n" + "Wrong customer number or pin number" + "\n");
			
		} while (x==1);
	}
	public void getAccountType() {
		System.out.println("Select the account you want to access: ");
		System.out.println("Type 1- Checking Account");
		System.out.println("Type 2- Saving Account");
		System.out.println("Type 3- Exit");
		
		int selection = in.nextInt();
		
		switch(selection) {
		case 1:
			getchecking();
			break;
		case 2:
			getsaving();
			break;
		case 3:
			System.out.println("Thank you for using this ATM, BYE. \n");
			break;
			
			default: System.out.println("\n" + "Invalid Choice" + "\n");
			getAccountType();
		}
	}
	public void getchecking() {
		System.out.println("Checking Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.print("Choice: ");
	}
}
