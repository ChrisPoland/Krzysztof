import java.io.File;
import java.FileNotFoundException;
import java.util.Scanner;
public class pary_liczb{
    int NWD(int a,int b){
        while(a!=b){
            if(a>b) a=a-b;
            else b=b-a;
            
        }
        return a;
    }
    int sumacyfry (int n){
        int s=0;
        while(n>0){
            s=s+n%10;
            n=n/10;
        }
        return s;
    }
    
    public static main void (String[] args)throws FileNotFoundException{
        pary_liczb.funkcje=new pary_liczb();
        File file= new File ("PARY_LICZB.txt");
        Scanner in=new Scanner(file);
        int liczba1,liczba2;
        while(in.hasNextLine()){
            liczba1=in.nextInt();
            liczba2=in.nextInt();
            System.out.println("l1"+liczba1+"(2"+liczba2);
        }
        
       
    }
}

