import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
public class hasla{
    int hasla(String haslo,int q){
        int z=0;
        for(int i=0; i<q/2; i++){
        if(haslo.charAt(i) == haslo.charAt(q - 1 - i)){
            z = z + 1;
        }
        else z = 0;
        }
        if(z == q/2){
            return 1;
        }
        return 0;
    }
    int z2(String haslo, int q){
        int z1=0;
        for(int i=0; i<q - 1; i++){
        if((int)haslo.charAt(i) + (int)haslo.charAt(i + 1) == 220){
            z1 = 1;
        }
    }
            return z1;
        }
    public static void main(String[] args) throws FileNotFoundException{
        hasla funkcje = new hasla();
        File file = new File("hasla.txt");
        Scanner in = new Scanner(file);
        int parz=0,nieparz=0;
        PrintWriter zapis = new PrintWriter("wynik4a.txt");
        PrintWriter zapis2 = new PrintWriter("wynik4b.txt");
        PrintWriter zapis3 = new PrintWriter("wynSik4c.txt");
    for(int j=0; j<200; j++){
        String haslo = in.nextLine();
        int q = haslo.length();

        if(q%2==0){
            parz=parz + 1;
        }
        else{
            nieparz=nieparz + 1;
        }
      if(funkcje.hasla(haslo,q) == 1){
          zapis2.println(haslo);
      }
      if(funkcje.z2(haslo,q) == 1){
          zapis3.println(haslo);
      }
    }
    zapis.println("hasla parzyste: " + parz);
    zapis.println("hasla nieparzyste: " + nieparz);
    zapis.close();
    zapis2.close();
    zapis3.close();
}
}
