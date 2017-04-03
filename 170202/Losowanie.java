import java.util.Random;

public class Losowanie{
    public static void main(String[] args){
        if(args.length==2){
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            Random rand= new Random();
            int l_los=rand.nextInt(b-a+1)+b;
            System.out.println(l_los);
        }
        else
        System.out.println("BLAD");
        }
    }
   
            
            
            
            
            
   