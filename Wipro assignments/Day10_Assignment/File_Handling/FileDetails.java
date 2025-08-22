package File_Handling;

import java.io.File;
public class FileDetails {
	public static void main(String[] args) 
	{
//access existing fil and print file name, location , length		
		File f = new File("Sample.txt");
		if(f.exists())
		{
			System.out.println("File name : "+f.getName());//print filename
			System.out.println("File Location : "+f.getAbsolutePath());//file path
			System.out.println("File size : "+f.length());//print length
			System.out.println("File readable : "+f.canRead());
			System.out.println("File Writable : "+f.canWrite());
			
		}
		else
		{
			System.out.println("File not found");
		}
		
	}

}
