import java.util.*;

public class BeyondLimit{

    public static void main(String [] arg)
    {
        Scanner userInput=new Scanner(System.in);
        System.out.print("Panjang=");
        int input = userInput.nextInt();

        System.out.print("Lebar=");
        int input2=userInput.nextInt();

        int hasilkasil=input*input2;

        System.out.println("Hasil Kali="+hasilkasil);
        

        
    }

}