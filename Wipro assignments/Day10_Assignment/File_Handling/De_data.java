package File_Handling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class De_data {
	public static void main(String[] args) throws IOException,ClassNotFoundException
	{
		FileInputStream fos=new FileInputStream("student.txt");
		ObjectInputStream oos=new ObjectInputStream(fos);
		Student s1=(Student)oos.readObject();
		//oos.writeObject(s1);
		s1.display();
		oos.close();
		fos.close();
		System.out.println("DeSerialization done successfully");
	}

}
