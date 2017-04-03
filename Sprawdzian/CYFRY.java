import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CYFRY{
   
    public static void main( String[] args ) throws FileNotFoundException {
       
        File cyfry = new File( "cyfry.txt" ); 
        Scanner in = new Scanner( cyfry );
        int[] Cyfry = new int[ 1000 ];
        String linia;
        int i = 0;
       while( in.hasNextLine() ) {
            linia = in.nextLine();
            Cyfry[ i ] = Integer.parseInt( linia );
            i++;
        }
       
        int liczbyparzyste = 0;
        for( i = 0; i <= 999; i++ ) {
            if( Cyfry[ i ]% 2 == 0 ) {
                liczbyparzyste++;
            }
        }
        System.out.println( "Liczb parzystych jest " + liczbyparzyste);
    }
}
       