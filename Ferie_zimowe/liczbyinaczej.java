import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class liczbyinaczej{
    public static void main(String[] args) throws FileNotFoundException{
        int size;   //rozmiar liczby
        int liczba_parzysta=0; //licznik liczb parzystych
        int liczba_najwieksza=0;  //wyszukuje liczbe najwieksza
        int liczby_dziewieciocyfrowe=0;  //licznik liczb dziewieciocyfrowych
        File file=new File("liczbyinaczej.txt");
        Scanner in=new Scanner(file);
        String BinToDec(String s)
        {
            int wynik=0;
            for(int i=0;i<size();i++)
            wynik=2*wynik+(s[i]-'0');
            return wynik;
            String text;
            while(in.hasNextLine()){
                text=in.nextLine();
                size=text.length();
                if (size==9)liczby_dziewieciocyfrowe++;
                if(text.charAt(size-1)=='0')liczba_parzysta++;
            }
                System.out.println("a)"+liczba_parzysta);
                System.out.println("c)"+liczby_dziewieciocyfrowe);
            }
    }