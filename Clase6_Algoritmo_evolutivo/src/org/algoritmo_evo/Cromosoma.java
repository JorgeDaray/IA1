
package org.algoritmo_evo;

import java.util.Random;

public class Cromosoma implements Comparable<Cromosoma>{
    private int[] array_cromosoma;
    private double estadoFisico;
    public Cromosoma(int tam) {
    array_cromosoma = new int[tam];
}
    public void inicia() {
    Random rand = new Random();
    for (int i = 0; i < array_cromosoma.length; i++) {
    array_cromosoma[i] = rand.nextInt(2); // 2 Cromosoma X, Cromosoma Y
    }
    }
    public void evaluarEstadoFisico() {
    estadoFisico = 0;
    for (int gen : array_cromosoma) {
    estadoFisico += gen;
    }
    }
    public int getTamano() {
    return array_cromosoma.length;
    }
    public int getGen(int pos) {
    return array_cromosoma[pos];
    }
    public void setGen(int pos, int valor) {
    array_cromosoma[pos] = valor;
    }
    public void mutarGen(int pos) {
    array_cromosoma[pos] = 1 - array_cromosoma[pos];
    }
    public int[] getCromosoma() {
    return array_cromosoma;
    }
    public double getEstadoFisico() {
    return estadoFisico;
    }
    @Override
    public int compareTo(Cromosoma ob) { /// metodo que utiliza Array.Sort
    return Double.compare(this.estadoFisico, ob.estadoFisico);
    }
}
