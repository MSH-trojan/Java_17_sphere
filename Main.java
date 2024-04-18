package main;
// importing DecimalFormat so we can cut the Decimal numbers to be only 2 numbers after the decimal point.
import java.text.DecimalFormat;
//importing the Scanner.
import java.util.Scanner;

public class Main{
	
public static void main(String[] args) {
	
	// defining variables:
	double r,area,volume;
	
	//Scanner object:
	Scanner input = new Scanner(System.in);
	//DecimalFormat object with cutting the number till the second decimal number.
	DecimalFormat f= new DecimalFormat("0.##");
	
	System.out.print("Enter the radius of the sphere: ");
	r = input.nextDouble();
	
	//Using Math.PI here. it's typically the number π.
	
	area = 4 * Math.PI * Math.pow(r,2);	
	
	System.out.println();
	
	System.out.println("The area of the sphere is: " +  f.format(area));
	
	volume = ((Math.PI * (Math.pow(r,3))) * 4) / 3;
	
	System.out.println("The volume of the sphere is: " + f.format(volume));
	}
}