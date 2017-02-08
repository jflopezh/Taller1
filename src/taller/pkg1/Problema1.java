/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkg1;

/**
 *
 * @author Estudiante
 */
public class Problema1 {
    public static void main(String[] args) {
        java.util.Scanner Lectura = new java.util.Scanner(System.in);
        System.out.print("Ingrese el largo de la piel de buey: ");
        double Largo = Lectura.nextDouble();
        System.out.print("Ingrese el ancho de la piel de buey: ");
        double Ancho = Lectura.nextDouble();
        
        double Hilo = Largo*Ancho; //Largo del hilo en kilometros
        double Radio = Hilo/(2*3.1416); //Radio de la circunferencia creada con el hilo
        double Area = 3.1416*Radio*Radio; //Area de la circunferencia creada con el hilo
        
        System.out.println("El area del circulo creado con la piel del buey es de: "+Area+"km cuadrados");
    }
}
