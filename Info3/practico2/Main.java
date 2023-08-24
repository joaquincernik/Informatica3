//package practico2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   
public static void main(String[] args) {

    int opcion=0;
    int n=0;
    int a=0;
    int resultado=0;
    //Functions funcion=new Functions(); 
    Scanner scanner=new Scanner(System.in); 
    
    do{
        System.out.println("INGRESAR OPCION:\n 1:Factorial de un numero \t 2:Suma Recursiva \t 3:Potencia recursiva \t 4:Conteo regresivo \t\n 5:Producto de dos numeros\t 6:Arreglo en orden inverso\t 7:Numero en inario\t ");
        opcion=scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingresa un numero:");
                 n = scanner.nextInt();
                 resultado=Functions.factorial(n);
                 System.out.println("!"+n+"="+resultado);
            break;
            case 2:

                 System.out.println("Ingresa un numero:");
                 n = scanner.nextInt();
                 resultado=Functions.sumaFactorial(n);
                 System.out.println("---------------------");
                 System.out.println(resultado);
            break;
            case 3:
                 System.out.println("Ingresa la base:");
                 a = scanner.nextInt();
                 System.out.println("Ingresa el exponente:");
                 n = scanner.nextInt();
                 resultado=Functions.potenciaRecursiva(a,n);
                 System.out.println("---------------------");
                 System.out.println(resultado);
            break;

            case 4:

                System.out.println("Ingresa numero desde conteo:");
                 n = scanner.nextInt();
                 System.out.println("---------------------");
                 resultado=Functions.conteoRegresivo(n);
                 System.out.println("---------------------");
                 //System.out.println(resultado);
            break;

            case 5:
                System.out.println("Ingresa a:");
                 a = scanner.nextInt();
                 System.out.println("Ingresa b:");
                 n = scanner.nextInt();
                 resultado=Functions.multiplicacionRecursiva(a,n);
                 System.out.println("---------------------");
                 System.out.println(resultado);
            break;

            case 6:
                System.out.println("Ingresa largo de arreglo");
                 n = scanner.nextInt();
                 
                 int [] arreglo = new int[n];
                for(int i=0;i<n;i++){
                    System.out.println("Ingresar valor del arreglo en la posicion "+i);
                    arreglo[i]= scanner.nextInt();
                }
                System.out.println("----------------");
                resultado=Functions.arregloDescendente(arreglo,n);
            break;

            case 7:
                System.out.println("Ingrese numero para escribir en binario");
                n=scanner.nextInt();
                String bin="";
                resultado=Functions.binario(n,bin);
            break;

}
    }while(opcion!=0);
      
}    
}
