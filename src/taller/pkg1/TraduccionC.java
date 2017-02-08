package taller.pkg1;

public class TraduccionC {
    public static void main(String[] args){
        /* Halla el número mas grande, dentro de un rango asignado (en este caso 
        hasta 100), con mayor número de divisores. */
        
        int numDivisores=0;
        int numero=0;
        
        for(int i=1;i<=100;i++){
            int conDivisores=0;
            for(int j=1;j<=i;j++)
                if(i%j==0)
                    conDivisores++;
            if(conDivisores>=numDivisores){
                numDivisores=conDivisores;
                numero=i;
            }
        }
        
        System.out.println("Numero "+numero+" tiene "+numDivisores+" divisores");
    }
}
