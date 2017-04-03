class Binding
{
  public void eat()
  {
    System.out.println("breakfast");
  }
  public void drink()
  {
    System.out.println("coke");

  }
}
class Dynamicbinding extends Binding
{
  public void eat()
  {
    System.out.println("Lunch");
  }
  public void drink()
  {
    System.out.println("juice");
  }
  public static void main(String args[])
  {
    Dynamicbinding sb = new Dynamicbinding();
    sb.eat();
    sb.drink();
    Binding b = new Dynamicbinding();
     b.eat();
     b.drink();
  }
}
