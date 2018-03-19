package happybday;
import java.util.*;
/**
 *
 * @author akil
 */
public class Happybday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String str1=scan.nextLine();
        String str2=scan.nextLine();
        char[] ch=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        int n=str2.length()-str1.length();
        int count=0;
        for(int i=0;i<str1.length();i++)
        {
            if(ch[i]!=ch2[i])
            {
                count++;
            }
        }
        int sum=n+count;
        System.out.println(sum);
        // TODO code application logic here
    }
    
}
