package File_Handling;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


//Only the First Line of the file is displayed
public class ReadFile_demo 
{
	public static void main(String[] args) throws IOException
	{		
		
		
		BufferedReader r = new BufferedReader(new FileReader ("Sample.txt"));
		String line;
		if((line = r.readLine())!=null)
		{
			System.out.println(line);
			
		}
		else
		{
			System.out.println("File is Empty");
		}
		r.close();
	}
	
}
