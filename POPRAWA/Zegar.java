import java.util.Scanner;
public class Zegar{
    String DecToBin(int z){
        String text="";
        while(z>0){
            text=text+(char)(z%2+48);
            z=z/2;
        }
            String reverse=new StringBuffer(text).reverse().toString();
            return reverse;
    }
            int clock(int l){
                
            
            
                int suma=0;
                int q=l;
                for(int i=0;i<l;i++){
                    if(q%10==1){
                        suma=suma+1;
                    }
                    q=q/10;
                    
                }
                return suma;
            }
            public static void main(String[]args){
                Scanner in=new Scanner(System.in);
                Zegar funkcje=new Zegar();
                System.out.println("Podaj czas w sekundach");
                int z=in.nextInt();
                int l=Integer.parseInt(funkcje.DecToBin(z));
                System.out.println(l+" "+funkcje.clock(l));
            }
}

                