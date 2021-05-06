//Javier Alvarez 18051
//Jorge Perez 18364
//Diego Ruiz 18761

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
