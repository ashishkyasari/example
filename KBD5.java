// Input 10 nos and count number of positiove, negative and zeros

import java.io.*;

class KBD5{
	public static void main(String []args){
		InputStreamReader isr = null;
		BufferedReader br = null;
		int n=0,i=0,pc=0,nc=0,oc=0,zc=0;
		String str="";
		System.out.println("Numbers: ");
		try
		{
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			str = br.readLine();
		}
		catch(Exception e){}
		while(i<str.length()){
			try
			{
				n=Integer.parseInt(str[i]);
			}
			catch(Exception e){i++;oc++;continue;}
			if(n==0)
				zc++;
			else{
				if(n>0)
					pc++;
				else
					nc++;
			}
			i++;
		}
	}
}
