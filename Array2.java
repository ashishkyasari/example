import java.util.*;
import java.io.*;

class Array2{
	public static void main(String []args){
		int []arr=new int[5];
		int i=0;
		BufferedReader br=null;
		try
		{
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		catch(Exception e){}
		for(i=0;i<arr.length;i++)
		{
			System.out.println("Number: ");
			try
			{
				arr[i]=Integer.parseInt(br.readLine());
			}
			catch(Exception e){arr[i]=0;}
		}
		System.out.println("Data\n"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Data\n"+Arrays.toString(arr));
	}
}
