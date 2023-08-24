
public class Functions{
    public static int factorial(int n){

        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    public static int sumaFactorial(int n){
        if(n==1){
            System.out.println(1);
            return 1;
        }
        else{
            System.out.println(n+"+");
            return n+sumaFactorial(n-1);
        }
    }

    public static int potenciaRecursiva(int a,int n){
        if(n==0){
            return 1;
        }
        else{
            return a*potenciaRecursiva(a,n-1);
        }
    }
    public static int conteoRegresivo(int n){
        if(n==1){
            System.out.println(1);
            return 1;
        }
        else{
            System.out.println(n);
            return conteoRegresivo(n-1);
        }
    }  
    public static int multiplicacionRecursiva(int a,int n){
        if(n==1){
            System.out.println(a+"+");
            return a;
        }
        else{
            System.out.println(a+"+");
            return a+ multiplicacionRecursiva(a, n-1);
        }
    } 

    public static int arregloDescendente(int arreglo[],int n){
        if(n==0){
            System.out.println("------------");
            return arreglo[0];
        }
        else{
           // System.out.println("---------------");
            System.out.println(arreglo[n-1]);
            return arregloDescendente(arreglo, n-1);
        }
    }

    public static int binario(int num,String bin){
        if(num==1){
            bin=1+bin;
            System.out.println(bin);
            return 1;
        }
        else{
            bin=num%2+bin+"";
            return binario(num/2,bin);
        }
    }
}