
class Table2{
	public static void main(String []arg){
		int i=1,no=(int)(Math.random()*100);
		String s ="Table\n";
		while(i<=10){
			s = s+" "+(no*i);
			i++;
		}
	}
}
