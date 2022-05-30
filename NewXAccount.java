//Array of object of type x 

import java.util.*;

class NewXAccount{
	int no;
	String nm;
	static Scanner s;
	static
	{
		s = new Scanner(System.in);
	}
	NewXAccount(){
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
		int no;
		LinkedList <NewXAccount> obj = null;
		obj = new LinkedList<NewXAccount>();
		while(true){
			System.out.println("A/C no: ");
			no = s.nextInt();
			if(no==0){
				break;
			}
			NewXAccount p =new NewXAccount();
			p.setData();
			obj.add(p);
		}
		System.out.println(obj.toString());
	}
}
