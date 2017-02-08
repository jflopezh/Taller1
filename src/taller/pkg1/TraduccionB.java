package taller.pkg1;

public class TraduccionB {
    public static void main(String[] args){
        /* Genera un gráfico reflejado horizontalmente del ejercicio del punto 3.
        Dado el numero de asteriscos en la diagonal izquierda, pinta el número
        de asteriscos en la diagonal derecha. */
        
        int ei=0;
        java.util.Scanner Lectura=new java.util.Scanner(System.in);
        System.out.print("Ingrese n: ");
        int n=Lectura.nextInt();
        System.out.println("\n");
        int inter=(4*n)-3;
        
        for(int i=1;i<=(n*2);i++){
            for(int j=1;j<=ei;j++)
                System.out.print(" ");
            if(i>n)
                System.out.print("*");
            else
                System.out.print(" ");
            for(int j=1;j<=inter;j++)
                System.out.print(" ");
            if(i<=(n*2)-1)
                System.out.print("*");
            ei++;
            inter-=2;
            System.out.println("");
        }
    }
}
