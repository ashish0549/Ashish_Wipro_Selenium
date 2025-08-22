package File_Handling;

import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class path_demo {
	public static void main(String[] args) 
	{
		Path path=Paths.get("sample.txt");
		System.out.println("Name of file : "+path.getFileName());
		System.out.println("Absolute Path : "+path.toAbsolutePath());
		System.out.println("Parent directory : "+path.getParent());
		System.out.println("Path(current) : "+Files.exists(path));
	}

}
