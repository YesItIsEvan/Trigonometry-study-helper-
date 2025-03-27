import javax.swing.JFrame;

public class Frame extends JFrame{

   Render render = new Render();
   
   Frame()
   {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.add(render);
      this.setSize(render.targetWindowSize);
      this.setTitle("Trigonometry Study Helper");
      this.setVisible(true);

      long period = 1000/(render.frameRate/2);
      long beginTime = System.currentTimeMillis();
      long currentTime;
      while(true){

         if(getWidth() < render.targetWindowSize.width && render.mouse.event[2])
            setSize(getWidth()+2,getHeight());
         if(getWidth() > render.targetWindowSize.width && render.mouse.event[2])
            setSize(getWidth()-2,getHeight());
         if(getHeight() < render.targetWindowSize.height && render.mouse.event[2])
            setSize(getWidth(),getHeight()+2);
         if(getHeight() > render.targetWindowSize.height && render.mouse.event[2])
            setSize(getWidth(),getHeight()-2);

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