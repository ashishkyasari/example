
class CmdArg4{
	public static void main(String []args){
		int i=0,n=args.length,sum=0;
		if(n!=1){
			System.out.println("Invalid Input");
			return;
		}
		try
		{
			n=Integer.parseInt(args[0]);
		}
		catch(Exception e){
			System.out.println("Invalid Data");
			return;
		}
		while(n>0){
			sum+=n%10;
			n/=10;
		}
		System.out.println("Sum: "+sum);
	}
}

//Generate reverse number and prime number
