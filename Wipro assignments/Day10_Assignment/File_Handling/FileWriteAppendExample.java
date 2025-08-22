
//a program to write data into a file using Files.write() and append using StandardOpenOption.APPEND

package File_Handling;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
public class FileWriteAppendExample {
	public static void main(String[] args) {
        Path filePath = Path.of("example.txt");

        // Data to write (initial write)
        List<String> initialLines = List.of("This is the first line.", "This is the second line.");

        // Data to append
        List<String> appendLines = List.of("This is an appended line.", "Another appended line.");

        try {
            // Write initial data to file (creates the file or overwrites it if it exists)
            Files.write(filePath, initialLines);

            // Append more data to the same file
            Files.write(filePath, appendLines, StandardOpenOption.APPEND);

            System.out.println("File written and appended successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

