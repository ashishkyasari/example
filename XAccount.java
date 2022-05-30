//Array of object of type x 

import java.util.*;

class XAccount{
	int no;
	String nm;
	static Scanner s;
	static
	{
		s = new Scanner(System.in);
	}
	XAccount(){
		no=0;
		nm = new String();
	}
	void setData(){
		System.out.println("Account no: ");
		no = s.nextInt();
		System.out.println("Name: ");
		nm = s.next();
	}
	void setData(int n){
		no=n;
		System.out.println("Name: ");
		nm = s.next();
	}
	public String toString(){
		String s = "\nAccount data\nNo: "+no+"\nName: "+nm;
		return s;
	}
	void display(){
		System.out.println(toString());
	}
	public static void main(String []args){
		XAccount [] a = new XAccount[5];
		//a is a reference variable refers to an array of class type XAccount
		int i=0,no=0;
		while(i<5){
			System.out.println("No: ");
			no = s.nextInt();
			a[i]= new XAccount();
			a[i].setData(no);
			i++;
		}
		String s = "Account Record \n"+Arrays.toString(a);
		System.out.println(s);
	}
}
