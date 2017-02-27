public class pary_liczb{
    int NWD(int a,int b){
        while(a!=b){
            if(a>b) a=a-b;
            else b=b-a;
            
        }
        return a;
    }
    
    public static main void(String[] args){
        
        System.out.println("Test");
        
    }
}