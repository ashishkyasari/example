//write aprogram to check inputed string is binary or not

import java.io.*;

class KBD4{
	public static void main(String []args){
		InputStreamReader isr = null;
		BufferedReader br = null;
		int n,i=0;
		char ch='0';
		String str="";
		System.out.println("Enter Binary String: ");
		try
		{
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			str=br.readLine();
		}
		catch(Exception e){}
		n=str.length();
		
		while(i<n){
			ch=str.charAt(i);
			if(ch=='0' || ch=='1')
				i++;
			else
				break;
		}
		if(i==n)
			System.out.println("Binary String");
		else
			System.out.println("Not a Binary String");
	}
}
