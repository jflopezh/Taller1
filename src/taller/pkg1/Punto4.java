package taller.pkg1;

public class Punto4 {
    public static void main(String[] args){
        String[] Numeros=new String[10];
    
        Numeros[0]=" __ "
                 + "|  |"
                 + "|__|";        
        Numeros[1]="    "
                 + "   |"
                 + "   |";        
        Numeros[2]=" __ "
                 + " __|"
                 + "|__ ";
        Numeros[3]=" __ "
                 + " __|"
                 + " __|";
        Numeros[4]="    "
                 + "|__|"
                 + "   |";
        Numeros[5]=" __ "
                 + "|__ "
                 + " __|";
        Numeros[6]=" __ "
                 + "|__ "
                 + "|__|";
        Numeros[7]=" __ "
                 + "   |"
                 + "   |";
        Numeros[8]=" __ "
                 + "|__|"
                 + "|__|";
        Numeros[9]=" __ "
                 + "|__|"
                 + " __|";
        
        java.util.Scanner Lectura = new java.util.Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        String Numero = Lectura.next();
        
        char[][][] Numero7SD = new char[Numero.length()][3][4];

        //Llenado
        
        int Cont = 0;
        for(int i=0;i<Numero.length();i++){
            int Clase = Character.getNumericValue(Numero.charAt(i));
            for(int j=0;j<3;j++)
                for(int k=0;k<4;k++){
                    Numero7SD[i][j][k]=Numeros[Clase].charAt(Cont);
                    Cont++;
                }
            Cont=0;
        }
        
        //Impresión
        
        System.out.println("\nNumero en visualizador de 7 segmentos:\n");
        for(int j=0;j<3;j++){
            for(int i=0;i<Numero.length();i++){
                for(int k=0;k<4;k++){
                    System.out.print(Numero7SD[i][j][k]);
                }
                System.out.print(' ');
            }
            System.out.print("\n");
        }
    }
}
