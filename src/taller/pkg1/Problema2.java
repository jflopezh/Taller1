package taller.pkg1;

public class Problema2 {
    public static void main(String[] args) {
        java.util.Scanner Lectura = new java.util.Scanner(System.in);
        System.out.print("Ingrese la cantidad de histogramas a elaborar: ");
        int Cant = Lectura.nextInt();
        
        boolean[][][] Histogramas = new boolean[Cant][][];
        
        for(int i=0;i<Cant;i++){
            System.out.print("\n");
            System.out.print("Ingrese el numero de barras del histograma "+(i+1)+": ");
            int Barras = Lectura.nextInt();
            System.out.print("\n");
            int[] Datos = new int[Barras];
            System.out.println("Ingrese cada uno de los datos: \n");
            int BarraMasLarga = 0;
            for(int j=0;j<Barras;j++){
                Datos[j]=Lectura.next().length();
                if(Datos[j]>BarraMasLarga){
                    BarraMasLarga=Datos[j];
                }
            }
            Histogramas[i] = CrearHistograma(BarraMasLarga, Barras, Datos);
        }
        
        for(int i=0;i<Cant;i++){
            System.out.println("\n"+"Histograma "+(i+1)+":\n");
            for(int j=0;j<Histogramas[i].length;j++){
                for(int k=0;k<Histogramas[i][j].length;k++){
                    if(Histogramas[i][j][k])
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.print("\n");
            }
        }
    }
    
    static boolean[][] CrearHistograma(int BarraMasLarga, int CantBarras, int[] Datos){
        boolean[][] Diagrama=new boolean[BarraMasLarga][CantBarras];

        for(int i=0;i<BarraMasLarga;i++){
            for(int j=0;j<CantBarras;j++){
                if(Datos[j]>=BarraMasLarga-i)
                    Diagrama[i][j] = true;
                else 
                    Diagrama[i][j] = false;
            }
        }
        
        return Diagrama;
    }
}
