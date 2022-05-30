import java.util.*;
import java.io.*;

class Static3{
	static int []arr;
	static Scanner s;
	static
	{
		arr=new int [3][3];
		s = new Scanner(System.in);
	}
	static void input(){
		int i=0,j=0;
		while(i<3){
			System.out.println("Data: ");
			for(j=0;j<3;j++){
				arr[i][j]=s.nextInt();
			}
			i++;
		}
	}
	static void display(){
		String str = "Matrix\n";
		for(int i=0;i<3;i++){
			str=str+Arrays.toString(arr[i])+"\n";
		}
		System.out.println(str);
	}
	public static void main(String []args){
			input();
			display();
		}
	}
