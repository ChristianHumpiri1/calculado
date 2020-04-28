package app;

public class Metodos {
    public static double suma( double a ,  double b){
        return a+b;
    }
    public static double resta( double a ,  double b){
        return a-b;
    }
    public static double multiplicacion( double a ,  double b){
        return a*b;
    }
    public static double division( double a ,  double b){
        if(b==0)
         return  0;
        return a/b;
    }
}