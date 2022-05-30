//Use of array as a field in the class

import java.util.*;

class Xresult{
	int []mrk;
	int no;
	static Scanner s;
	static
	{
		s = new Scanner(System.in);
	}
	Xresult(){
		no=0;
		mrk = new int[5];
	}
	
	void setData(int a){
		no=a;
		for(int i=0;i<5;i++){
			mrk[i]=s.nextInt();
		}
	}
	int total(){
		int tot=mrk[0],i=1;
		while(i<5){
			tot+=mrk[i];
		}
		return tot;
	}
	void setData(){
		System.out.println("Roll no: ");
		no = s.nextInt();
		System.out.println("Marks: ");
		for(int i=0;i<5;i++){
			mrk[i]=s.nextInt();
		}
	}
	public String toString(){
		String a = "\nRoll no: "+no+"\nMarks: "+Arrays.toString(mrk)+"\ntotal: "+total();
		return a;
	}
	void display(){
		System.out.println("Student result: "+this);
	}
	public static void main(String []args){
		Xresult a = new Xresult();
		a.setData();
		a.display();
	}
}
		
