package File_Handling;
import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) throws IOException
	{
		Path path=Paths.get("sample_test1.txt");
		//create file
		Files.createFile(path);
		System.out.println("Files created");
		//copy file
		Path copypath=Paths.get("sample_test_copy1.txt");
		Files.copy(path,copypath,StandardCopyOption.REPLACE_EXISTING);
		System.out.println("Files copied");		
		//Move File
		Path movedPath=Paths.get("moved_file1.txt");
		Files.copy(copypath,movedPath,StandardCopyOption.REPLACE_EXISTING);
		System.out.println("Files moved");	
		//Delete file
		Files.deleteIfExists(path);
		Files.deleteIfExists(movedPath);
		System.out.println("Files deleted.");
	}
}
