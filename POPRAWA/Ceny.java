import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Scanner;
public class Ceny{
    int BinToDec(String str){
        int z=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                z=z++;
                Math.pow(2,str.length()-1-i);
                
            }
           
    }
    return z;
}
public static void main(String[] args) throws FileNotFoundException{
    System.out.println("Wpisz cene:");
    Scanner in=new Scanner(System.in);
    Ceny funkcje=new Ceny();
    String s=in.nextLine();
    Double com=0.0;
    char a=s.charAt(s.length()-1);
    char k=s.charAt(s.length()-1);
    if(a=='1' && k=='0')
    com=0.50;
    else
    if(a=='0' && k=='1')
    com=0.25;
    String temp=s.substring(0,s.length()-3);
    int liczba=funkcje.BinToDec(temp);
    
    Double w=liczba+com;
    
    System.out.println(w);
}

}
