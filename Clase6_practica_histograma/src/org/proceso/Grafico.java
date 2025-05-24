
package org.proceso;




import java.awt.Color;
import java.util.Arrays;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.renderer.category.BarRenderer;




public class Grafico {
    public void crear_histrograma(int[] histograma, JPanel Panel, Color colorBarra)
    {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String serie = "Conjunto de Datos";
        System.out.println("Histograma: " + Arrays.toString(histograma));
        for (int i = 0; i < histograma.length; i++)
        {
            System.out.println("Histograma i: " + (histograma[i]));
            dataset.addValue(histograma[i], serie, "" + i);
        }
        JFreeChart chart = ChartFactory.createBarChart("Histograma", null, null, 
                dataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot trama = (CategoryPlot) chart.getPlot();
        BarRenderer render = (BarRenderer) trama.getRenderer();
        render.setSeriesPaint(0, colorBarra);
        chart.setAntiAlias(true);
        chart.setBackgroundPaint(new Color(214,217,223));
        Panel.removeAll();
        Panel.repaint();
        Panel.setLayout(new java.awt.BorderLayout());
        Panel.add(new ChartPanel(chart));
        Panel.validate();
    }
}
