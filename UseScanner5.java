

import java.util.*;

class UseScanner5{
	public static void main(String []args){
		Scanner s =new Scanner("12 13 8 9 17 10");
		while(s.hasNextInt()){
			System.out.println(s.nextInt());
		}
	}
}
