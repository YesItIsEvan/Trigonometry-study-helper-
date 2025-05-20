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
   int frameRate = 60;
   Dimension targetWindowSize = new Dimension(700,500);
   int timer = 0;
   int Mouse_x;
   int Mouse_y;
   boolean Mouse_Clicked = false;

   boolean SettingsMenu = false;
   boolean[] StudyOptions = new boolean[3];
   boolean[] IdentityFlashcards = new boolean[5];
   boolean[] TriangleFlashcards = new boolean[4];
   int[] fortyfiveRightTriangle = new int[2];
   int[] sixtyRightTriangle = new int[2];
   int[] allRightTriangle = new int[2];
   int[] RecipricalIdentities = new int[2];
   int[] QuotientIdentities = new int[2];
   int[] PythagoreanIdentities = new int[2];
   int[] AllIdentities = new int[2];
   Rectangle[] identityItem = new Rectangle[13];
   Rectangle[] identityTarget = new Rectangle[identityItem.length];
   boolean[] showIdentityItemSet = new boolean[identityItem.length];
   int[] itemIdentitiesMatchingSeed = randomOrderSeed(identityItem.length);
   int[] targetIdentitiesMatchingSeed = randomOrderSeed(identityItem.length);
   Rectangle[] triangleItem = new Rectangle[13];
   Rectangle[] triangleTarget = new Rectangle[triangleItem.length];
   boolean[] showTriangleItemSet = new boolean[triangleItem.length];
   int[] itemTriangleMatchingSeed = randomOrderSeed(triangleItem.length);
   int[] targetTriangleMatchingSeed = randomOrderSeed(triangleItem.length);
   int draggingItem;
   boolean dragging = false;
   int offsetX, offsetY;


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
      this.addMouseMotionListener(mouse);
      thread.start();
   }
      
   public void paintComponent(Graphics g) {
      super.paintComponent(g);

      Graphics2D g2 = (Graphics2D)g;
      g2.setRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON));
      
      GraphicVar.setPalette(palette);
      if(mouse.event[m.mouse.exited])
         GraphicElement.Waiting(g, timer, getWidth(), getHeight());
      else {
         GraphicElement.Background(g,getWidth(),getHeight());
         int j = -1;
         int k = -1;
         for(int i=0;i<StudyOptions.length;i++)
            if(StudyOptions[i])
               j = i;
         switch(j) {
            case (0):
               for (int i = 0; i < IdentityFlashcards.length; i++)
                  if (IdentityFlashcards[i])
                     k = i;
               switch (k) {
                  case (0):
                     GraphicElement.RecipricalIdentitiesG(g, getWidth(), getHeight(), RecipricalIdentities);
                     break;
                  case (1):
                     GraphicElement.QuotientIdentitiesG(g, getWidth(), getHeight(), QuotientIdentities);
                     break;
                  case (2):
                     GraphicElement.PythagoreanIdentitiesG(g, getWidth(), getHeight(), PythagoreanIdentities);
                     break;
                  case (3):
                     GraphicElement.AllIdentitiesG(g, getWidth(), getHeight(), AllIdentities);
                     break;
                  case (4):
                     GraphicElement.IdentitiesMatching(g, getWidth(), getHeight(), identityItem, identityTarget, showIdentityItemSet,timer);
                     break;
                  default:
                     GraphicElement.IdentityFlashcardsG(g);
               }
               break;
            case (1):
               for (int i = 0; i < TriangleFlashcards.length; i++)
                  if (TriangleFlashcards[i])
                     k = i;
               switch (k) {
                  case (0):
                     GraphicElement.FortyFiveRightTriangleG(g, getWidth(), getHeight(), fortyfiveRightTriangle);
                     break;
                  case (1):
                     GraphicElement.SixtyRightTriangleG(g, getWidth(), getHeight(), sixtyRightTriangle);
                     break;
                  case (2):
                     GraphicElement.AllRightTriangleG(g, getWidth(), getHeight(), allRightTriangle);
                     break;
                  default:
                     GraphicElement.TriangleFlashcardsG(g);
               }
               break;
            case (2):
               GraphicElement.SettingsMeny(g, getWidth(), getHeight());
               switch (palette) {
                  case ColorPalette.VIVIDMEMORY8:
                     GraphicElement.PaletteChoice(g, ColorPalette.VIVIDMEMORY8);
                     break;
                  case ColorPalette.WHITESCAPE:
                     GraphicElement.PaletteChoice(g, ColorPalette.WHITESCAPE);
                     break;
                  case ColorPalette.SEAFOAM8:
                     GraphicElement.PaletteChoice(g, ColorPalette.SEAFOAM8);
                     break;
               }
               break;
            default:
               GraphicElement.StudyOptionsPrompt(g, getHeight());
         }
         GraphicElement.NonInteractables(g,getWidth(),getHeight());
      }
   }
   
   public void run() {
      long period = 1000/frameRate;
      long beginTime = System.currentTimeMillis();
      long currentTime;
       while(true) {
      
         Mouse_Clicked = mouse.event[m.mouse.clicked];
         
         StudyOptions[StudyOptions.length-1] = SettingsMenu;

         /*if(mouse.event[m.mouse.entered])
            System.out.println("("+mouse.mouse_x+","+mouse.mouse_y+")");
         else if(mouse.event[m.mouse.exited])
            System.out.println("mouse out of bounds");*/

         timer++;
         if(timer==frameRate*3)timer = 0;

         if(Mouse_Clicked){
         CheckMouse();
         }

         if(IdentityFlashcards[4]) {
            MatchingGame();
            for (int i = 0; i < identityTarget.length; i++) {
               if(targetIdentitiesMatchingSeed[i]<=6)
                  identityTarget[i] = new Rectangle(getWidth()-150, 100+(targetIdentitiesMatchingSeed[i]*80), 100, 60);  // Drop target
               if(targetIdentitiesMatchingSeed[i]>6)
                  identityTarget[i] = new Rectangle(getWidth()-270, 100+((targetIdentitiesMatchingSeed[i]-7)*80), 100, 60);  // Drop target
            }
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

   public void resetMatching(boolean HardReset){
      if(HardReset) {
         targetIdentitiesMatchingSeed = randomOrderSeed(identityItem.length);
         itemIdentitiesMatchingSeed = randomOrderSeed(identityItem.length);
      }
      for(int i = 0; i< identityItem.length; i++) {
         if(itemIdentitiesMatchingSeed[i]<=6)
            identityItem[i] = new Rectangle(50, 100+(itemIdentitiesMatchingSeed[i]*80), 100, 60);  // Draggable item
         if(itemIdentitiesMatchingSeed[i]>6)
            identityItem[i] = new Rectangle(170, 100+((itemIdentitiesMatchingSeed[i]-7)*80), 100, 60);  // Draggable item
         if(targetIdentitiesMatchingSeed[i]<=6)
            identityTarget[i] = new Rectangle(getWidth()-150, 100+(targetIdentitiesMatchingSeed[i]*80), 100, 60);  // Drop target
         if(targetIdentitiesMatchingSeed[i]>6)
            identityTarget[i] = new Rectangle(getWidth()-270, 100+((targetIdentitiesMatchingSeed[i]-7)*80), 100, 60);  // Drop target
         showIdentityItemSet[i] = true;
      }
   }

   public void MatchingGame() {
      if (mouse.event[m.mouse.released]) {
         dragging = false;
         if (identityTarget[draggingItem].intersects(identityItem[draggingItem])) {
            showIdentityItemSet[draggingItem]=false;
         } else {
            if(identityItem[draggingItem].x<=(50+(120*(itemIdentitiesMatchingSeed[draggingItem]/8)))&& identityItem[draggingItem].y<=(100+(80*(itemIdentitiesMatchingSeed[draggingItem]-(7*(itemIdentitiesMatchingSeed[draggingItem]/7))))))
               identityItem[draggingItem].setLocation((50+(120*(itemIdentitiesMatchingSeed[draggingItem]/7))) - ((int) Math.floor(0.97 * ((50.0+(120*(itemIdentitiesMatchingSeed[draggingItem]/7))) - identityItem[draggingItem].x))), (100+(80*(itemIdentitiesMatchingSeed[draggingItem]-(7*(itemIdentitiesMatchingSeed[draggingItem]/7))))) - ((int) Math.floor(0.97 * ((100+(80.0*(itemIdentitiesMatchingSeed[draggingItem]-(7*(itemIdentitiesMatchingSeed[draggingItem]/7))))) - identityItem[draggingItem].y))));
            else if(identityItem[draggingItem].x>=(50+(120*(itemIdentitiesMatchingSeed[draggingItem]/7)))&& identityItem[draggingItem].y>=(100+(80*(itemIdentitiesMatchingSeed[draggingItem]-(7*(itemIdentitiesMatchingSeed[draggingItem]/7))))))
               identityItem[draggingItem].setLocation((50+(120*(itemIdentitiesMatchingSeed[draggingItem]/7))) - ((int) Math.ceil(0.97 * ((50.0+(120*(itemIdentitiesMatchingSeed[draggingItem]/7))) - identityItem[draggingItem].x))), (100+(80*(itemIdentitiesMatchingSeed[draggingItem]-(7*(itemIdentitiesMatchingSeed[draggingItem]/7))))) - ((int) Math.ceil(0.97 * ((100+(80.0*(itemIdentitiesMatchingSeed[draggingItem]-(7*(itemIdentitiesMatchingSeed[draggingItem]/7))))) - identityItem[draggingItem].y))));
            else if(identityItem[draggingItem].x<=(50+(120*(itemIdentitiesMatchingSeed[draggingItem]/7)))&& identityItem[draggingItem].y>=(100+(80*(itemIdentitiesMatchingSeed[draggingItem]-(7*(itemIdentitiesMatchingSeed[draggingItem]/7))))))
               identityItem[draggingItem].setLocation((50+(120*(itemIdentitiesMatchingSeed[draggingItem]/7))) - ((int) Math.floor(0.97 * ((50.0+(120*(itemIdentitiesMatchingSeed[draggingItem]/7))) - identityItem[draggingItem].x))), (100+(80*(itemIdentitiesMatchingSeed[draggingItem]-(7*(itemIdentitiesMatchingSeed[draggingItem]/7))))) - ((int) Math.ceil(0.97 * ((100+(80.0*(itemIdentitiesMatchingSeed[draggingItem]-(7*(itemIdentitiesMatchingSeed[draggingItem]/7))))) - identityItem[draggingItem].y))));
            else if(identityItem[draggingItem].x>=(50+(120*(itemIdentitiesMatchingSeed[draggingItem]/7)))&& identityItem[draggingItem].y<=(100+(80*(itemIdentitiesMatchingSeed[draggingItem]-(7*(itemIdentitiesMatchingSeed[draggingItem]/7))))))
               identityItem[draggingItem].setLocation((50+(120*(itemIdentitiesMatchingSeed[draggingItem]/7))) - ((int) Math.ceil(0.97 * ((50.0+(120*(itemIdentitiesMatchingSeed[draggingItem]/7))) - identityItem[draggingItem].x))), (100+(80*(itemIdentitiesMatchingSeed[draggingItem]-(7*(itemIdentitiesMatchingSeed[draggingItem]/7))))) - ((int) Math.floor(0.97 * ((100+(80.0*(itemIdentitiesMatchingSeed[draggingItem]-(7*(itemIdentitiesMatchingSeed[draggingItem]/7))))) - identityItem[draggingItem].y))));
         }
      }

      if (mouse.event[m.mouse.dragged]) {
         if (dragging) {
            identityItem[draggingItem].setLocation(mouse.x - offsetX, mouse.y - offsetY);
         }
      }

      if (mouse.event[m.mouse.pressed]) {
         if(!dragging)
            for (int i = 0; i < identityItem.length; i++)
               if (identityItem[i].contains(mouse.position)&&showIdentityItemSet[i]) {
                  draggingItem = i;
                  dragging = true;
                  offsetX = mouse.x - identityItem[i].x;
                  offsetY = mouse.y - identityItem[i].y;
               }
      }
   }
   
   public void CheckMouse(){
   ////  Taking the x and y of the mouse click from the mouse listener  ////
      Mouse_x = mouse.x;
      Mouse_y = mouse.y;
      System.out.println(Mouse_x+","+Mouse_y);
   // Goes to another method //
      CheckBoxes(Mouse_x,Mouse_y);
      mouse.event[m.mouse.clicked] = false;
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
         if (ClickBooleans.StudyFortyFiveTriangleFlashcards(x, y, TriangleFlashcards))
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
         else if (ClickBooleans.FlipAllTriangleCard(x, y, TriangleFlashcards))
            FlipAllRatio();
         else if (ClickBooleans.ExitAllTriangleFlashcards(x, y, TriangleFlashcards))
            AllTriangleRatiosL(false);
         else if (ClickBooleans.NextAllTriangleCard(x, y, TriangleFlashcards))
            RandomTriangleRatios();

         /// Triangle Matching ///
         else if(ClickBooleans.PlayTriangleMatching(x, y, TriangleFlashcards))

      }
      ///  Identities  ///
      ///  Identities' Back  ///
      else if(ClickBooleans.IdentityFlashcards(StudyOptions)) {
         if (ClickBooleans.ExitIdentityFlashcards(x, y, IdentityFlashcards))
            IdentityFlashcardsL(false);

         ///  Reciprical identities  ///
         else if (ClickBooleans.StudyReciprocalIdentities(x, y, IdentityFlashcards))
            RecipricalIdentitiesL(true);
         else if (ClickBooleans.FlipReciprocalCard(x, y, IdentityFlashcards))
            FlipRecipricalIdentity();
         else if (ClickBooleans.ExitReciprocalFlashcards(x, y, IdentityFlashcards))
            RecipricalIdentitiesL(false);
         else if (ClickBooleans.NextReciprocalCard(x, y, IdentityFlashcards))
            RandomRecipricalIdentity();

         ///  Quotient identities  ///
         else if (ClickBooleans.StudyQuotientFlashcards(x, y, IdentityFlashcards))
            QuotientIdentitiesL(true);
         else if (ClickBooleans.FlipQuotientCard(x, y, IdentityFlashcards))
            FlipQuotientIdentity();
         else if (ClickBooleans.ExitQuotientFlashcards(x, y, IdentityFlashcards))
            QuotientIdentitiesL(false);
         else if (ClickBooleans.NextQuotientCard(x, y, IdentityFlashcards))
            RandomQuotientIdentity();

         ///  Pythagorean identities  ///
         else if (ClickBooleans.StudyPythagoreanFlashcards(x, y, IdentityFlashcards))
            PythagoreanIdentitiesL(true);
         else if (ClickBooleans.FlipPythagoreanCard(x, y, IdentityFlashcards))
            FlipPythagoreanIdentity();
         else if (ClickBooleans.ExitPythagoreanFlashcards(x, y, IdentityFlashcards))
            PythagoreanIdentitiesL(false);
         else if (ClickBooleans.NextPythagoreanCard(x, y, IdentityFlashcards))
            RandomPythagoreanIdentity();

         ///  All identities  ///
         else if (ClickBooleans.StudyAllIdentityFlashcards(x, y, IdentityFlashcards))
            AllIdentitiesL(true);
         else if (ClickBooleans.FlipAllIdentityCard(x, y, IdentityFlashcards))
            FlipAllIdentity();
         else if (ClickBooleans.ExitAllIdentityFlashcards(x, y, IdentityFlashcards))
            AllIdentitiesL(false);
         else if (ClickBooleans.NextAllIdentityCard(x, y, IdentityFlashcards))
            RandomIdentity();

         /// Matching ///
         else if(ClickBooleans.PlayIdentityMatching(x, y, IdentityFlashcards))
            IdentityMatchingL(true);
         else if(ClickBooleans.ReshuffleIdentityMatching(x, y, IdentityFlashcards))
            resetMatching(true);
         else if(ClickBooleans.ExitIdentityMatching(x, y, IdentityFlashcards))
            IdentityMatchingL(false);

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

   public void TriangleMatchingL(boolean show){
      TriangleFlashcards[3] = show;
      resetMatching(true);
      if(show)
         SetRenderSize(1000,786);
      else
         SetRenderSize(700,500);
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

   public void IdentityMatchingL(boolean show){
      IdentityFlashcards[4] = show;
      resetMatching(true);
      if(show)
         SetRenderSize(1000,786);
      else
         SetRenderSize(700,500);
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
   public enum m {
      mouse(0,1,2,3,4,5,6);

      public final int pressed;
      public final int released;
      public final int entered;
      public final int exited;
      public final int clicked;
      public final int dragged;
      public final int moved;

       m(int pressed, int released, int entered, int exited, int clicked, int dragged, int moved) {
           this.pressed = pressed;
           this.released = released;
           this.entered = entered;
           this.exited = exited;
           this.clicked = clicked;
           this.dragged = dragged;
           this.moved = moved;
       }
   }

   public static int[] randomOrderSeed(int length){
      int[] seed = new int[length] ;
      for(int i=0;i<length;i++)
         seed[i] = length;
      for(int i=0;i<length;i++) {
         seed[i] = random(0, length - 1);
            while (numberRepeats(i, seed))
               seed[i] = random(0, length - 1);
         }
      return seed;
   }

   public static boolean numberRepeats(int initial,int[] array){
      int a = 0;
      for(int i=0;i<array.length;i++)
         if(array[initial]==array[i])
            a++;
      if(a>=2)
         return true;
      else
         return false;
   }

   public void SetRenderSize(int width, int height){
      setSize(new Dimension(width,height));
      targetWindowSize = new Dimension(width,height);
   }
   
   public static int random(int min, int max)
   {
      int range = max - min + 1;
      return (int) (range * Math.random() + min);
   }
}