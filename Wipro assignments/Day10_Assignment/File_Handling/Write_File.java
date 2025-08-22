package File_Handling;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;//It is must if we want to use  ".newLine();"
public class Write_File 
{
	public static void main(String[] args) 
	{		
		try 
		{
			BufferedWriter w = new BufferedWriter(new FileWriter ("Sample.txt"));
			w.write("Hello");
			w.newLine();
			w.write("Welcome, How are you");
			w.close();
			System.out.println("write file successfully");			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}		
	}
}
