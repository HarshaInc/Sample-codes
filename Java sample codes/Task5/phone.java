interface Cell
{
void call();
void msg();
}

class Phone implements Cell
{
  public void call()
  {
    System.out.println("john");
  }
  public void msg()
  {
    System.out.println("hi hello");
  }
  public static void main(String args[])
  {
 Phone p = new Phone();
p.call();
p.msg();
  }
}
