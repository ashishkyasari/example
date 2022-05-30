import java.util.*;

class Matrix1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int[][] x = new int[3][3];
		int i=0,j=0;
		while(i<3){
			for(j=0;j<3;j++){
				System.out.print("x["+i+"]["+j+"]= ");
				x[i][j]=s.nextInt();
			}
			i++;
		}
		String str = "Matrix";
		for(i=0;i<3;i++){
			str=str+Arrays.toString(x[i])+"\n";
			System.out.println(str);
		}
	}
}
