import java.net.*;
import java.io.*;

public class ServeRICQ{
	public static void main(String args[])
	{
		try{
			ServerSocket sSocket = new ServerSocket(24000);
			Socket cSocket = sSocket.accept(); 
			
			
			
		}catch(IOException e)
		{
			System.out.println("Hello World");
		}
	}
}