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
    int[] temperatura = {10,30,40,40,46,32,11,21,23,40,12,19};

    public MyCanvas() {
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
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
        
        int xOld=0;int yOld=this.getHeight()-temperatura[0]*6;
        g.setColor(Color.red);
        for (int i = 0,separacion=40; i < temperatura.length; i++,separacion+=50) {
            g.fillOval(separacion+11, this.getHeight()-temperatura[i]*6, 5, 5);
            g.drawLine(xOld, yOld,separacion+11, this.getHeight()-temperatura[i]*6);
            xOld=separacion+11;
            yOld=this.getHeight()-temperatura[i]*6;
        }
//       g.fillRect(88, this.getHeight()-40, 10, this.getHeight());
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
        repaint();
    }
}