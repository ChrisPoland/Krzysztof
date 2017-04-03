import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class liczby{
    
    
    //funkcje
        int suma_cyfr(int n){
            int suma=0;
        while(n>0){
            suma=suma+n%10;
            n=n/10;
        }  
        return suma;
        }
        
        
          String DecTo4 (int n){
        String tekst="";
        while (n>0){ 
            tekst=tekst+((char)(n%4+48));
            n=n/4;
            
        }  
            String reverse= new StringBuffer(tekst).reverse().toString();
            return reverse;
    }
        
        
        // program glowny
        
        public static void main(String[]args)throws FileNotFoundException{
            liczby funkcje=new liczby();
            File file=new File("liczby.txt");
            Scanner in=new Scanner(file);
            
            int liczba;
            int maxsum=0;
            int maxlicz=0;
            
            while(in.hasNextLine()){
             liczba=in.nextInt();
             if(funkcje.suma_cyfr(liczba)>maxsum) {maxsum=funkcje.suma_cyfr(liczba); maxlicz=liczba;}
            
       // System.out.println(funkcje.suma_cyfr(liczba));
        System.out.println(liczba+" "+funkcje.DecTo4(liczba));
            }
             System.out.println("a"+maxlicz);
                
        }
          
}
        
       
        
        
        
        
    
