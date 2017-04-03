int[] tablica=new int[100];
for(int i=0;i<tablica.length;i++){
    tablica[i]=i;
}
for(int i=0;i<tablica.length;i++){
    if(i<10)
        System.out.println("0"+tablica[i]+",");
    else
        System.out.println(tablica[i]+",");
    
    if(i>0 && (i+1)%10==0){
        System.out.println();
    }
}