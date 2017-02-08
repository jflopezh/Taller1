package taller.pkg1;

public class TraduccionD {
    /* El programa imprime una permutación (variación del orden o disposición de
    los elementos) del vector anteriormente definido, esta se obtiene a traves de
    la funcion permutación la cual es la que me mezcla los componentes del vector
    pasado por los parametros. */
    
    public static void main(String[] args){
        int[] a=new int[4];
        for(int i=0;i<4;i++)
            a[i]=i+1;
        
        permutacion(a, 4);
        
        for(int i=0;i<4;i++)
            System.out.println(a[i]);
    }
    
    static void permutacion(int[] a, int tamaño){
        int t=0;
        int k=0;
        
        for(int i=0;i<tamaño;i++){
            k=(int)(Math.random()*tamaño);
            t=a[i];
            a[i]=a[k];
            a[k]=t;
        }
    }
}
