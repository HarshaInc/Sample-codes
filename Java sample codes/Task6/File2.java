import java.io.*;
class File2
{
  public static void main(String args[]) throws IOException
  {
File f = new File("C:/Users/harsha palvayi/Desktop/UIhomework/Java/homework6/empty.txt");
FileWriter fw = new FileWriter(f,true);
fw.write("harsha palvayi");
fw.write("\n");
fw.write("java homework");
fw.write("hi");
fw.flush();
fw.close();
}
}
