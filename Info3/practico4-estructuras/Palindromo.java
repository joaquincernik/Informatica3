import java.util.ArrayList;
public class Palindromo {
    Stack<String> palabra;
    Stack<String> alReves;


    public Palindromo(String p){
        try {
        p.trim().toLowerCase();
        this.palabra = new Stack<String>(p.length());
        this.alReves = new Stack<String>(p.length());

        for(int i=0;i<p.length();i++){
            this.palabra.push(String.valueOf(p.charAt(i)));
        }
        
        for(int j=p.length()-1;j>=0;j--){
             this.alReves.push(String.valueOf(p.charAt(j)));
            }
        //System.out.println(alReves.pop());
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }

    public Boolean esPalindromo(int length){
        try{
            String top="";
            String topAlReves="";
             for(int i=0;i<length;i++){
                top=palabra.pop();
                topAlReves=alReves.pop();
                System.out.println(top+"||"+topAlReves);
                     if(!top.equals(topAlReves)){
                        return false;
                    }
            }
        return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
     
    }
}
