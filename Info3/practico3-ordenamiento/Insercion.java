//package practico3-ordenamiento;

public class Insercion {
    
     public static void ordenar(int array[]){
      int temp=0;
        for (int i = 1 ;i<array.length;i++){
          //j=array[i+1];
          for(int j=0;j<=i;j++){
            if(array[i]<array[j]){
              temp=array[j];
            array[j]=array[i];
            array[i]=temp;
          }  
          }     
    }}
    public static void imprimir(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.println(" "+array[i]);
        }
    }

    
}
