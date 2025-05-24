
package org.figuras;

public class triangulo {
    private double base;
    private double altura;
    private double area;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void calcularArea() {
        this.area = (this.base*this.altura)/2;
    }
    
}
