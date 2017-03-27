import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class hasla{
    public static void main(String[]args)throws FileNotFoundException{
        File file=new File("hasla.txt");
        Scanner in= new Scanner(file);
         int lp=0, ln=0;
       while(in.hasNextLine())
       {String text=in.nextLine();
       if (text.length()%2==0) lp++; else ln++;
          
          
       }
      // System.out.println("Liczba parzysta "+lp);
      
      // System.out.println("Liczba nieparzysta "+ln);
        PrintWriter zapis= new PrintWriter("wyniki4a.txt");
        zapis.println("Liczba parzysta "+lp);
          zapis.println("Liczba nieparzysta "+ln);
        zapis.close();
    }
}