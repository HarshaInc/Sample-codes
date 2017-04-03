class A
    {
    int b = 30;
    int c = 40;
    public void add()
    {
     int a = b + c;
     System.out.println(a);
    }
    public void multiply()
    {
     int d = b*c;
     System.out.println(d);
    }
    }
    class B extends A
    {

    public static void main(String args[])
    {
      B b = new B();
      b.add();
      b.multiply();
    }
    }
