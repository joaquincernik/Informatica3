//package practico4-estructuras;

public class Main {
    public static void main(String[] args) {
       
        //try {
           /* stack.push(20);
            stack.push(40);
            System.out.println(stack.top());
      
          } catch (Exception e) {
            System.err.println(e.getMessage());
          }
        }
*/
        String c="nequen";
        Palindromo p=new Palindromo(c);
        if(p.esPalindromo(c.length())){
          System.out.print("Es palíndromo");}
          else{
            System.out.println("NO palindromo");
        }
        
      //  Functions.pushPalindromo("coca");
        
      
    }
  }

