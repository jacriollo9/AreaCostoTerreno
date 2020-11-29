/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacostoterreno;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class AreaCostoTerreno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //Declaracion de variables
        double A, B, C, D, at, ar, areatotal;
        //Inicialización de variables
        A = 0; B = 0; C = 0; D = 0; at = 0; ar = 0; areatotal = 0;
        
        System.out.println("Programa que  permita el calculo"
                +" del area del terreno");
        System.out.println("");
        
        // Lectura de Datos
        System.out.println("Ingrese la altura del paralelogramo");
        A =leer.nextDouble();
        
        System.out.println("Ingrese el largo del paralelogramo");
        B =leer.nextDouble();
        
        System.out.println("Ingrese la altura del paralelogramo");
        C =leer.nextDouble();
        
        //Proceso
        D = Math.pow (A,C);
        at = (B * A) / 2;
        ar = B * C;
        areatotal = at + ar;
        
        //Salida de datos
        System.out.println("El area del terreno es: "+areatotal+
                ", compuesto por un restangulo de largo" +A+
                ", un rectangulo de largo" +B+
                ", y una altura de rectangulo" +C);
        
        //Declaraciòn de variables
        System.out.println("Introdusca el precio por metro cuadrado");
        int a = leer.nextInt();
        System.out.println("Introdusca el largo del terreno");
        Scanner leer2 = new Scanner(System.in);
        int b = leer2.nextInt();
        System.out.println("Introdusca el ancho del terreno");
        Scanner leer3 = new Scanner(System.in);
        int c = leer3.nextInt();
        int d = b * c;
        int total = d * a;
        System.out.println("El costo del terreno es: "+total);
    }  
}
