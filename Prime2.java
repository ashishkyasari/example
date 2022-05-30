

class Prime2{
	public static void main(String [] args){
		int i=2,no=0;
		for(no=10;no<100;no++){
			for(i=2;i<no;){
				if(no%i==0){
					break;
				}
				i++;
			}
			if(i==no){
				System.out.println("Prime "+no);
			}
		}
	}
}
