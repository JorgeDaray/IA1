
package org.nodos;

import java.util.ArrayList;

public class Lista_nodos 
{
    private ArrayList<nodo> lista;
    
    public Lista_nodos(ArrayList<nodo> lista)
    {
        this.lista=lista;
    }
    
    public void Agregar_nodo(nodo nodo)
    {
        this.lista.add(nodo);
    }
    public ArrayList<nodo> getActualizar()
    {
        return this.lista;
    }
    public nodo Buscar(nodo nodo)
    {
        nodo aux=null;
        for(nodo n: lista)
        {
            if(n.getNodo_id() == nodo.getNodo_id())
            {
                aux=new nodo();
                aux.setNodo_id(n.getNodo_id());
                aux.setNombre(n.getNombre());
                aux.setPeso(n.getPeso());
            }
        }
        return aux;
    }
    public int nuevo_nodo(nodo nodo)
    {
        this.lista.add(nodo);
        return 0;
    }
    public void editar_nodo()
    {
        
    }
    public void eliminar_nodo(nodo nodo)
    {
        this.lista.remove(0);
    }
}