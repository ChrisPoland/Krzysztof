public class liczby_pierwsze{
boolean l_pierwsza(int l1){
    if(l1<2)
    return false;
    for(int i=2;i<+Math.sqrt(l1);i++)
    if(l1%i==0)
    return false;
    return true;
}
public static void main(String[]args){
    liczby_pierwsze=new liczby_pierwsze();
    if(l1(Integer.parseInt(args[0])==false)
    System.out.println("Ta liczba nie jest pierwsza");
    else
    System.out.println("Ta liczba jest pierwsza");
}
}

