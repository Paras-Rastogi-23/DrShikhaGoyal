//program to extract the phone corresponding to a particular people
import java.io.*;
import java.util.Scanner;
public class database
{

 public static void main(String[] args)throws Exception
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the whole database of all peoples\n");
     Display("database.java");
     System.out.println("\nEnter the NAME whose PHONE_NUMBER is extracted");
     String Name = sc.next();
     System.out.println("\nthe PHONE_NUMBER of the required person with name is given below");
     Extract_Number(Name);
 }
 
 static void Extract_Number(String name)throws Exception
 {
    FileReader      in = new FileReader("database.java");
    BufferedReader bin = new BufferedReader(in);
    String S;
    while((S=bin.readLine()) != null)
    {
        int i1=0,i2=0,l=0;
                l       =  S.length();
        if(S.startsWith(name))
        {
            i1          =  S.indexOf('\t');
            String FN   =  S.substring(i1);
            String LN   =  S.substring(i1+1,i1+7);
            i2          =  S.lastIndexOf("\t");
            String str  =  S.substring(i2+1,l);
            int number  =  Integer.parseInt(str);
            System.out.println(FN+"  "+LN+"  "+number);
        }
        in.close();
    } 
 }
  
 static void Display(String file)throws Exception
 {
      FileReader fin     = new FileReader(file);
      BufferedReader Bin = new BufferedReader(fin);
      String s;
      while((s=fin.readLine())!= null)
      {
          System.out.println(s);
      }
      Bin.close();
 }
}     
     
     
     
     
    