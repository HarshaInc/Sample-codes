import java.io.*;
class File5
{
public static void main(String [] args)
{
System.out.println("hello");
try
{
  System.out.println(10/0);

}
catch(ArithmeticException e)
{
  System.out.println(10/2);

}
System.out.println("checked exceptions");

}
}
