package taller.pkg1;

public class Punto3 {
    public static void main(String[] args){
        java.util.Scanner Lectura=new java.util.Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int Numero=Lectura.nextInt();
        
        /* boolean[][] Matriz=new boolean[Numero*2][(Numero*3)-1]; */ //Si la matriz se necesita para después
        
        System.out.println("\nLa matriz resultante es la siguiente:\n");      
        for(int i=0;i<Numero*2;i++){
            for(int j=0;j<(Numero*3)-1;j++){
                if(j<Numero)
                    if(j==Numero-(1+i)){
                        /* Matriz[i][j]=true; */ //Si la matriz se necesita para después
                        System.out.print("* ");
                    }else
                        System.out.print("  ");
                else if(j>=Numero)
                    if(j==Numero+(i-1)){
                        /* Matriz[i][j]=true; */ //Si la matriz se necesita para después
                        System.out.print("* ");
                    }else
                        System.out.print("  ");
            }
            System.out.println();
        }
    }
}