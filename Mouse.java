import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import javax.swing.JFrame;

public class Mouse implements MouseListener, MouseMotionListener{
   
   int mouse_x;
   int mouse_y;
   boolean[] event = new boolean[7];
   
   Mouse(){

   }

   @Override
   public void mousePressed(MouseEvent e) {
      event[0]=true;

   }

   @Override
   public void mouseReleased(MouseEvent e) {
      event[1]=true;

   }

   @Override
   public void mouseEntered(MouseEvent e) {
      event[2]=true;
      event[3]=false;
   }

   @Override
   public void mouseExited(MouseEvent e) {
      event[3]=true;
      event[2]=false;
   }

   @Override
   public void mouseClicked(MouseEvent e) {
      event[4]=true;

      mouse_x=e.getX();
      mouse_y=e.getY();
   }

   @Override
   public void mouseDragged(MouseEvent e) {
      event[5]=true;

      mouse_x=e.getX();
      mouse_y=e.getY();
   }

   @Override
   public void mouseMoved(MouseEvent e) {
      event[6]=true;

      mouse_x=e.getX();
      mouse_y=e.getY();
   }
}
