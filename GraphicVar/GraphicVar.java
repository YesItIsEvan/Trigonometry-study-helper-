package GraphicVar;

import java.awt.*;


public class GraphicVar{

///////  Colors  ///////

   static ColorPalette GlobalPalette = ColorPalette.VIVIDMEMORY8;
   
   public enum ColorPalette {
      SEAFOAM8,WHITESCAPE,EXOPHOBIA,VIVIDMEMORY8
   }
   
   public static void setPalette(ColorPalette palette) {
      GlobalPalette = palette;
   }

   public static Color backgroundColor(){
      switch(GlobalPalette) {
         case VIVIDMEMORY8:
            return new Color(173,215,156);
         case SEAFOAM8:
         
         case WHITESCAPE:
            return new Color(165,53,81);
         case EXOPHOBIA:
         
         default:
            return new Color(173,215,156);
      }
   }

   public static Color edgesColor() {
      switch(GlobalPalette) {
         case VIVIDMEMORY8:
            return new Color(60,150,145);
         case SEAFOAM8:
         
         case WHITESCAPE:
            return new Color(95,115,123);
         case EXOPHOBIA:
         
         default:
            return new Color(60,150,145);
      }
   }
   
   public static Color title() {
      switch(GlobalPalette) {
         case VIVIDMEMORY8:
            return new Color(0,0,0);
         case SEAFOAM8:
         
         case WHITESCAPE:
            return new Color(31,35,46);
         case EXOPHOBIA:
         
         default:
            return new Color(0,0,0);
      }
   }

   public static Color titleShadow() {
      switch(GlobalPalette) {
         case VIVIDMEMORY8:
            return new Color(50,60,60);
         case SEAFOAM8:
         
         case WHITESCAPE:
            return new Color(0,0,0);
         case EXOPHOBIA:
         
         default:
            return new Color(50,60,60);
      }
   }

   public static Color flashcardColor() {
      switch(GlobalPalette) {
         case VIVIDMEMORY8:
            return new Color(247,214,155);
         case SEAFOAM8:
         
         case WHITESCAPE:
            return new Color(232,227,227);
         case EXOPHOBIA:
         
         default:
            return new Color(247,214,155);
      }
   }
   
   public static Color flashcardNextColor() {
      switch(GlobalPalette) {
         case VIVIDMEMORY8:
            return new Color(50,75,110);
         case SEAFOAM8:
         
         case WHITESCAPE:
            return new Color(162,179,178);
         case EXOPHOBIA:
         
         default:
            return new Color(50,75,110);
      }
   }

   public static Color flashcardBackColor() {
      switch(GlobalPalette) {
         case VIVIDMEMORY8:
            return new Color(210,70,70);
         case SEAFOAM8:
         
         case WHITESCAPE:
            return new Color(67,24,55);
         case EXOPHOBIA:
         
         default:
            return new Color(210,70,70);
      }
   }
   
///////  Fonts  ///////
   public static Font titleFont = new Font("Times New Roman",1,32);
   
   public static Font promptTitleFont = new Font("Times New Roman",1,19);
   
   public static Font promptFont = new Font("Times New Roman",-1,19);
   
   public static Font flashcardsFont = new Font("Times New Roman",1,35);
   
   public static Font flashcardsSquareFont = new Font("Times New Roman",1,25);

   public static Font flashcardsFlipFont = new Font("Times New Roman",1,21);

}