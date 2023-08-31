public class Quicksort {
    public static void ordenar(int array[]){
        int temp=0;
        int pivote1=array[0];
        //int pivote2=array[array.length-1];
        int r=0;
        int l=0;
        for(int i=0;i<array.length;i++){
           for(int j=array.length-1;j>=0;j--){
          
            if(array[j]<pivote1&&array[i]>pivote1){
              
                if(i<j){
                /*r=array[i];
                l=array[l];*/
                temp=array[j];
                array[j]=array[i];
                array[i]=temp;
                }
                else{
                    temp=array[i];
                    array[i]=pivote1;
                    pivote1=temp;
                }
            
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
