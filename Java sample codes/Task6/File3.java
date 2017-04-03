import java.io.*;
class File3
{
  public static void main(String args[]) throws IOException
  {
File f = new File("C:/Users/harsha palvayi/Desktop/UIhomework/Java/homework6/empty.txt");
FileWriter fw = new FileWriter(f,true);
BufferedWriter bw = new BufferedWriter(fw);
bw.write("hello, this is java");
bw.newLine();
bw.write("learn java");
bw.flush();
bw.close();
}
}
