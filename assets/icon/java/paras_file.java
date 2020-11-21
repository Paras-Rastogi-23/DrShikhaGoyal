import java.io.*;
public class paras_file
{
 static String fileName = ("paras.txt");
 static InputStreamReader rd = new InputStreamReader(System.in);
 static BufferedReader br = new BufferedReader(rd);
 public static void main(String args[])
 {
  try
  {
   FileWriter f = new FileWriter(fileName);
   BufferedWriter b = new BufferedWriter(f);
   PrintWriter outfile = new PrintWriter(b);
   for(int i=1;i<=5;i++)
   {
     System.out.println("Enter Name : ");
     String name = br.readLine();
     outfile.println(name);
   }
  outfile.close();
  }
  catch(IOException e)
  {
   System.err.println(e);                       
  }                                               
 }
}
                                                  