
package org.proceso;

import java.util.Arrays;

public class Burbuja {
    private int [] conjunto;
    
    public Burbuja(int [] conjunto)
    {
        this.conjunto = conjunto;
    }
    public void Ordenar()
    {
        int aux;
        for(int i = 0; i < this.conjunto.length; i++)
        {
            for(int j = 1; j < this.conjunto.length; j++)
            {
                if(conjunto[j-1] > conjunto[j])
                {
                    aux = conjunto[j];
                    conjunto[j] = conjunto[j-1];
                    conjunto[j-1] = aux;
                }
            }
        }
    }
    public int [] getConjunto()
    {
        System.out.println(Arrays.toString(conjunto));
        return this.conjunto;
    }
}
