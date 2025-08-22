package File_Handling;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.NoSuchFieldError;

// Step 1: Create a class that implements Serializable
class Studnt implements Serializable {
    int id;
    String name;

    Studnt(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Serialize_Deserialize_data 
{
    public static void main(String[] args) {
        Studnt s1 = new Studnt(101, "Nasir Hussain");

        // Step 2: Serialize the object to a file
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
            out.writeObject(s1);
            out.close();
            System.out.println("Serialization done");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e);
        }

        // Step 3: Deserialize the object from the file
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
            Studnt s2 = (Studnt) in.readObject();
            in.close();
            System.out.println("Deserialization done");
            System.out.println("ID: " + s2.id);
            System.out.println("Name: " + s2.name);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e);
        }
    }
}
