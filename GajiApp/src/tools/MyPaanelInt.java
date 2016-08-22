/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tools;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Prie
 */
public class MyPaanelInt extends JPanel {
    private Image image;
    public MyPaanelInt(){
        try {
            image = new ImageIcon(getClass().getResource("/images/bgInl.jpg")).getImage();
        } catch (Exception e) {
  //          System.out.println("Image tidak dapat ditemukan : " + getClass().getResource("."));
        }
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D)g.create();
        gd.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();
    }
}
