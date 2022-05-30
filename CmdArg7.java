
class CmdArg7{
	public static void main(String []args){
		if(args.length==0){
			System.out.println("Invalid Input");
			return;
		}
		int i=0,min=0,max=0,n=0;
		boolean flag=false;
		while(i<args.length){
			try
			{
				n=Integer.parseInt(args[i]);
			}
			catch(Exception e){i++;continue;}
			if(flag==false){
				min=max=n;
				flag=true;
			}
			else
			{
				if(n>max)
					max=n;
				else
				{
					if(n<min)
						min=n;
				}
			}
			i++;
		}
		System.out.println("Max: "+max+" ; Min: "+min); 
	}
}
			
