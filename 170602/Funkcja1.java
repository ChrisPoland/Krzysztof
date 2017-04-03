public class Funkcja1 {
    String pierwsza(int n){
        if (n>2)
        { for (int i=2; i<=Math.sqrt(n);i++)
        { if (n%i==0)
            return"liczba zlozona";
            }
}
return "liczba pierwsza";
}
public static void main(String[] args)
{Funkcja1 funkcja= new Funkcja1();
int n= Integer.parseInt(args[0]);
System.out.println(funkcja.pierwsza(n));
}
  } 