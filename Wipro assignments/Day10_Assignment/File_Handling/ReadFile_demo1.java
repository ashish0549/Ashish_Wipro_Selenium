package File_Handling;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;

// Program to Read Multiple Lines
public class ReadFile_demo1 
{
	public static void main(String[] args) throws IOException
	{		
		
		List<String> lines = new ArrayList<String>();
		BufferedReader r = new BufferedReader(new FileReader ("Sample.txt"));
		String line;
		while((line = r.readLine())!=null)
		{
			System.out.println(line);
			
		}
		for(String l:lines)
		{
			System.out.println(l);
		}
		r.close();
	}

}
