import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;


public class Plik{
public static void main(String[] args) throws FileNotFoundException{
    File file= new File("cyfry.txt");
    Scanner in=new Scanner(file);
      PrintWriter zapis=new PrintWriter("wyniki.txt");
     int liczba;
     
     
    while(in.hasNextLine())
    {String text=in.nextLine();
    liczba=Integer.parseInt(text);
   
    if(liczba%2==0) zapis.println(liczba);}
    
   
    zapis.close();
}
}