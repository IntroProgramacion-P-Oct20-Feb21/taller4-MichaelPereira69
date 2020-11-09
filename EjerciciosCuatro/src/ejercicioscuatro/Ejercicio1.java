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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaro las variables
        Scanner entrada = new Scanner(System.in) ;
        entrada.useLocale(Locale.US) ;
        //base, d[0,n]
        double base ;
         //altura, d[0,n]
        double altura ;
         // areaTriangulo, d[0,n]
        double areaTriangulo ;       
         // pido dato por teclado
         // Escribir "ingrese la base"
         System.out.println("ingrese la base") ;
         base = entrada.nextDouble() ;
         // Escribe "ingrese la altura"
         System.out.println(" ingresar la altura") ; 
         altura = entrada.nextDouble() ;
         // Proceso
         areaTriangulo = base * altura/2 ;
         
    }
    
}
