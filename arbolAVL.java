public class Recomendaciones { 
    int numCanciones; 
    Nodo izq, der; 
    public Nodo(int cancion){ 
        numCanciones = cancion; 
        izq = der = null; 
    } 
    public void ordenado(){ 
        if(izq != null) 
            izq.ordenado(); 
        System.out.println("Canciones que hay: " +numCanciones); 
        if(der != null) 
            der.ordenado(); 
    } 
} 

public class AVL { 
    private Nodo raíz; 
    public AVL (){ 
        raíz = null; 
    } 
    public void insertar(String nuevaC){ 
        if(raíz==null){ 
            raíz =  new Nodo(nuevaC); 
        } 
        else{ 
            insertar(raíz,nuevaC); 
        } 
    } 
    private void insertar(Nodo rz, String nc){ 
        if (rz == null) 
            rz = new Nodo(nc); 
        else if(nc < rz.numSeries) 
            insertar(rz.izq,nc); 
        else if(nc > rz.numSeries) 
            insertar(rz.der,nc); 
        else 
            System.out.println("Canciones duplicadas"); 
    } 
    public void visualizar(){ 
        if(raíz!=null) 
            raíz.ordenado(); 
    } 
}

public class Ejecutar { 
    public static void main(String []args){ 
        AVL árbol = new AVL (); 
        árbol.insertar("Master of Puppets"); 
        árbol.insertar("Montero"); 
        árbol.insertar("Mesa que Mas Aplauda"); 
        árbol.visualizar(); 
    } 
}
