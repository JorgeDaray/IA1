
package org.algoritmo_evo;

import java.util.Arrays;

public class Maini {
private int tam_Muestra=50;
private int tam_Cromosoma=10;
private int num_Generacion=500;
private double tasaMutacion=0.01;
private Muestra m ;
public Maini() {
m = new Muestra(tam_Muestra, tam_Cromosoma);
}
public void ejecutar() {
m.inicia();
for (int i = 0; i < num_Generacion; i++) {
m.evaluarEstadoFisico();
System.out.println("Generación " + (i + 1) + ": Mejor estado fisico = " +
m.getMejorEstadoFisico());
m.seleccionarPadre();
m.cruzar();
m.mutar(tasaMutacion);
}
System.out.println("\nMejor solución encontrada: " +
Arrays.toString(m.getMejorCromosoma())+ "\nMejor Estado Fisico: "+m.getMejorEstadoFisico());
}
public static void main(String[] args) {
    Maini ag = new Maini();
    ag.ejecutar();
    }
}
