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



}
