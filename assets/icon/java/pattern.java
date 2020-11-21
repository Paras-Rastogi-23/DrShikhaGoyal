import java.io.*;
public class pattern
{
 public static void main(String args[])throws IOException
 {
  InputStreamReader rd = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(rd);
  int i,j,n;
  System.out.println("Enter the limit");
  n = Integer.parseInt(br.readLine());
   
  for(i=0;i<n;i++)
  { 
   System.out.print("                                                      ");
   for(j=0;j<n;j++)
   {
    if((i==0)||(i==n-1)||j==0||j==n-1||i==j||i+j==n-1||i==n/2||j==n/2)
     System.out.print("* ");
    else
      System.out.print("  ");
   }
       System.out.println();   
  }
 }
}
