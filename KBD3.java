//write a program to check inputed number is a prime number

import java.io.*;

class KBD3{
	public static void main(String []args){
		InputStreamReader isr=null;
		BufferedReader br = null;
		int no=0,i=2;
		String str="";
		System.out.print("\nEnter Number: ");
		try
		{
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			no=Integer.parseInt(br.readLine());
		}
		catch(Exception e){return;}
		while(i<no){
			if(no%i==0)
				break;
			i++;
		}
		if(i==no){
			System.out.println("\nPrime");
		}
		else
			System.out.println("Not Prime");
	}
}
			
