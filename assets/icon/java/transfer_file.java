import java.io.*;
import java.util.Scanner;
public class transfer_file
{
 static void copy(String source,String target)throws Exception
 {
   FileReader in = new FileReader(source);
   FileWriter out = new FileWriter(target);
   int i;
   while((i=in.read())!= -1)
   {
    out.write(i);
   }
   in.close();
   out.close();
 }
 
 static void display(String file)throws Exception
 {
   FileReader fin = new FileReader(file);
   BufferedReader bin = new BufferedReader(fin);
   String s;
   while((s=bin.readLine()) != null)
   {
    System.out.println(s);
   }
   bin.close();
 }

 public static void main(String args[])throws Exception
 {
  Scanner sc = new Scanner(System.in);
  //transfer_file ob = new transfer_file();
  System.out.println("Enter the name of source file");
  String Source = sc.nextLine();
  System.out.println("Enter the name of target file");
  String Target = sc.nextLine();
  System.out.println("Display the content of SOURCE FILE");
  display(Source);
  System.out.println("Display the Content of TARGET file after transfer the file");
  copy(Source,Target);
  display(Target);
 }
}