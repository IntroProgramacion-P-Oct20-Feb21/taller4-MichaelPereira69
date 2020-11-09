/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscuatro;

/**
 *
 * @author reroes
 */
import java.util.Scanner ;
import java.util.Locale; 
public class Ejercicio5 {
     public static void main(String[] args) {
        // declaro las variables
        Scanner entrada = new Scanner(System.in) ;
        entrada.useLocale(Locale.US) ;
 double valorPrstamo ;
 double  interesmensueal;
 int plazoDado ;
 double pagoMensueal;
 //pido los datos por teclado - entradas

         base = entrada.nextDouble() ;
         System.out.println("valorPrestamo") ;
         valorPrestamo = entrada.nextDouble() ;
         System.out.println("interesMensual") ;
         interesMensual = entrada.nextDouble() ;
         System.out.println("pazoDado") ;
         plazoDado = entrada.nextInt() ;
         System.out.println("pagoMensual") ;
         pagoMensual= entrada.nextDouble() ;
          pagoMensual <-- valorPrestamo/plazoDado * valorInteresmensual
}
}