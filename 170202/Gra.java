import java.util.Random;
public class Gra{
    public static void main(String[] args){
        
      if(args.length!=1) 
      System.out.println("Blad");
      else{
            Random rand= new Random();
          int moja_liczba=Integer.parseInt(args[0]);
          int liczba_komputera=rand.nextInt(2)+0;
               System.out.println(rand.nextInt(2)+0);
          
         if(moja_liczba==liczba_komputera)        
         System.out.println("Wygrales");
         else
         System.out.println("Przegrales");
          
        
          
      }
        
       
        
        
        
        
        
        
    
    }
}