
package org.algoritmo_evo;

import java.util.Arrays;
import java.util.Random;

public class Muestra {
    private Cromosoma[] array;
    public Muestra(int tam_Muestra, int tam_Cromosoma) {
    array = new Cromosoma[tam_Muestra];
    for (int i = 0; i < tam_Muestra; i++) {
    array[i] = new Cromosoma(tam_Cromosoma);
    }
}
    public void inicia() {
    for (Cromosoma c : array) {
    c.inicia();
    }
    }
    public void evaluarEstadoFisico() {
    for (Cromosoma c : array) {
    c.evaluarEstadoFisico();
    }
    }
    public double getMejorEstadoFisico() {
    double mejorEstadoFisico = array[0].getEstadoFisico();
    for (Cromosoma c : array) {
    if (c.getEstadoFisico() > mejorEstadoFisico) {
    mejorEstadoFisico = c.getEstadoFisico();
    }
    }
    return mejorEstadoFisico;
    }
    public void seleccionarPadre() {
    Arrays.sort(array);
    }
    public void cruzar() {
    Random rand = new Random();
    for (int i = 0; i < array.length / 2; i++) {
    int limite = rand.nextInt(array[i].getTamano());
    Cromosoma hijo1 = new Cromosoma(array[i].getTamano());
    Cromosoma hijo2 = new Cromosoma(array[i].getTamano());
    // copiamos genes para el primer hijo desde el inicio hasta el punto de corte -limite
    for (int j = 0; j < limite; j++) {
    hijo1.setGen(j, array[i].getGen(j));
    hijo2.setGen(j, array[i + 1].getGen(j));
    }
    // para el segundo se copia apartir del limite hasta el final
    for (int j = limite; j < array[i].getTamano(); j++) {
    hijo1.setGen(j, array[i + 1].getGen(j));
    hijo2.setGen(j, array[i].getGen(j));
    }
    array[i] = hijo1;
    array[i + 1] = hijo2;
    }
    }
    public void mutar(double tasaMutacion) {
    Random rand = new Random();
    for (Cromosoma c : array) {
    for (int i = 0; i < c.getTamano(); i++) {
    if (rand.nextDouble() < tasaMutacion) {
    c.mutarGen(i);
    }
    }
    }
    }
    public int[] getMejorCromosoma() {
    Cromosoma mejorCrom = array[0];
    double mejorEstadoFisico = array[0].getEstadoFisico();
    for (Cromosoma c : array) {
    if (c.getEstadoFisico() > mejorEstadoFisico) {
    mejorCrom = c;
    mejorEstadoFisico = c.getEstadoFisico();
    }
    }
    return mejorCrom.getCromosoma();
    }
}
