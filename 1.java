package special;
import java.util.*;
/**
 *
 * @author akil
 */
public class Special {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        String[] str1=new String[m];
        String stu="";
        String st="";
        for(int j=0;j<m;j++)
        {
            str1[j]=scan.next();
        }
        int n=0,temp=10000,count=0;
       for(int i=0;i<m;i++)
       {
           if(str1[i].length()<=temp)
           {
              temp=str1[i].length();
              stu=str1[i];
           }
          
           
       }
      //System.out.println(temp);
     for(int i=temp;i>=0;i--)
      {
          if(i!=0)
          {
            st=stu.substring(0,i);
           // System.out.println(st);
            count=0;
           for(int j=0;j<m;j++)
           {
               String std=str1[j].substring(0,i);
               if(st.equals(std))
               {
                    
                   count++;
               }
           }
           if(count==m)
           {
               break;
           }
          }
          else
          {
              System.out.println(st.charAt(0));
          }
           
       }
     System.out.println(st);
    
}
}

