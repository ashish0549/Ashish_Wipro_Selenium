package File_Handling;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Serial_data 
{
	public static void main(String[] args) 
	{
		Employee emp=new Employee(101,"Nasir Hussain");
		Employee emp1=new Employee(102,"Vishnu");
		Employee emp2=new Employee(103,"Suhas");
		try 
		{
			FileWriter fw=new FileWriter("Employee.txt");
			BufferedWriter bf=new BufferedWriter(fw);
			bf.write(emp.toString());
			bf.newLine();
			bf.write(emp1.toString());
			bf.newLine();
			bf.write(emp2.toString());
			bf.newLine();
			bf.close();
			fw.close();
			System.out.println("Done");
		}
		catch(IOException e)
		{
			System.out.println("Failed");
			System.out.println(e);
		}
	
	}
	

}
