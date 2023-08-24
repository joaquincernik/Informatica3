import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in);
    List<String> historial=new ArrayList<>();
    //List<String> nombres = new ArrayList<>();
    System.out.println("Ingrese a");
    int a= scanner.nextInt();

    System.out.println("Ingrese b");
    int b= scanner.nextInt();
    int x=0;
    float y=0;
    int seguir=0;
    do {
      System.out.println("1:Sumar\t2:Restar\t3:Multiplicar\t4:Dividir");
      int opcion= scanner.nextInt();
      switch (opcion) {
      case 1:
          x=Calculadora.sumar(a,b);
          historial.add("Sumaste "+a+"+"+b+"="+x);
          System.out.println("RESULTADO="+x);
        break;
    
     case 2:
          x=Calculadora.restar(a,b);
          System.out.println("RESULTADO="+x);
          historial.add("REstaste "+a+"-"+b+"="+x);
        break;
      
        case 3:
          y=Calculadora.multiplicar(a,b);
          System.out.println("RESULTADO="+y);
          historial.add("Multiplicaste "+a+"*"+b+"="+y);
        break;

        case 4:
        try{
           y=Calculadora.dividir(a,b);
          System.out.println("RESULTADO="+y);
          historial.add("Dividiste "+a+"/"+b+"="+y);
        }
         catch(Exception e){
          System.err.print("\nError en la división por cero.\n");
         }
        break;
    }
  


    System.out.println("Ingrese 1 si desea seguir");
    seguir= scanner.nextInt();
    } while (seguir==1);
    System.out.println(historial.toString());
    }}
