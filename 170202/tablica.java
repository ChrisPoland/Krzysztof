import java.util.Scanner;
public class tablica{
    public static void main(String[] args){
        Scanner Tablica=new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz wpisac:");
        String liczba=Tablica.nextLine();
        int tablica = new int[10];
        int zmienna=tablica[];
        for (int i=0;i<10;i++){
            tablica[i]=i+1;
            System.out.println("następna liczba to:"+tablica[i]);
        }
       
    }
}