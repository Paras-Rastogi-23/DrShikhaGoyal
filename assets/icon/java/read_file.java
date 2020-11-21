import java.io.*;
public class read_file
{
 public static void main(String args[])throws IOException 
 { 
 
  FileReader fin = new FileReader("student_marks.csv");
  BufferedReader bin = new BufferedReader(fin);
  String text;
  int i=1;
  while((text=bin.readLine())!= null)
  {
    i++;
    System.out.println("name "+i+":"+ text);
    
  }
  fin.close();
    
   
 } 
}