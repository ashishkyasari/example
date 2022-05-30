//INput 10 number and compute sum and avg and find min and max

import java.util.*;
class UseScanner2{
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no: ");
		int no=0,tot=0,avg=0,i=1,min=0,max=0;
		while(i<=10){
			no=s.nextInt();
			tot+=no;
			if(i==1)
				min=max=no;
			else{
				if(no<min)
					min=no;
				else{
					if(no>max)
						max=no;
				}
			}
			i++;
		}
		avg=tot/10;
		System.out.println("Min: "+min+"\nMax: "+max+"\nTotal: "+tot+"\nAvg: "+avg);
	}
}
