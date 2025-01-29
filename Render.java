import Graphic.GraphicElement;
import Graphic.GraphicVar.ColorPalette;
import Graphic.GraphicVar;
import Graphic.GraphicElement;
import javax.swing.*;
import java.awt.*;
import java.lang.*;


public class Render extends JPanel implements Runnable {

   KeyBoard keyboard = new KeyBoard();
   Mouse mouse = new Mouse();

   Thread thread;
   int Mouse_x;
   int Mouse_y;
   boolean Mouse_Clicked = false;   
   boolean SettingsMenu = false;   
   boolean[] StudyOptions = new boolean[3];
   boolean[] IdentityFlashcards = new boolean[4];
   boolean[] TriangleFlashcards = new boolean[3];
   int[] fortyfiveRightTriangle = new int[2];
   int[] sixtyRightTriangle = new int[2];
   int[] allRightTriangle = new int[2];
   int[] RecipricalIdentities = new int[2];
   int[] QuotientIdentities = new int[2];
   int[] PythagoreanIdentities = new int[2];
   int[] AllIdentities = new int[2];
   ///////  SEAFOAM8,WHITESCAPE,EXOPHOBIA,VIVIDMEMORY8  ///////
   ColorPalette palette = ColorPalette.WHITESCAPE;

   public Render() {
      Start();
   }
   
   public void Start() {
      thread = new Thread(this);
      this.addKeyListener(keyboard);
      this.addMouseListener(mouse);
      thread.start();
   }
      
   public void paintComponent(Graphics g) {
      super.paintComponent(g);

      Graphics2D g2 = (Graphics2D)g;
      g2.setRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON));
      
      GraphicVar.setPalette(palette);
      
      GraphicElement.NonInteractables(g,getWidth(),getHeight());
      int j = -1;
      int k = -1;
      for(int i=0;i<StudyOptions.length;i++)
         if(StudyOptions[i])
            j = i;
      switch(j){
         case(0):
            for(int i=0;i<IdentityFlashcards.length;i++)
               if(IdentityFlashcards[i])
                  k = i;
            switch(k){
               case(0):
                  GraphicElement.RecipricalIdentitiesG(g,getWidth(),getHeight(),RecipricalIdentities);
                 break;
               case(1):
                  GraphicElement.QuotientIdentitiesG(g,getWidth(),getHeight(),QuotientIdentities);
                 break;
               case(2):
                  GraphicElement.PythagoreanIdentitiesG(g,getWidth(),getHeight(),PythagoreanIdentities);
                 break;
               case(3):
                  GraphicElement.AllIdentitiesG(g,getWidth(),getHeight(),AllIdentities);
                 break;
               default:
                  GraphicElement.IdentityFlashcardsG(g);
             }
           break;
         case(1):
            for(int i=0;i<TriangleFlashcards.length;i++)
               if(TriangleFlashcards[i])
                  k = i;
            switch(k){
               case(0):
                  GraphicElement.FortyFiveRightTriangleG(g,getWidth(),getHeight(),fortyfiveRightTriangle);
                 break;
               case(1):
                  GraphicElement.SixtyRightTriangleG(g,getWidth(),getHeight(),sixtyRightTriangle);
                 break;
               case(2):
                  GraphicElement.AllRightTriangleG(g,getWidth(),getHeight(),allRightTriangle);
                 break;
               default:
                  GraphicElement.TriangleFlashcardsG(g);
             }
           break;
         case(2):
            GraphicElement.SettingsMeny(g,getWidth(),getHeight());
            switch(palette){
               case ColorPalette.VIVIDMEMORY8:
                  GraphicElement.PaletteChoice(g,ColorPalette.VIVIDMEMORY8);
                 break;
               case ColorPalette.WHITESCAPE:
                  GraphicElement.PaletteChoice(g,ColorPalette.WHITESCAPE);
                 break;
               case ColorPalette.SEAFOAM8:
                  GraphicElement.PaletteChoice(g,ColorPalette.SEAFOAM8);
                 break;
             }
           break;
         default:
            GraphicElement.StudyOptionsPrompt(g,getHeight());
      }
   }
   
   public void run() {
      long period = 1000/120;
      long beginTime = System.currentTimeMillis();
      long currentTime;
      float deltaTime = 0;
      while(true) {
      
         Mouse_Clicked = mouse.mcd;
         
         StudyOptions[StudyOptions.length-1] = SettingsMenu;
         
         if(Mouse_Clicked){
         CheckMouse();
         }
                           
         repaint();
      
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
         deltaTime = (float) (currentTime - beginTime) / 1000;
         beginTime = currentTime;
      }
   }
   
   public void CheckMouse(){
   ////  Taking the x and y of the mouse click from the mouse listener  ////
      Mouse_x = mouse.x;
      Mouse_y = mouse.y;
      System.out.println(Mouse_x+","+Mouse_y);
   // Goes to another method //
      CheckBoxes(Mouse_x,Mouse_y);
      mouse.mcd = false;
   }

   ////  Checks if the mouse click was in the range of an option  ////
   public void CheckBoxes(int x,int y){
      ///  Tell the click boolean class the size of the window  ///
      ClickBooleans.WindowSize(getWidth(),getHeight());
      
      ///  Settings  ///
      if(ClickBooleans.OpenSettings(x,y,StudyOptions))
         SettingsMenu = true;
      else if(ClickBooleans.CloseSettings(x,y,StudyOptions))
         SettingsMenu = false;
      
      ///  Triangles  ///
      else if(ClickBooleans.TriangleFlashcardOptions(x,y,StudyOptions))
         TriangleFlashcardsL(true);
      ///  Triangles' Back  ///
      else if(ClickBooleans.ExitTriangleFlashcards(x,y,StudyOptions,TriangleFlashcards))
         TriangleFlashcardsL(false);
      ///  90,45,45  ///
      else if(ClickBooleans.TriangleFlashcardOption1(x,y,StudyOptions,TriangleFlashcards))
         FortyFiveTriangleRatiosL(true);
      else if(ClickBooleans.TriangleFlashcardOption1Flip(x,y,StudyOptions,TriangleFlashcards))
         FlipFortyFiveRatio();
      else if(ClickBooleans.ExitTriangleFlashcardOption1(x,y,StudyOptions,TriangleFlashcards))
         FortyFiveTriangleRatiosL(false);
      else if(ClickBooleans.TriangleFlashcardOption1Shuffle(x,y,StudyOptions,TriangleFlashcards))
         RandomFortyFiveTriangleRatios();
      ///  90,60,30  ///
      else if(ClickBooleans.TriangleFlashcardOption2(x,y,StudyOptions,TriangleFlashcards))
         SixtyTriangleRatiosL(true);
      else if(ClickBooleans.TriangleFlashcardOption2Flip(x,y,StudyOptions,TriangleFlashcards))
         FlipSixtyRatio();
      else if(ClickBooleans.ExitTriangleFlashcardOption2(x,y,StudyOptions,TriangleFlashcards))
         SixtyTriangleRatiosL(false);
      else if(ClickBooleans.TriangleFlashcardOption2Shuffle(x,y,StudyOptions,TriangleFlashcards))
         RandomSixtyTriangleRatios();
      ///  All Triangles  ///
      else if(ClickBooleans.TriangleFlashcardOption3(x,y,StudyOptions,TriangleFlashcards))
         AllTriangleRatiosL(true);
      else if(ClickBooleans.TriangleFlashcardOption3Flip(x,y,StudyOptions,TriangleFlashcards))
         FlipAllRatio();
      else if(ClickBooleans.ExitTriangleFlashcardOption3(x,y,StudyOptions,TriangleFlashcards))
         AllTriangleRatiosL(false);
      else if(ClickBooleans.TriangleFlashcardOption3Shuffle(x,y,StudyOptions,TriangleFlashcards))
         RandomTriangleRatios();
         
      ///  Identities  ///
      else if(ClickBooleans.IdentitiyFlashcardOptions(x,y,StudyOptions))
         IdentityFlashcardsL(true);
      ///  Identities' Back  ///
      else if(ClickBooleans.ExitIdentityFlashcards(x,y,StudyOptions,IdentityFlashcards))
         IdentityFlashcardsL(false);
      ///  Reciprical identities  ///
      else if(ClickBooleans.IdentityFlashcardOption1(x,y,StudyOptions,IdentityFlashcards))
         RecipricalIdentitiesL(true);
      else if(ClickBooleans.IdentityFlashcardOption1Flip(x,y,StudyOptions,IdentityFlashcards))
         FlipRecipricalIdentity();
      else if(ClickBooleans.ExitIdentityFlashcardOption1(x,y,StudyOptions,IdentityFlashcards))
         RecipricalIdentitiesL(false);
      else if(ClickBooleans.IdentityFlashcardOption1Shuffle(x,y,StudyOptions,IdentityFlashcards))
         RandomRecipricalIdentity();
      ///  Quotient identities  ///
      else if(ClickBooleans.IdentityFlashcardOption2(x,y,StudyOptions,IdentityFlashcards))
         QuotientIdentitiesL(true);
      else if(ClickBooleans.IdentityFlashcardOption2Flip(x,y,StudyOptions,IdentityFlashcards))
         FlipQuotientIdentity();
      else if(ClickBooleans.ExitIdentityFlashcardOption2(x,y,StudyOptions,IdentityFlashcards))
         QuotientIdentitiesL(false);
      else if(ClickBooleans.IdentityFlashcardOption2Shuffle(x,y,StudyOptions,IdentityFlashcards))
         RandomQuotientIdentity();
      ///  Pythagorean identities  ///
      else if(ClickBooleans.IdentityFlashcardOption3(x,y,StudyOptions,IdentityFlashcards))
         PythagoreanIdentitiesL(true);
      else if(ClickBooleans.IdentityFlashcardOption3Flip(x,y,StudyOptions,IdentityFlashcards))
         FlipPythagoreanIdentity();
      else if(ClickBooleans.ExitIdentityFlashcardOption3(x,y,StudyOptions,IdentityFlashcards))
         PythagoreanIdentitiesL(false);
      else if(ClickBooleans.IdentityFlashcardOption3Shuffle(x,y,StudyOptions,IdentityFlashcards))
         RandomPythagoreanIdentity();
      ///  All identities  ///
      else if(ClickBooleans.IdentityFlashcardOption4(x,y,StudyOptions,IdentityFlashcards))
         AllIdentitiesL(true);
      else if(ClickBooleans.IdentityFlashcardOption4Flip(x,y,StudyOptions,IdentityFlashcards))
         FlipAllIdentity();
      else if(ClickBooleans.ExitIdentityFlashcardOption4(x,y,StudyOptions,IdentityFlashcards))
         AllIdentitiesL(false);
      else if(ClickBooleans.IdentityFlashcardOption4Shuffle(x,y,StudyOptions,IdentityFlashcards))
         RandomIdentity();
   }
   
   ///////  Triangles  ///////
   // Triangle switch display //
   public void TriangleFlashcardsL(boolean show){
      StudyOptions[1] = show;
   }

   public void FortyFiveTriangleRatiosL(boolean show){
      TriangleFlashcards[0] = show;
      RandomFortyFiveTriangleRatios(); // chooses random 45,45,90 ratio :)
   }

   public void SixtyTriangleRatiosL(boolean show){
      TriangleFlashcards[1] = show;
      RandomSixtyTriangleRatios(); // chooses random 30,60,90 ratio :)
   }

   public void AllTriangleRatiosL(boolean show){
      TriangleFlashcards[2] = show;
      RandomTriangleRatios(); // chooses random ratio :)
   }
   
   // Triangle select random card //
   public void RandomFortyFiveTriangleRatios(){
      int i = random(1,3);
      int o = random(1,2);
      fortyfiveRightTriangle[0] = i;
      fortyfiveRightTriangle[1] = o;
      for(i=fortyfiveRightTriangle[0];i==fortyfiveRightTriangle[0];)
         i = random(1,3);
      fortyfiveRightTriangle[0] = i;
   }
   
   public void RandomSixtyTriangleRatios(){
      int i = random(1,6);
      int o = random(1,2);
      sixtyRightTriangle[0] = i;
      sixtyRightTriangle[1] = o;
      for(i=sixtyRightTriangle[0];i==sixtyRightTriangle[0];)
         i = random(1,6);
      sixtyRightTriangle[0] = i;
   }
   
   public void RandomTriangleRatios(){
      int i = random(1,9);
      int o = random(1,2);
      allRightTriangle[0] = i;
      allRightTriangle[1] = o;
      for(i=allRightTriangle[0];i==allRightTriangle[0];)
         i = random(1,9);
      allRightTriangle[0] = i;
   }
   
   // Triangle flip card //
   public void FlipFortyFiveRatio(){
      if(fortyfiveRightTriangle[1] == 2)
         fortyfiveRightTriangle[1] = 1;
      else if(fortyfiveRightTriangle[1] == 1)
         fortyfiveRightTriangle[1] = 2;
   }

   public void FlipSixtyRatio(){
      if(sixtyRightTriangle[1] == 2)
         sixtyRightTriangle[1] = 1;
      else if(sixtyRightTriangle[1] == 1)
         sixtyRightTriangle[1] = 2;
   }

   public void FlipAllRatio(){
      if(allRightTriangle[1] == 2)
         allRightTriangle[1] = 1;
      else if(allRightTriangle[1] == 1)
         allRightTriangle[1] = 2;
   }
   
   ///////  Identities  ///////
   // Identities switch display //
   public void IdentityFlashcardsL(boolean show){
      StudyOptions[0] = show;
   }
   
   public void RecipricalIdentitiesL(boolean show){
      IdentityFlashcards[0] = show;
      RandomRecipricalIdentity(); // chooses random reciprical identity :)
   }

   public void PythagoreanIdentitiesL(boolean show){
      IdentityFlashcards[2] = show;
      RandomPythagoreanIdentity(); // chooses random pythagorean identity :)
   }

   public void QuotientIdentitiesL(boolean show){
      IdentityFlashcards[1] = show;
      RandomQuotientIdentity(); // chooses random quotient identity :)
   }

   public void AllIdentitiesL(boolean show){
      IdentityFlashcards[3] = show;
      RandomIdentity(); // chooses random identity :)
   }
   
   // Identities select random card //
   public void RandomRecipricalIdentity(){
      int i = random(1,6);
      int o = random(1,2);
      RecipricalIdentities[0] = i;
      RecipricalIdentities[1] = o;
      for(i=RecipricalIdentities[0];i==RecipricalIdentities[0];)
         i = random(1,6);
      RecipricalIdentities[0] = i;
   }

   public void RandomPythagoreanIdentity(){
      int i = random(1,5);
      int o = random(1,2);
      PythagoreanIdentities[0] = i;
      PythagoreanIdentities[1] = o;
      for(i=PythagoreanIdentities[0];i==PythagoreanIdentities[0];)
         i = random(1,5);
      PythagoreanIdentities[0] = i;
   }

   public void RandomQuotientIdentity(){
      int i = random(1,2);
      int o = random(1,2);
      QuotientIdentities[0] = i;
      QuotientIdentities[1] = o;
      for(i=QuotientIdentities[0];i==QuotientIdentities[0];)
         i = random(1,2);
      QuotientIdentities[0] = i;
   }

   public void RandomIdentity(){
      int i = random(1,13);
      int o = random(1,2);
      AllIdentities[0] = i;
      AllIdentities[1] = o;
      for(i=AllIdentities[0];i==AllIdentities[0];)
         i = random(1,13);
      AllIdentities[0] = i;
   }
   
   // Identities flip card //
   public void FlipRecipricalIdentity(){
      if(RecipricalIdentities[1] == 2)
         RecipricalIdentities[1] = 1;
      else if(RecipricalIdentities[1] == 1)
         RecipricalIdentities[1] = 2;
   }

   public void FlipPythagoreanIdentity(){
      if(PythagoreanIdentities[1] == 2)
         PythagoreanIdentities[1] = 1;
      else if(PythagoreanIdentities[1] == 1)
         PythagoreanIdentities[1] = 2;
   }

   public void FlipQuotientIdentity(){
      if(QuotientIdentities[1] == 2)
         QuotientIdentities[1] = 1;
      else if(QuotientIdentities[1] == 1)
         QuotientIdentities[1] = 2;
   }

   public void FlipAllIdentity(){
      if(AllIdentities[1] == 2)
         AllIdentities[1] = 1;
      else if(AllIdentities[1] == 1)
         AllIdentities[1] = 2;
   }
   
   
   public static int random(int min, int max)
   {
      int range = max - min + 1;
      int number = (int) (range * Math.random() + min);
      return number;
   }
}