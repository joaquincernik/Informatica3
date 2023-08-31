public class Shellsort {
    public static void ordenar(int array[]){
        int salto=3;
        int temp=0;
        for(int i=0;i<array.length;i++){
            salto = 3;
            for(int j=0;(j+salto)<array.length;j++){
                if(array[j]>array[j+salto]){
                    temp=array[j];
                    array[j]=array[j+salto];
                    array[j+salto]=temp;
                }
                else{
                    //System.out.println("salto="+salto);
                    if(salto!=1)
                    salto=(int)salto/2;
                }
            }
            
        }
    }
    public static void imprimir(int array[]){
        for(int n:array){
            System.out.println(" "+n);
        }
    }
}
