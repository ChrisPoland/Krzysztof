public class systemy{
    String DecToBin (int n){
        String tekst="";
        while (n>0){ 
            tekst=tekst+((char)(n%2+48));
            n=n/2;
            
        }  
            String reverse= new StringBuffer(tekst).reverse().toString();
            return reverse;
    }
    public static void main(String[]args){
        systemy funkcje=new systemy();
        System.out.println(funkcje.DecToBin(10));
           
                
        }
          
}