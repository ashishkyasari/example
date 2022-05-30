import java.util.*;
import java.io.*;

class Static4{
	static int [][]arr;
	static Scanner s;
	static
	{
		arr=new int [3][3];
		s = new Scanner(System.in);
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
	public static void main(String []args){
		input(arr);
		display(arr);
	}
}
