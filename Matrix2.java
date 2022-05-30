import java.util.*;

class Matrix2{
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		int x[][] = null;
		x = new int[3][];
		
		int i=0,n,j;
		for(i=0;i<x.length;i++){
			System.out.println("Enter information count: ");
			n = s.nextInt();
			x[i]=new int[n];
			System.out.println("Data: ");
			for(j=0;j<n;j++){
				x[i][j]=s.nextInt();
			}
		}
		String str = "Matrix ";
		for(i=0;i<3;i++){
			str=str+Arrays.toString(x[i])+"\n";
			System.out.println(str);
		}
	}
}
