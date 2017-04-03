abstract class Engine
{
abstract void v6();
abstract void v8();

}

class Car extends Engine
{
 void v6()
 {
  System.out.println("less power,noisy engine");
 }
 void v8()
 {
  System.out.println("more power,smooth engine");
 }
 public static void main(String args[])
 {
Engine e = new Car();
e.v6();
e.v8();

 }
}
