package taller.pkg1;

public class TraduccionA {
    public static void main(String[] args){
        //Muestra la tabla de multiplicar del número ingresado
        
        java.util.Scanner Lectura = new java.util.Scanner(System.in);
        System.out.print("Numero a conocer la tabla de multiplicar: ");
        int n=Lectura.nextInt();
        
        for(int i=0;i<=n;i++){
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
}
