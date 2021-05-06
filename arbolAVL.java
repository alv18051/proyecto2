public class Recomendaciones { 
    int numSeries; 
    Nodo izq, der; 
    public Nodo(int ser){ 
        numSeries = ser; 
        izq = der = null; 
    } 
    public void ordenado(){ 
        if(izq != null) 
            izq.ordenado(); 
        System.out.println("Series: " +numSeries); 
        if(der != null) 
            der.ordenado(); 
    } 
} 
public class AVL { 
    private Nodo raíz; 
    public AVL (){ 
        raíz = null; 
    } 
    public void insertar(String nuevaS){ 
        if(raíz==null){ 
            raíz =  new Nodo(nuevaS); 
        } 
        else{ 
            insertar(raíz,nuevaS); 
        } 
    } 
    private void insertar(Nodo rz, String ns){ 
        if (rz == null) 
            rz = new Nodo(ns); 
        else if(ns < rz.numSeries) 
            insertar(rz.izq,ns); 
        else if(ns > rz.numSeries) 
            insertar(rz.der,ns); 
        else 
            System.out.println("Series duplicadas"); 
    } 
    public void visualizar(){ 
        if(raíz!=null) 
            raíz.ordenado(); 
    } 
}
public class Ejecutar { 
    public static void main(String []args){ 
        AVL árbol = new AVL (); 
        árbol.insertar("Breaking Bad"); 
        árbol.insertar("Arrow"); 
        árbol.insertar("Game of Thrones"); 
        árbol.visualizar(); 
    } 
}