package File_Handling;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.FileInputStream;

public class CreatingDocx_File {
	public static void main (String[] args) throws IOException
	{
		
		File f1 = new File("Test.docx");
		try 
		{
			f1.createNewFile();// create new file on particular location
			System.out.println(f1.setWritable(true));
			
		}
		catch(Exception e)
		{
			System.out.println("File not found");
			System.out.println(e);
		}
		//access existing file and print file name, location , length		
				if(f1.exists())
				{
					System.out.println("File name : "+f1.getName());//print filename
					System.out.println("File Location : "+f1.getAbsolutePath());//file path
					System.out.println("File size : "+f1.length());//print length
					System.out.println("File readable : "+f1.canRead());
					System.out.println("File Writable : "+f1.canWrite());
					
				}
				else
				{
					System.out.println("File not found");
				}		
		
		// writing a File named "Test.txt"
				try 
				{
					BufferedWriter w = new BufferedWriter(new FileWriter ("Test.docx"));
					w.write("Good Evening");
					w.newLine();
					w.write("This file name is Test");
					w.close();
					System.out.println("write file successfully");			
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}			
		
		
		
		List<String> lines=new ArrayList<String>();
		FileInputStream r=new FileInputStream("/Users/sai/eclipse-workspace/Java practise/Test.docx");
		int line;
		while((line = r.read())!=-1)
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
