import javax.swing.JFrame;
import java.awt.*;
import java.awt.geom.Dimension2D;

public class Frame extends JFrame{

   Render render = new Render();
   double[] WindowDecimal = new double[]{render.targetWindowSize.width,render.targetWindowSize.height};
   
   Frame()
   {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.add(render);
      this.setSize(render.targetWindowSize);
      this.setTitle("Trigonometry Study Helper");
      this.setVisible(true);

      long period = 1000/(render.frameRate/3);
      long beginTime = System.currentTimeMillis();
      long currentTime;
      while(true){
         WindowDecimal = new double[]{WindowDecimal[0]-(0.03*(WindowDecimal[0]-render.targetWindowSize.width)),WindowDecimal[1]-(0.03*(WindowDecimal[1]-render.targetWindowSize.height))};
         setSize((int)Math.round(WindowDecimal[0]),(int)Math.round(WindowDecimal[1]));
         currentTime = System.currentTimeMillis();
      try
      {
         long sleepTime = period - (currentTime - beginTime);
         if(sleepTime > 0)
         {
            Thread.sleep(sleepTime);
         }

      } catch (InterruptedException ex) {}
      currentTime = System.currentTimeMillis();
      beginTime = currentTime;
   }

   }
}