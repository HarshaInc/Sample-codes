abstract class abstr
{
  abstract void abstractMethod();
  public void normalMethod()
  {
    System.out.println("this is an concrete method");
  }
}

class Abst extends abstr
{
 void abstractMethod()
 {
  System.out.println("this is a abstract method ");
 }
 public static void main(String args[])
 {
  Abst ab = new Abst();
  ab.abstractMethod();
  ab.normalMethod();
 }
}
