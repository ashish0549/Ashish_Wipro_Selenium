package Enum_practise;

interface Animal{
	void eat();    
	void sound();

enum Dog implements Animal{
	Husky
{
 public void eat() 
 {
	 System.out.println("Royal Canin");
 }
 public void sound() 
 {
	 System.out.println("Barking");
 }

};
public class InFa_Enum {
	public static void main(String[] args) {
	Dog d= Dog.Husky;
	d.eat();
	d.sound();
   }
}
}
}





