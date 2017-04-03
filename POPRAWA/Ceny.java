import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Ceny{
    int BinToDec(String o){
        double k=0;
        for(int i=0;i<o.length();i++){
            if(o.charAt(i)== '1'){
            k=k+ Math.pow(2,o.length()-1-i);
     }

    }
    return (int) k;
        }
    
    public static void main(String [] args) throws FileNotFoundException{
        Scanner in = new Scanner(System.in);
        System.out.println("Cena w systemie dwójkowym:");
        Ceny funkcje = new Ceny();
        String s=in.nextLine();
        Double f=0.0;
        char a=s.charAt(s.length()-2);
        char d=s.charAt(s.length()-1);
        if(a=='1' && d=='1')f=0.75;
        else if(a=='1' && d=='0')f=0.50;
        else if(a=='0' && d=='1')f=0.25;
        String p = s.substring(0, s.length()-3);
        int liczba = funkcje.BinToDec(p);
        Double w=liczba+f;
        System.out.println("Cena w systemie dziesiętnym: "+w);
        

    }
}