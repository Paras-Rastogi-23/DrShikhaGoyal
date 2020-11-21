import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        if(s.equals("")){
            System.out.println(0);
        }
        else{
            s = s.trim();
            String S[] = s.split("[\\n\\t\\r,.: _!@&%'?()]+");
            int l =S.length;
            System.out.println(l);
            for (int i = 0; i < l; i++) {
                System.out.println(S[i]);
            }
        }
    }
}
