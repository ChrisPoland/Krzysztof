package scanner;
import java.util.Scanner;
public class Funkcja2{
    boolean stop;
    do{
        stop=false;
    }
    String pierwsza(int n){
        if (n>2)
        { for (int i=2; i<=Math.sqrt(n);i++)
        { if (n%i==0)
            return"liczba zlozona";
            }
}
return "liczba pierwsza";
}
Scanner scanner = new Scanner(System.in);
System.out.println("Czy chcesz kontynuowac?");
String text= scanner.nextLine();
if (text.equals ("Tak"))
stop=true;
}
while(stop == true);
}


public static void main(String[] args)
{Funkcja2 funkcja= new Funkcja2();
int n = Integer.parseInt(args[0]);
System.out.println(funkcja.pierwsza(n));
}
  } 
