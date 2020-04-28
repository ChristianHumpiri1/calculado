package app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Metodos meto = new Metodos();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elija su primer valor: ");
        double  a = teclado.nextDouble();
        System.out.println("Elija su segundo valor: ");
        double  b = teclado.nextDouble();
        System.out.println("La suma es:" +meto.suma(a, b));
        System.out.println("La resta es:" +meto.resta(a, b));
        System.out.println("La multiplicacion es:" +meto.multiplicacion(a, b));
        System.out.println("La division es:" +meto.division(a, b));

    }
}