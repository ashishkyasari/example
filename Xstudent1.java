
import java.util.*;

class Xstudent1{
	int no;
	String nm;
	static Scanner s;
	static
	{
		s= new Scanner(System.in);
	}
	Xstudent1(){
		no=0;
		nm = new String();
	}
	void setData(int a){
		no=a;
		System.out.println("Name: ");
		nm = s.next();
	}
	void setData(){
		System.out.println("Roll no: ");
		no = s.nextInt();
		System.out.println("Name: ");
		nm = s.next();
	}
	public String toString(){
		String a = "\nRoll no: "+no+"\nName: "+nm;
		return a;
	}
	
	void display(){
		System.out.println("Student Data: "+this);
	}
	public static void main(String []args){
		Xstudent1 a = new Xstudent1();
		a.setData();
		a.display();
	}
}
