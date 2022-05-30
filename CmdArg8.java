
//The String class represents character strings. All string literals in java Programs are implemented as instance of this class eg "abc".
//String are constant; their values cannot be changed after they are created. StringBuffer supports mutable Strings because string objects are immutable and they can be shared.


class CmdArg8{
	public static void main(String []k){
		if(k.length!=1){
			System.out.println("Invalid INput");
			return;
		}
		int n=0;
		try
		{
			n=Integer.parseInt(k[0]);
		}
		catch(Exception e){return;}
		String a = new String(""+n);
		StringBuffer b = new StringBuffer(a);
		StringBuffer c = b.reverse();
		System.out.println("Reverse number: "+c);
	}
}
