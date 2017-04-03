class Binding
{
  public void add(int s)
  {
    System.out.println("int-arg binding");
  }
  public void add(int a ,int b)
  {
    System.out.println(" two int-arg binding");
  }
}
class Staticbinding extends Binding
{
  public void add()
  {
    System.out.println("no-arg Staticbinding");
  }
  public void add(int... r)
  {
    System.out.println("var-arg Staticbinding");
  }
  public static void main(String args [])
  {
    Staticbinding sb = new Staticbinding();
    sb.add(20);
    sb.add();
    sb.add(30,40);
    sb.add(40,50);
    sb.add(3,4,5,6,7,8);

    Binding b = new Binding();
    b.add(20);
    b.add(30,40);
    b.add(40,50);


   Binding bs = new Staticbinding();

    bs.add(20);
    bs.add(30,40);
    bs.add(40,50);

  }
  }

