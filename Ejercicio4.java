//crea un programa que calcule la media aritmetica de tres números enteros.

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {

        int Num1;
        int Num2;
        int Num3;
        int Resultadomedia;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero entero: ");
        int Num1Scan = sc.nextInt();

        System.out.println("Ingresa numero entero x2: ");
        int Num2Scan = sc.nextInt();

        System.out.println("Ingresa un numero entero x3: "); 
        int Num3Scan = sc.nextInt();

        Num1 = Num1Scan;
        Num2 = Num2Scan;
        Num3 = Num3Scan;

        Resultadomedia = (Num1 + Num2 + Num3) / 3;

        System.out.println("Resultado = " + Resultadomedia);

    }
}
