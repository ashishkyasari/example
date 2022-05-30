
class CmdArg1{
	public static void main(String [] args){
		int i=0,n=args.length;
		if(n==0){
			System.out.println("Invalid Argument");
		}
		System.out.println("Data");
		for(i=0;i<n;i++){
			System.out.println(args[i]);
		}
	}
}
