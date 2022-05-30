
class CmdArg2{
	public static void main(String []args){
		int i=0,n=args.length;
		if(n!=1){
			System.out.println("Invalid Argument");
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
		System.out.println("No: "+n);
	}
}
