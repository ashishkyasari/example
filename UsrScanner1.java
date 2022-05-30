//Use of class Scanner
//Package: java.util.*;
//A simple text scanner which can pass premitive type and strings using regular expressions. A Scanner breaks it's input into tokens using delimeter pattern, which by default matches void space.
//The resultiong may then be converted into values of different types using various next methods. 

import java.util.*;

class UseScanner1{
	public static void main(String []args){
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Number: ");
		int no=s.nextInt();
		System.out.println("No: "+no);
	}
}
