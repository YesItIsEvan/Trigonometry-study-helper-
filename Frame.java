import javax.swing.*;
import javax.swing.JFrame;

public class Frame extends JFrame{

   Render render = new Render();
   
   Frame()
   {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.add(render);
      this.setSize(700,500);
      this.setTitle("Trigonometry Study Helper");
      this.setVisible(true);
   }
}