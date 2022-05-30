import java .util.*;

class XStudent2{
	int no;
	String nm;
	double mrk;
	static Scanner s;
	static
	{
		s = Scanner(System.in);
	}
	XStudent2(){
		no=0;
		nm="";
		mrk=0.0;
	}
	
	int getNo(){return no;}
	
	double getMrk(){return mrk;}
	
	public String toString(){
		String s = "\nStudent data\nNo: "+no+"\nName: "+nm+"\nMarks: "+mrk;
		return s;
	}
	
	void display(){
		System.out.println(toString());
	}
	
	void setData(int n){
		no=n;
		System.out.println("Name: ");
		nm = s.next();
		System.out.println("Marks: ");
		mrk = s.nextDouble();
	}
	
}

public class UseStudentList{
	LinkedList<XStudent2>ls;
	XStudent obj;
	UseStudentList(){
		ls = new LinkedList()<XStudent2>;
		obj = null;
	}
	
	boolean search(int no){
		i=0, n=ls.size;
		while(i<n){
			obj=ls.get(i);
			if(obj.getNo()==no){
				break;
			}
			i++;
		}
		return (i!=n);
	}
	
	void add(){
		System.out.println("Roll no");
		int no = XStudent2.s.nextInt();
		if(search(no)){
			System.out.println("Record Exist");
			return;
		}
		obj = new XStudent2();
		obj.setData(no);
		ls.add(obj);
	}
	
	void modify(){
		System.out.println("Roll no");
		int no = XStudent2.s.nextInt();
		if(search(no)==false){
			System.out.println("REcord doesnot exist");
			return;
		}
		obj.setData();
	}
	
	void delete(){
		System.out.println("Roll no: ");
		int no = XStudent.s.nextInt();
		if(search(no)==false){
			System.out.println("REcord doesnot exist");
			return;
		}
		ls.remove(obj);
	}
	
	void display(){
		int i=0, n=ls.size();
		while(i<n){
			obj=ls.get(i);
			obj.display();
			i++;
		}
	}
	
	
	void menu(){
		int opt;
		while(true){
			System.out.println("Menu\n1.add\n2.Mod\n3.del\n4.display\n5.exit\noption: ");
			opt = XStudent.s.nextInt();
			if(opt>4)
				break;
			switch(opt){
				case 1:
					add();
					break;
				case 2:
					mod();
					break;
				case 3:
					del();
					break;
				case 4:
					diplay();
					break;
				}
			}
		}
		
		public static void main(String []args){
			UseStudentList a = new UseStudentList();
			a.menu();
		}
	}
		
