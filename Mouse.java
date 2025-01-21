import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import javax.swing.JFrame;

public class Mouse implements MouseListener{
   
   int x;
   int y;
   boolean mcd;
   
   Mouse(){

   }

   public void mousePressed(MouseEvent e){
      
   }
   
   public void mouseReleased(MouseEvent e){
      
   }
   
   public void mouseEntered(MouseEvent e){
      
   }
   
   public void mouseExited(MouseEvent e){
      
   }
   
   public void mouseClicked(MouseEvent e){
      x=e.getX();
      y=e.getY();
      mcd = true;
   }
}
