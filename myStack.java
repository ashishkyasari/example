//Array implementation of stack

import java.util.*;

class myStack{
	static int top;
	static int []arr;
	static Scanner s;
	static
	{
		top=-1;
		arr = new int [5];
		s = new Scanner(System.in);
	}
	static boolean isEmpty()
	{
		return (top==-1);
	}
	static boolean isFull()
	{
		return (top==arr.length-1);
	}
	static void push()
	{
		if(isFull())
		{
			System.out.println("Overflow");
			return;
		}
		System.out.println("Data: ");
		int d = s.nextInt();
		arr[++top]=d;
	}
	
	static void pop()
	{
		if(isEmpty())
		{
			System.out.println("Underflow");
			return;
		}
		top--;
	}
	
	static void display()
	{
		String str = "stack";
		if(isEmpty())
		{
			str=str+" is empty";
		}
		else
		{
			str=str+"\n";
			for(int i=top;i>0;i--)
			{
				str=str+" "+arr[i];
			}
		}
		System.out.println(str);
	}
	
	public static void main(String []args)
	{
		int opt=0;
		while(true)
		{
			System.out.println("Menu\n1.push\n2.pop\n3.display\n4.exit\noption: ");
			opt = s.nextInt();
			if(opt>3)
				break;
			switch(opt)
			{
				case 1:
					push();
					break;
				case 2:
					pop();
					break;
				case 3:
					display();
					break;
			}
		}
	}
}
		
		
	
