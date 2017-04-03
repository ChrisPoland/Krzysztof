import java.util.Scanner;
public class BinToDec{
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.println("Wpisz liczbe binarna:");
        String binarna=input.nextLine();
        System.out.println("Liczba decymalna:"+Integer.parseInt(binarna,2));
    }
}
//zamienia na dziesietny, wpisuje 4 na przyklad liczy z czworkowego na dzisietny system