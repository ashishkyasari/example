//Write a program to display int array of 5 integer

import java.io.*;

class Array1{
	public static void main(String []args){
		int []arr = new int[5];
		int i=0;
		BufferedReader br=null;
		try
		{
			br= new BufferedReader(new InputStreamReader(System.in));
		} 
		catch(Exception e){}
		for(i=0;i<arr.length;i++){
			System.out.print("Numbers: ");
			try
			{
				arr[i]=Integer.parseInt(br.readLine());
			}
			catch(Exception e){arr[i]=0;}
		}
		System.out.println("Data:");
		for(i=0;i<arr.length;i++){
			System.out.println(" "+arr[i]);
		}
	}
}
