


class CmdArg5{
	public static void main(String []args){
		int i=0,n=args.length,tot=0,k=0;
		if(n==0){
			System.out.println("Invalid Input");
			return;
		}
		for(i=0;i<n;i++){
			try
			{
				k=Integer.parseInt(args[i]);
				tot+=k;
			}
			catch(Exception e){n=0;}
		}
		System.out.println("Sum: "+tot);
	}
}
