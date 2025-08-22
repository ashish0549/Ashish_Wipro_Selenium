package File_Handling;
import java.io.File;
public class CreateNew_File {
	public static void main(String[] args) 
	{
		File f = new File("Sample.txt");
		try 
		{
			f.createNewFile();// create new file on particular location
			System.out.println(f.setWritable(true));
			
		}
		catch(Exception e)
		{
			System.out.println("File not found");
			System.out.println(e);
		}
		
	}

}
