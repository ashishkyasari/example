import java.io.*;
import java.util.*;

class String5{
	static int [][]p; static int [][]q; static int [][]r;
	static Scanner s;
	static
	{
		p= new int [3][3];
		q= new int [3][3];
		r= new int [3][3];
		s=new Scanner(System.in);
	}
	static void input(int [][]a){
		int i=0,j=0;
		while(i<3){
			System.out.println("Data: ");
			for(j=0;j<3;j++){
				a[i][j]=s.nextInt();
			}
			i++;
		}
	}
	static void display(int [][]a){
		String str = "Matrix\n";
		for(int i=0;i<3;i++){
			str=str+Arrays.toString(a[i])+"\n";
		}
		System.out.println(str);
	}
	static void Add(int [][]a, int [][]b){
		int i=0,j=0;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				r[i][j]=a[i][j]+b[i][j];
			}
		}
	}
	public static void main(String []args){
		input(p);
		input(q);
		display(p);
		display(q);
		Add(p,q);
		display(r);
	}
}
