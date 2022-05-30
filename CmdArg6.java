
class CmdArg6{
	public static void main(String []args){
		if(args.length!=1){
			System.out.println("Invalid Input");
			return;
		}
		int n=0,i=2;
		try
		{
			n=Integer.parseInt(args[0]);
		}
		catch(Exception e){return;}
		while(i<n){
			if(n%i==0)
				break;
			i++;
		}
		String s = "No: "+n+" is "+((i==n)?"":" Not ")+"Prime";
		System.out.println(s);
	}
}
		
