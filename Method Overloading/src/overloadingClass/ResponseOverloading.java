package overloadingClass;

public class ResponseOverloading {
    public static void response ( String data)
    {
        System.out.println("The data is a string\""+data+"\".");
    }

    public static void response (boolean data)
    {
        System.out.println("The data is a boolean\""+data+"\".");
    }

    public static void response (int data)
    {
        System.out.println("The data is a int\""+data+"\".");
    }
}
