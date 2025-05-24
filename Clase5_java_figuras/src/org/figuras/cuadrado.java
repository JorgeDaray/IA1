
package org.figuras;

public class cuadrado {
    private double base;
    private double area;
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getArea() {
        return area;
    }

    public void calcularArea() {
        this.area = (this.base*this.base);
    }
}
