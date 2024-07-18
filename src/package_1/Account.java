package package_1;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class Account {
private int cardNumber;
private int pinNumber;

private double checkingBalance = 0;
private double savingBalance = 0;

Scanner in = new Scanner(System.in);
DecimalFormat mf = new DecimalFormat("'$'###,##0.00");

public void setCardNumber(int cn) {
	this.cardNumber = cn;
}
public void setPinNumber(int pn) {
	this.pinNumber = pn;
}
public int getCardNumer() {
	return cardNumber;
}
public int getPinNumber() {
	return pinNumber;
}
public double getSavingBalance() {
	return savingBalance;
}
public double getCheckingBalance() {
	return checkingBalance;
}
public double calcCheckingWithdraw(double amount) {
	checkingBalance = (checkingBalance - amount);
	return checkingBalance;
}
public double calcSavingWithdraw(double amount) {
	savingBalance = (savingBalance - amount);
	return savingBalance;
}
public double calcCheckingDeposit(double amount) {
	checkingBalance = (checkingBalance + amount);
	return checkingBalance;
}
public double calcSavingDeposit(double amount) {
savingBalance = (savingBalance + amount);
	return savingBalance;
}
public void getCheckingWithdrawInput() {
	System.out.println("Checking account balance: "+ mf.format(checkingBalance));
	System.out.print("Select amount: ");
	double amount = in.nextDouble();
	if((checkingBalance-amount)>=0) {
		calcCheckingWithdraw(amount);
		System.out.println("New Checking account balance: "+mf.format(checkingBalance));
	}
	else {
		System.out.println("Balance can't be negative." + "\n");
	}
}
public void getsavingWithdrawInput() {
	System.out.println("Checking account balance: "+ mf.format(savingBalance));
	System.out.print("Select amount: ");
	double amount = in.nextDouble();
	if((savingBalance-amount)>=0) {
		calcSavingWithdraw(amount);
		System.out.println("New Checking account balance: "+mf.format(savingBalance));
	}
	else {
		System.out.println("Balance can't be negative." + "\n");
	}
}
public void getCheckingDepositInput() {
	System.out.println("Checking account balance: "+ mf.format(checkingBalance));
	System.out.print("Select amount: ");
	double amount = in.nextDouble();
	if((checkingBalance+amount)>=0) {
		calcCheckingDeposit(amount);
		System.out.println("New Checking account balance: "+mf.format(checkingBalance));
	}
	else {
		System.out.println("Balance can't be negative." + "\n");
	}
}
public void getsavingDepositInput() {
	System.out.println("Checking account balance: "+ mf.format(savingBalance));
	System.out.print("Select amount: ");
	double amount = in.nextDouble();
	if((savingBalance+amount)>=0) {
		calcSavingDeposit(amount);
		System.out.println("New Checking account balance: "+mf.format(savingBalance));
	}
	else {
		System.out.println("Balance can't be negative." + "\n");
	}
}

}
