package Exceptions_practise;

public class Throw_exception {

void add(int a, int b)
{
   int sum=a+b;
   System.out.println("Addition="+sum);
}
void div(int a, int b) throws ArithmeticException
{

int div=a/b;
System.out.println("Division="+div);
}
public static void main (String[] args) {
   Throw_exception d=new Throw_exception();
   d. add (10,20);
   d. div(100, 0);
}
}
