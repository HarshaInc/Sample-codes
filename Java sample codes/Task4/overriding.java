class Father
{
      public void property()
      {
        System.out.println("Love,affection,caring");
      }
      public void job()
      {
        System.out.println("Teacher");
      }
 }
class Overriding extends Father
{
      public void property()
      {
        System.out.println("Money,House,happiness");
      }
      public void job()
      {
        System.out.println("Engineer");
      }
      public static void main(String args[])
      {
        Overriding or = new Overriding();
         or.property();
         or.job();
         Father f = new Father();
         f.property();
         f.job();
         Father fr = new Overriding();
         fr.property();
         fr.job();
      }
}
