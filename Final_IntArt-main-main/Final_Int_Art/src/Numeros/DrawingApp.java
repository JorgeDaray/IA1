package Numeros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.image.BufferedImage;


public class DrawingApp {

    public static class DrawingPanel extends JPanel {

        private static final int WIDTH = 50;
        private static final int HEIGHT = 50;

        private List<Point> points;

        public DrawingPanel() {
            setPreferredSize(new Dimension(WIDTH, HEIGHT));
            setBackground(Color.WHITE);

            points = new ArrayList<>();

            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    points.add(e.getPoint());
                    repaint();
                }
            });

            addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent e) {
                    points.add(e.getPoint());
                    repaint();
                }
            });
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            g2d.setColor(Color.BLACK);
            for (int i = 0; i < points.size() - 1; i++) {
                Point p1 = points.get(i);
                Point p2 = points.get(i + 1);
                g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
            }
        }

        public int[][] getPixelMatrix() {
            int[][] pixelMatrix = new int[WIDTH][HEIGHT];
            BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = image.createGraphics();
            this.paint(g2d); // Esto dibuja el componente en la imagen
            g2d.dispose();
        
            // Recorrer todos los píxeles de la imagen
            for (int i = 0; i < WIDTH; i++) {
                for (int j = 0; j < HEIGHT; j++) {
                    int rgb = image.getRGB(i, j);
                    if (rgb != -1) { // Si el píxel no es blanco, marcar como dibujado
                        pixelMatrix[i][j] = 1;
                    }
                }
            }
        
            return pixelMatrix;
        }           
    }
}

