package taller.pkg1;

public class Problema3 {
    public static void main(String[] args){
        java.util.Scanner Lectura = new java.util.Scanner(System.in);
        System.out.println("Ingrese 3 numeros:\n");
        int[] Numeros = new int[3];
        for(int i=0;i<3;i++)
            Numeros[i]=Lectura.nextInt();
        System.out.println("\nEl numero mayor es: "+OrdenarAscendente(Numeros));
        System.out.print("Numeros ordenados de manera ascendente: ");
        for(int i=0;i<3;i++)
            System.out.print(Numeros[i]+" ");
        System.out.println();
    }
    
    static int OrdenarAscendente(int[] Numeros){
        int Cache=0;
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                if(Numeros[j]>Numeros[j+1]){
                    Cache=Numeros[j];
                    Numeros[j]=Numeros[j+1];
                    Numeros[j+1]=Cache;
                }
        return Numeros[2];
    }
}
