/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Sou Akiyama
 */
public class Marco extends JFrame {
    private static final int ANCHURA = 500;
    private static final int ALTURA = 300;

    public Marco() throws HeadlessException {
        this.setSize(ANCHURA, ALTURA);
        this.setLocationRelativeTo(this);
        
        // Toolkit 
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension pantalla = kit.getScreenSize();
        int altura = pantalla.height;
        int anchura = pantalla.width;
        this.setSize(anchura / 2, altura /2);
        this.setLocation(anchura / 4, altura /4);
        
        this.setTitle("Programación con Swing");
        
        // Agregar la lámina
        Lamina lamina = new Lamina(new Dimension(anchura / 2, altura / 2));
        this.add(lamina);
        
        // Agregar eventos - oyente al JFrame
        EventosVentana oyente = new EventosVentana();
        this.addWindowListener(oyente);
        
    }
}
