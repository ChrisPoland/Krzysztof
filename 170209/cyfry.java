import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;


public class cyfry{
public static void main(String[] args) throws FileNotFoundException{
    File file= new File("cyfry.txt");
    Scanner in=new Scanner(file);
      PrintWriter zapis=new PrintWriter("zadanie4.txt");
     int liczba;
     int ile=0;
     
    while(in.hasNextLine())
    {String text=in.nextLine();
    liczba=Integer.parseInt(text);
   
    if(liczba%2==0) ile++; }
    int suma_cyfr
    System.out.println("Podaj liczbe x:");
    wynik=0
    while (x!=0){
        wynik+=x%10;
        x/=10;
    }
    System.out println("Suma cyfr wynosi"+wynik);
    
   zapis.println("a) "+ile);
    zapis.close();
}
}