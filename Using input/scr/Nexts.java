import java.util.Scanner;

public class Nexts {
    public static void main (String [] arg)
    {
        Scanner keyboard;
        String myString;

        keyboard=new Scanner(System.in);
        System.out.print("Enter any string:");
        myString=keyboard.nextLine();
        System.out.println("The string value is:"+myString);
    }
}
