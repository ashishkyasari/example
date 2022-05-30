import java.util.*;
import java.io.*;

class Static2{
	static int []arr;
	static Scanner s;
	static
	{
		arr=new int[5];
		s=new Scanner(System.in);
	}
	static void input(){
		int i=0;
		while(i<arr.length){
			System.out.println("Enter no: ");
			arr[i]=s.nextInt();
			i++;
		}
	}
		static int total(){
			int i=1,tot=arr[0];
			while(i<arr.length){
				tot+=arr[i++];
			}
			return tot;
		}
		static void display(){
			String a = "Data\n"+Arrays.toString(arr)+"\nTotal: "+total();
			System.out.println(a);
		}
		public static void main(String []args){
			input();
			display();
		}
	}
