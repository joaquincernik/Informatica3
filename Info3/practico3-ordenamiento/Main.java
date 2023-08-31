//package practico3-ordenamiento;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int arraySize=10;
        int[] randomArray= new int[arraySize];
        Random random=new Random();
        long startTime=System.nanoTime();
        /*for(int n:randomArray){
            n=random.nextInt(1000);
        }*/

        for(int i=0;i<randomArray.length;i++){
            randomArray[i]=random.nextInt(1000);
        }
        /*Insercion.ordenar(randomArray);
        Insercion.imprimir(randomArray);*/
        Shellsort.imprimir(randomArray);
        System.out.println("///////");
        /*Shellsort.ordenar(randomArray);
        Shellsort.imprimir(randomArray);*/
        Quicksort.ordenar(randomArray);
        Quicksort.imprimir(randomArray);
        long endTime=System.nanoTime();
        long tiempoLegible= (endTime-startTime)/1000000;

        System.out.println("Tiempo transcurrido:"+tiempoLegible+"ms");


    }
}
