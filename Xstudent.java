
import java .util.*;

class Xstudent{
	int no;
	String nm;
	double mrk;
	Xstudent(){
		no=0;
		nm="";
		mrk=0.0;
	}
	Xstudent(int a, String b, double c){
		no=a;
		nm=b;
		mrk=c;
	}
	public String to String(){
		String s = "Roll No: "+no+"\nName: "+nm+"\nMarks: "+mrk;
	}
	void display(){
		System.out.println(toString());
	}
	public staticvoid main(String []args){
		Xstudent 
