/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author Sou Akiyama
 */
public class Lamina extends JPanel {
    
    //Puntos para los círculos que se van a guardar en un arreglo (Point)
    private Point[] puntos = new Point[70];
    //La dimensión de la pantalla 
    private Dimension pantalla = null;

    public Lamina(Dimension pantalla) {
        this.pantalla = pantalla;
        crearCirculos();
    }

    private void crearCirculos() {
        Random rd = new Random();
        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = new Point(rd.nextInt(pantalla.width), 
                    rd.nextInt(pantalla.height));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < puntos.length; i++) {
            g.drawOval(puntos[i].x, puntos[i].y, 10, 10);
            if (i < puntos.length - 1) {
                g.drawLine(puntos[i].x + 5, puntos[i].y + 5, 
                        puntos[i + 1].x + 5, puntos[i +1].y + 5);
            }
        }
        crearCirculos();
    }
}
