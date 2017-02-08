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
public class Taller1 {

    public static void main(String[] args) {
        java.util.Scanner Lectura = new java.util.Scanner(System.in);
        System.out.print("Ingrese el tamano de los vectores a sumar ");
        int Tamaño = Lectura.nextInt();
        
        int[] Vector1 = new int[Tamaño];
        int[] Vector2 = new int[Tamaño];
        
        System.out.print("\n");
        
        for(int i=0;i<Tamaño;i++) {
            System.out.print("Ingrese el componente "+(i+1)+" del vector 1: ");
            Vector1[i] = Lectura.nextInt();
            System.out.print("Ingrese el componente "+(i+1)+" del vector 2: ");
            Vector2[i] = Lectura.nextInt();
        }
        
        int[] Suma = SumarVectores(Vector1, Vector2);
        
        System.out.print("\n");
        
        System.out.println("El vector resultante es:\n");
        
        for(int i=0; i<Suma.length; i++) {
            System.out.println("Componente "+(i+1)+": "+Suma[i]);
        }
    }
    
    static int[] SumarVectores(int[] Vector1, int[] Vector2) {
        if(Vector1.length!=Vector2.length) {
            return null;
        }
        int[] Retorno = new int[Vector1.length];
        for(int i=0; i<Vector1.length; i++) {
            Retorno[i] = Vector1[i]+Vector2[i];
        }
        return Retorno;
    }
}
