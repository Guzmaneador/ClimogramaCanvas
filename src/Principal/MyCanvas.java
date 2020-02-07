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

    int[] humedad = {105,95,115,94,80,61,59,63,69,109,98,91};
    int[] temperatura = {24,23,21,18,15,12,11,13,14,16,19,23};

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

            g.drawLine(xOld, yOld,separacion+11, this.getHeight()-temperatura[i]*6);
            xOld=separacion+11;
            yOld=this.getHeight()-temperatura[i]*6;
        }
        g.drawLine(xOld, yOld,(40+11)*13, this.getHeight()-temperatura[11]*6);

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