import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class Frame extends JFrame{

   Render render = new Render();
   
   Frame()
   {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.add(render);
      this.setSize(render.windowSize);
      this.setTitle("Trigonometry Study Helper");
      this.setVisible(true);

      long period = 1000/render.frameRate;
      long beginTime = System.currentTimeMillis();
      long currentTime;
      while(true){

         if(getWidth() < render.windowSize.width && render.mouse.event[2])
            setSize(getWidth()+1,getHeight());
         if(getWidth() > render.windowSize.width && render.mouse.event[2])
            setSize(getWidth()-1,getHeight());
         if(getHeight() < render.windowSize.height && render.mouse.event[2])
            setSize(getWidth(),getHeight()+1);
         if(getHeight() > render.windowSize.height && render.mouse.event[2])
            setSize(getWidth(),getHeight()-1);

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