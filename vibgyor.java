/*Program to show the code of the colours */
 import java.util.Scanner;
public class vibgyor
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String colour = "";
        System.out.print("ENTER THE COLOUR CODE");
        int code = scan.nextInt();
        switch(code)
        {
            case 1:
            colour = "Violet";
            break;
            
            case 2:
            colour = "Indigo";
            break;
            
            case 3:
            colour = "Blue";
            break;
            
            case 4:
            colour = "Green";
            break;
            
            case 5:
            colour = "Yellow";
            break;
            
            case 6:
            colour = "Orange";
            break;
            
            case 7:
            colour = "Red";
            break;
            
            default:
            System.out.println("****INVALID CODE ENTERED****");
        }
        System.out.println("COLOUR FOR THE CODE "+code+" IS:"+colour);
        scan.close();
    }
}
        