import Graphic.GraphicElement;
import Graphic.GraphicVar.ColorPalette;
import Graphic.GraphicVar;
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
   ColorPalette[] paletteWheel = {ColorPalette.VIVIDMEMORY8,ColorPalette.WHITESCAPE,ColorPalette.SEAFOAM8};
   ///////  SEAFOAM8,WHITESCAPE,EXOPHOBIA,VIVIDMEMORY8  ///////
   ColorPalette palette = ColorPalette.VIVIDMEMORY8;
   int palette_int = 0;

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
       while(true) {
      
         Mouse_Clicked = mouse.mcd;
         
         StudyOptions[StudyOptions.length-1] = SettingsMenu;
         
         if(Mouse_Clicked){
         CheckMouse();
         }

         palette = paletteWheel[palette_int];
                           
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
      
      ///  Home  ///
      if(ClickBooleans.Home(StudyOptions)) {
         if (ClickBooleans.OpenSettings(x, y))
            SettingsMenu = true;
         else if (ClickBooleans.TriangleFlashcards(x, y))
            TriangleFlashcardsL(true);
         else if (ClickBooleans.IdentityFlashcards(x, y))
            IdentityFlashcardsL(true);
      }
      ///   Settings  ///
      else if(ClickBooleans.Settings(StudyOptions)) {
         if (ClickBooleans.SwitchThemeRight(x, y))
            SwitchPaletteWheel(dir.Right);
         else if (ClickBooleans.SwitchThemeLeft(x, y))
            SwitchPaletteWheel(dir.Left);
         else if (ClickBooleans.CloseSettings(x, y))
            SettingsMenu = false;
      }
      ///   Triangles  ///
      else if(ClickBooleans.TriangleFlashcards(StudyOptions)) {
         if (ClickBooleans.ExitTriangleFlashcards(x, y, TriangleFlashcards))
            TriangleFlashcardsL(false);

         ///  90,45,45  ///
         else if (ClickBooleans.StudyFortyFiveTriangleFlashcards(x, y, TriangleFlashcards))
            FortyFiveTriangleRatiosL(true);
         else if (ClickBooleans.FlipFortyFiveCard(x, y, TriangleFlashcards))
            FlipFortyFiveRatio();
         else if (ClickBooleans.ExitFortyFiveFlashcards(x, y, TriangleFlashcards))
            FortyFiveTriangleRatiosL(false);
         else if (ClickBooleans.NextFortyFiveCard(x, y, TriangleFlashcards))
            RandomFortyFiveTriangleRatios();

         ///  90,60,30  ///
         else if (ClickBooleans.StudySixtyTriangleFlashcards(x, y, TriangleFlashcards))
            SixtyTriangleRatiosL(true);
         else if (ClickBooleans.FlipSixtyCard(x, y, TriangleFlashcards))
            FlipSixtyRatio();
         else if (ClickBooleans.ExitSixtyFlashcards(x, y, TriangleFlashcards))
            SixtyTriangleRatiosL(false);
         else if (ClickBooleans.NextSixtyCard(x, y, TriangleFlashcards))
            RandomSixtyTriangleRatios();

         ///  All Triangles  ///
         else if (ClickBooleans.StudyAllTriangleFlashcards(x, y, TriangleFlashcards))
            AllTriangleRatiosL(true);
         else if (ClickBooleans.FlipAllCard(x, y, TriangleFlashcards))
            FlipAllRatio();
         else if (ClickBooleans.ExitAllFlashcards(x, y, TriangleFlashcards))
            AllTriangleRatiosL(false);
         else if (ClickBooleans.NextAllCard(x, y, TriangleFlashcards))
            RandomTriangleRatios();
      }
      ///  Identities  ///
      ///  Identities' Back  ///
      if(ClickBooleans.IdentityFlashcards(StudyOptions)) {
         if (ClickBooleans.ExitIdentityFlashcards(x, y, IdentityFlashcards))
            IdentityFlashcardsL(false);

         ///  Reciprical identities  ///
         else if (ClickBooleans.IdentityFlashcardOption1(x, y, IdentityFlashcards))
            RecipricalIdentitiesL(true);
         else if (ClickBooleans.IdentityFlashcardOption1Flip(x, y, IdentityFlashcards))
            FlipRecipricalIdentity();
         else if (ClickBooleans.ExitIdentityFlashcardOption1(x, y, IdentityFlashcards))
            RecipricalIdentitiesL(false);
         else if (ClickBooleans.IdentityFlashcardOption1Shuffle(x, y, IdentityFlashcards))
            RandomRecipricalIdentity();

         ///  Quotient identities  ///
         else if (ClickBooleans.IdentityFlashcardOption2(x, y, IdentityFlashcards))
            QuotientIdentitiesL(true);
         else if (ClickBooleans.IdentityFlashcardOption2Flip(x, y, IdentityFlashcards))
            FlipQuotientIdentity();
         else if (ClickBooleans.ExitIdentityFlashcardOption2(x, y, IdentityFlashcards))
            QuotientIdentitiesL(false);
         else if (ClickBooleans.IdentityFlashcardOption2Shuffle(x, y, IdentityFlashcards))
            RandomQuotientIdentity();

         ///  Pythagorean identities  ///
         else if (ClickBooleans.IdentityFlashcardOption3(x, y, IdentityFlashcards))
            PythagoreanIdentitiesL(true);
         else if (ClickBooleans.IdentityFlashcardOption3Flip(x, y, IdentityFlashcards))
            FlipPythagoreanIdentity();
         else if (ClickBooleans.ExitIdentityFlashcardOption3(x, y, IdentityFlashcards))
            PythagoreanIdentitiesL(false);
         else if (ClickBooleans.IdentityFlashcardOption3Shuffle(x, y, IdentityFlashcards))
            RandomPythagoreanIdentity();

         ///  All identities  ///
         else if (ClickBooleans.IdentityFlashcardOption4(x, y, IdentityFlashcards))
            AllIdentitiesL(true);
         else if (ClickBooleans.IdentityFlashcardOption4Flip(x, y, IdentityFlashcards))
            FlipAllIdentity();
         else if (ClickBooleans.ExitIdentityFlashcardOption4(x, y, IdentityFlashcards))
            AllIdentitiesL(false);
         else if (ClickBooleans.IdentityFlashcardOption4Shuffle(x, y, IdentityFlashcards))
            RandomIdentity();
      }
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
      RandomRecipricalIdentity(); // chooses random reciprocal identity :)
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

   public enum dir {
      Right,Left
   }

   public void SwitchPaletteWheel(dir rot){
      switch(rot){
         case Right:
            palette_int++;
            if(palette_int==paletteWheel.length)
               palette_int = 0;
           break;
         case Left:
            palette_int--;
            if(palette_int<0)
               palette_int = paletteWheel.length-1;
           break;
      }
   }
   
   public static int random(int min, int max)
   {
      int range = max - min + 1;
      return (int) (range * Math.random() + min);
   }
}