import java.io.*;
class File4
{
  public static void main(String args[]) throws IOException
  {
File f = new File("C:/Users/harsha palvayi/Desktop/UIhomework/Java/homework6/empty.txt");
FileReader fr = new FileReader(f);
BufferedReader br = new BufferedReader(fr);
String line = br.readLine();
while(line!=null)
{
  System.out.println(line);
  line= br.readLine();

}
br.close();
}
}
