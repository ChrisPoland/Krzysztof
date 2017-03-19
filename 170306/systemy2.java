public class systemy2{
    String BinToDec (int n){
        String tekst="";
        while (n>0){ 
            tekst=tekst+((char)(n%2+48));
            n=n/2;
            
        }  
           String reverse="";
           for(int i=tekst.length()-1;i>0;i--)
           reverse=reverse+tekst.charAt(i);
    }
    public static void main(String[]args){
        systemy2 funkcje=new systemy2();
        System.out.println(funkcje.BinToDec(10));
           
                
        }
          
}