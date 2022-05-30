//Concepts of Streams

// In file processing input reffers to the flow of data into a program and output means the flow of data out of the program. Input to a program may come from the keyboard, the mouse, the memory, the disk a network or another program. Similarly output from a program may go to the screen the printer, the memory, the disk, the network or another program. Although this devices look very different at the hardware level, they share certain common charateristick such as unidirectional movement of data, treating data as a sequence of bites or characters and support to the sequential access to the data

//Java uses the concepts of Streams to represent the ordered sequence of data, a common characteristick shared by all input output devices. A stream presents a uniform, easy to use, object oriented interface between the program and the input/output devices.

//A stream in java is a path  along which data flows. It has a source and a destination. Both the source and the destination may be physical devices or programs or other streams in the same program

//The java Streams are classified into two basics types mainly input stream and output stream. An input stream extracts data from the source and sends it to the program similarly an output stream takes data from the program and sends it to the destination. 

//The java.io package contains large number of stream classes that provides capabilities for processing all types of data. These classes may be catagorised into two groups based on the data type on which they operate.
//1)Byte Stream Classes
//2)Character Stream classes
//These two groups may furthur be classified based on their purpose.


import java.io.*;

class KBD1{
	public static void main(String []args){
		InputStreamReader isr=null;
		BufferedReader br=null;
		try
		{
			isr = new InputStreamReader(System.in);
			br= new BufferedReader(isr);
		}
		catch(Exception e){}
		String str="";
		System.out.println("Enter string: ");
		try
		{
			str=br.readLine();
		}
		catch(Exception e){}
		System.out.println(str);
	}
}
