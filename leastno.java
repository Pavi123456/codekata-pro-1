package sieves;
import java.util.*;
/**
 *
 * @author akil
 */
public class Sieves {

    
   
    public static void main(String a[]){
       
       Scanner scan= new Scanner(System.in);
      String str=scan.next();
      int k=scan.nextInt();
      int temp=1000000000,l=0;
      int n=str.length();
     l=n-k;
     if(k!=0)
     {
     for(int i=0;i<l;i++)
     {
         
         int jk = Integer.parseInt(str.substring(i, i+l));
         if(jk<=temp)
         {
             temp=jk;
         }
     }
     System.out.println(temp);
     }
     else
     {
         System.out.println(str);
     }
      
     /*  n=n-k;
       for(int i=l;i<n;i++)
       {
           System.out.printf("%d ", ch[i]);
       }*/
      
}
}


