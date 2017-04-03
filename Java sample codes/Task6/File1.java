import java.io.*;
class File1
{
  public static void main(String args[]) throws IOException
  {
File f = new File("C:/Users/harsha palvayi/Desktop/UIhomework/Java/homework6/notepad.txt");
FileReader fr = new FileReader(f);
char[] c1 = new char[(int)f.length()];
fr.read(c1);
for(char c : c1)
{
  System.out.println(c);
}

}
}
