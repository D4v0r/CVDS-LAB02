package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
        switch( args.length ){

            case 0:
                System.out.println( "Hello World!" );
                break;
            case 1:
                System.out.println( "Hello "+args[0]+"!" );
                break;
            case 2:
                System.out.println( "Hello "+args[0]+ " "+args[1]+"!" );
                break;

        }
        
    }
}
