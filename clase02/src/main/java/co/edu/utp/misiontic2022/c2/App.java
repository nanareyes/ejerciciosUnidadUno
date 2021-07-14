package co.edu.utp.misiontic2022.c2;

import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class App {

    // Calcular el número de la suerte partiendo de la fecha de cumpleaños
    /*
     * public static void main(String[] args) { Scanner sca = new
     * Scanner(System.in); int dia, mes, año, suerte, sumaDigitos = 0;
     * System.out.println("Digite su fecha de nacimiento");
     * System.out.println("Día"); dia = sca.nextInt(); System.out.println("Mes");
     * mes = sca.nextInt(); System.out.println("Año"); año = sca.nextInt(); suerte =
     * dia + mes + año; while (suerte != 0) { sumaDigitos = sumaDigitos + (suerte %
     * 10); suerte = suerte / 10;
     * 
     * } System.out.println("El número de la suerte es: " + sumaDigitos);
     * 
     * }
     */

    // calcular la venta, cantidad e iva de un producto
    /*
     * public static void main(String[] args) { Scanner sca = new
     * Scanner(System.in); float precio, cantidad, iva, venta, ventaTotal = 0;
     * System.out.println("Digite el precio del producto: "); precio =
     * sca.nextInt(); System.out.println("Digite la cantidad de productos: ");
     * cantidad = sca.nextInt();
     * System.out.println("Digite el porcentaje de iva: "); iva = sca.nextInt();
     * venta = (precio * cantidad); iva = iva / 100; ventaTotal = (venta * iva) +
     * venta;
     * 
     * System.out.println("El valor del producto es: " + ventaTotal);
     * 
     * }
     */

    // calcular un numero n restandole los últimos dígitos de acuerdo a la cantidad
    // de m
    /*
     * public static void main(String[] args) { Scanner sca = new
     * Scanner(System.in); int N, m; System.out.println("Digite el valor de N: "); N
     * = sca.nextInt(); System.out.println("Digite el valor de m: "); m =
     * sca.nextInt(); N = N / (int) Math.pow(10, m);
     * 
     * System.out.println(N); }
     */

    // calcular la hipotenusa de un triangulo rectangulo
    /*
     * public static void main(String[] args) {
     * 
     * Scanner sca = new Scanner(System.in); float cateto1, cateto2; double
     * hipotenusa; System.out.println("Intruduzca el valor del primer cateto: ");
     * cateto1 = sca.nextFloat();
     * System.out.println("Introduzcca el valor del segundo cateto: "); cateto2 =
     * sca.nextFloat(); hipotenusa = (Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
     * System.out.println("La hipotenusa es igual a: " + hipotenusa); }
     */

    // Programa que muestre la distancia en m/s:
    /*
     * public static void main(String[] args) {
     * 
     * Scanner sca = new Scanner(System.in); float kilometros, horas, metros,
     * segundos; System.out.println("Intruduzca la distancia en km: "); kilometros =
     * sca.nextFloat();
     * System.out.println("Intruduzca el tiempo recorrido en horas: "); horas =
     * sca.nextFloat(); metros = kilometros * 1000; segundos = horas * 3600;
     * System.out.println("La distancia recorrieda en m/s es : " + metros + "/" +
     * segundos); }
     */

    // Programa que lea un número entero y muestre si el número es múltiplo de 10
    /*
     * public static void main(String[] args) {
     * 
     * Scanner sca = new Scanner(System.in); int numero;
     * System.out.println("Digite un número: "); numero = sca.nextInt(); if (numero
     * % 10 == 0) System.out.println("El número es múltiplo de 10"); else
     * System.out.println("El número no es múltiplo de 10"); }
     */

    // Programa que lea un carácter por teclado y compruebe si es una letra
    // mayúscula
    public static void main(String[] args) throws IOException {
        Scanner sca = new Scanner(System.in);
        char letra;
        System.out.println("Digite una letra: ");
        letra = (char) System.in.read();
        if (Character.isUpperCase(letra))
            System.out.println(letra + " : Es una letra mayúscula");
        else
            System.out.println(letra + " : Es una letra minúscula");
    }
}

// public static void main(String[] args) {
// Scanner sca = new Scanner(System.in);