/*Program to print suceeding character if the enterd number is positive and preceeding characterif the entered is negetive*/
import java.util.Scanner;
public class Question_1
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A CHARACTER");
       char c = sc.next().charAt(0); 
       System.out.println("ENTER A NUMBER");
       int n = sc.nextInt();
       if (n<0)
       {
        c-=1;
        System.out.println("THE PRECCEDING CHARACTER IS : "+c);
       }
       else  
       {
        c+=1;
        System.out.println("THE SUCEEDING CHARACTER IS : "+c);
       }
    
    }
}
