import java.util.*;

class Xbook{
	int bno;
	String bnm;
	double bprice;
	static Scanner s;
	static
	{
		s = new Scanner(System.in);
	}
	Xbook(){
		bno=0;
		bnm=new String();
		bprice = 0.0;
	}
	public String toString(){
		String a = "Book Data\nNo: "+bno+"\nBook Name: "+bnm+"\nBook Price: "+bprice;
		return a;
	}
	void setData(int a){
		bno = a;
		System.out.println("Enter Book Name: ");
		bnm = s.next();
		System.out.println("Price: ");
		bprice = s.nextDouble();
	}
	void display(){
		System.out.println(toString());
	}
	public static void main(String []args){
		Xbook a = null;
		a = new Xbook();
		System.out.println("\nBook no: ");
		a.setData(s.nextInt());
		a.display();
		Xbook b = a;
		b.display();
	}
}
