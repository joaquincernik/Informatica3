public class Calculadora {
    public static int sumar(int a,int b){
        return a+b;
    }
    public static int restar(int a,int b){
        return a-b;
    }
    public static float multiplicar(int a,int b){
        return (float)a*b;
    }
    public static float dividir (int a,int b) throws Exception{
        if(b==0){
            throw new Exception();
        }
        return (float) a/b;
    }
}
