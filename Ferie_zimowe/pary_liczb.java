import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class pary_liczb{
    
    //                           FUNKCJE
    
   
    
    int NWD(int a, int b){
        
        while(a!=b){
            if(a>b) a=a-b; else b=b-a;
        }
        
         return a;
        
    }

    int sumacyfr(int a){
        int s=0;
        while(a>0)
        {s=s+a%10;
        a=a/10;}
        return s;
    }


//                            PROGRAM GŁÓWNY
    public static void main(String[] args) throws FileNotFoundException{

   
   

       //przygotowanie do odczytu z pliku liczbyinaczej.txt
        File file = new File("PARY_LICZB.TXT");
        Scanner in=new Scanner(file);
        
       //przygotowanie do zapisu do pliku zadanie5.txt
        PrintWriter zapis=new PrintWriter("zadanie5.txt");
        
        //Tworze obiekt naszej klasy o nazwie funkcje, aby móc później wywoływać np. funkcje.BinToDec()
        pary_liczb funkcje=new pary_liczb();
       
       
       int l1,l2;
       
        //pobieramy kolejne linijki pliku, zapisujemy je w zmiennej tekst, a ich długosć w zm. size
         while(in.hasNextLine()){
             l1=in.nextInt();
            l2 =in.nextInt();
           if(liczba1%liczba2==0 || liczba2%liczba1==0);
           ile_wiek++
             System.out.println(l1+"aaa"+l2);
        }
        

  
        
   
     
    }

}