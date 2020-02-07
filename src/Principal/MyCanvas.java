package Principal;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 *
 * @author Guzman
 */
public class MyCanvas extends Canvas{
//    int[] humedad = {0,0,0,0,0,0,0,0,0,0,0,0};
    int[] humedad = {20,9,100,9,80,9,60,9,40,9,120,9};
    int[] temperatura = {0,0,0,0,0,0,0,0,0,0,0,0};

    public MyCanvas() {
    }
    
    @Override
    public void paint(Graphics g){
       getPreferredSize();
       g.setColor(Color.GRAY);
       int num=1;
        while (num != 8) {
                   g.fillRect(0, this.getHeight()-60*num, this.getWidth(), 2);
                   num++;
        }
       
       g.setColor(Color.BLUE);
        for (int i=0,separacion=40; i < humedad.length; i++,separacion+=50) {
            g.fillRect(separacion, this.getHeight()-humedad[i]*3, 30, this.getHeight());
        }
        
        
        g.setColor(Color.red);
        g.fillOval(40+11, this.getHeight()-10*6, 5, 5);
//       g.fillRect(88, this.getHeight()-40, 10, this.getHeight());
    }

    @Override
    public void repaint(){
        
    }
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(80, 300);
    }
    public void setHumedad(int[] humedad){
        this.humedad=humedad;
        repaint();                
    }
    public void setTemperatura(int[] temperatura){
        this.temperatura=temperatura;
    }
}