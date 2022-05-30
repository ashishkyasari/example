
class Prime1{
	public static void main(String [] args){
		int i=2,no=(int)(Math.random()*100);
		
		while(i<no){
			if(no%i==0){
				break;
			}
			i++;
		}
		if(i==no){
			System.out.println("Prime "+no);
		}
		else{
			System.out.println("Not Prime "+no);
		}
	}
}
