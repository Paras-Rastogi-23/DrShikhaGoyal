/**import java.io.*;
public class guru_pattern
{
     public static void main(String args[])throws IOException
     {
        
         
         InputStreamReader rd = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(rd);
         int i,j,p,n,l,L;
         System.out.print('\u000C');
         
         System.out.println("enter the limit");
         l = Integer.parseInt(br.readLine());
         L=(2*l)-2;
         int a[][] = new int[100][100];
         p=0;
         n=(2*l)-2;
      while(l>0)
      {
          for(i=p;i<=n;i++)
         {
             for(j=p;j<=n;j++)
             {
                 if(i==p||j==p||i==n||j==n)
                 a[i][j]=l;
             }
         }
         p+=1;
         n-=1;
         l-=1;
      }
      System.out.println("GURU's task is successful");
      System.out.println();
      System.out.println();
      for(i=0;i<=L;i++)
      {
          for(j=0;j<=L;j++)
          {
             System.out.print(a[i][j]+" ");
          }
          System.out.println();
      }    
          
   } 
   
}*/
       