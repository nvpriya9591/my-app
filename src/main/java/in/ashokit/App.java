package in.ashokit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        string s="anu";
        int i=30;
        System.out.println( "Hello World!" );

        // BUG-130
        System.out.println(i);
    }
}
