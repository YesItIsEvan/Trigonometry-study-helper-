package Graphic;

import java.awt.*;
import Graphic.GraphicVar.ColorPalette;

public class GraphicElement{

   private static void FlashCard(Graphics g,int FrameWidth,int FrameHeight){
   /////// Flash card graphic ///////
      g.setColor(GraphicVar.flashcardColor());
      g.fillRect((FrameWidth/2)-170,(FrameHeight/2)-55,300,150);
      g.setColor(Color.black);
      g.drawRect((FrameWidth/2)-170,(FrameHeight/2)-55,300,150);
      g.setColor(GraphicVar.flashcardColor());
      g.fillRect((FrameWidth/2)-160,(FrameHeight/2)-45,300,150);
      g.setColor(Color.black);
      g.drawRect((FrameWidth/2)-160,(FrameHeight/2)-45,300,150);
      g.setColor(GraphicVar.flashcardColor());
      g.fillRect((FrameWidth/2)-150,(FrameHeight/2)-35,300,150);
      g.setColor(Color.black);
      g.drawLine((FrameWidth/2)+90,(FrameHeight/2)+115,(FrameWidth/2)+150,(FrameHeight/2)+85);
      g.setFont(GraphicVar.flashcardsFlipFont);
      g.drawString("flip",(FrameWidth/2)+120,(FrameHeight/2)+115);
      g.drawRect((FrameWidth/2)-150,(FrameHeight/2)-35,300,150);
   }

   public static void FortyFiveRightTriangleG(Graphics g,int FrameWidth,int FrameHeight,int[] RatioSwitch){
       
   // Flash card graphic //
      FlashCard(g,FrameWidth,FrameHeight);
      
   /////// Draw other UI ///////
      g.setFont(GraphicVar.titleFont);
      g.setColor(GraphicVar.titleShadow());
      g.drawString("Next",(FrameWidth/2)+153,(FrameHeight/2)+92);
      g.drawString("Back",(FrameWidth/2)-252,(FrameHeight/2)+92);
      g.setColor(GraphicVar.flashcardNextColor());
      g.drawString("Next",(FrameWidth/2)+155,(FrameHeight/2)+90);
      g.setColor(GraphicVar.flashcardBackColor());
      g.drawString("Back",(FrameWidth/2)-250,(FrameHeight/2)+90);
      g.setFont(GraphicVar.flashcardsFont);
      
   /////// Draw out a random identity ///////      
      g.setColor(Color.black);
      switch(RatioSwitch[0]){ 
         case(1):
            switch(RatioSwitch[1]){
               case(1):
                  g.drawString("sin(45),cos(45)",(FrameWidth/2)-105,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("√2",(FrameWidth/2)-28,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-50,(FrameHeight/2)+39,100,2);
                  g.drawString("2",(FrameWidth/2)-15,(FrameHeight/2)+80);
                 break;
            }
           break;
         case(2):
            switch(RatioSwitch[1]){
               case(1):
                  g.drawString("csc(45),sec(45)",(FrameWidth/2)-110,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("√2",(FrameWidth/2)-28,(FrameHeight/2)+45);
                 break;
            }
           break;
         case(3):
            switch(RatioSwitch[1]){
               case(1):
                  g.drawString("tan(45),cot(45)",(FrameWidth/2)-100,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("1",(FrameWidth/2)-15,(FrameHeight/2)+45);
                 break;
            }
      }
   }

   public static void SixtyRightTriangleG(Graphics g,int FrameWidth,int FrameHeight,int[] RatioSwitch){
       
   // Flash card graphic //
      FlashCard(g,FrameWidth,FrameHeight);
      
   /////// Draw other UI ///////
      g.setFont(GraphicVar.titleFont);
      g.setColor(GraphicVar.titleShadow());
      g.drawString("Next",(FrameWidth/2)+153,(FrameHeight/2)+92);
      g.drawString("Back",(FrameWidth/2)-252,(FrameHeight/2)+92);
      g.setColor(GraphicVar.flashcardNextColor());
      g.drawString("Next",(FrameWidth/2)+155,(FrameHeight/2)+90);
      g.setColor(GraphicVar.flashcardBackColor());
      g.drawString("Back",(FrameWidth/2)-250,(FrameHeight/2)+90);
      g.setFont(GraphicVar.flashcardsFont);
      
   /////// Draw out a random ratio ///////      
      g.setColor(Color.black);
      switch(RatioSwitch[0]){ 
         case(1):
            switch(RatioSwitch[1]){
               case(1):
                  g.drawString("sin(30),cos(60)",(FrameWidth/2)-105,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("1",(FrameWidth/2)-15,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-50,(FrameHeight/2)+39,100,2);
                  g.drawString("2",(FrameWidth/2)-15,(FrameHeight/2)+80);
                 break;
            }
           break;
         case(2):
            switch(RatioSwitch[1]){
               case(1):
                  g.drawString("sin(60),cos(30)",(FrameWidth/2)-105,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("√3",(FrameWidth/2)-28,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-50,(FrameHeight/2)+39,100,2);
                  g.drawString("2",(FrameWidth/2)-15,(FrameHeight/2)+80);
                 break;
            }
           break;
         case(3):
            switch(RatioSwitch[1]){
               case(1):
                  g.drawString("tan(30),cot(60)",(FrameWidth/2)-100,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("√3",(FrameWidth/2)-28,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-50,(FrameHeight/2)+39,100,2);
                  g.drawString("3",(FrameWidth/2)-15,(FrameHeight/2)+80);
                 break;
            }
           break;
         case(4):
            switch(RatioSwitch[1]){
               case(1):
                  g.drawString("csc(60),sec(30)",(FrameWidth/2)-110,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("2√3",(FrameWidth/2)-38,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-50,(FrameHeight/2)+39,100,2);
                  g.drawString("3",(FrameWidth/2)-15,(FrameHeight/2)+80);
                 break;
            }
           break;
         case(5):
            switch(RatioSwitch[1]){
               case(1):
                  g.drawString("csc(30),sec(60)",(FrameWidth/2)-110,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("2",(FrameWidth/2)-15,(FrameHeight/2)+45);
                 break;
            }
           break;
         case(6):
            switch(RatioSwitch[1]){
               case(1):
                  g.drawString("cot(30),tan(60)",(FrameWidth/2)-100,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("√3",(FrameWidth/2)-28,(FrameHeight/2)+45);
                 break;
            }
      }
   }

   public static void AllRightTriangleG(Graphics g,int FrameWidth,int FrameHeight,int[] RatioSwitch){
       
   // Flash card graphic //
      FlashCard(g,FrameWidth,FrameHeight);
      
   /////// Draw other UI ///////
      g.setFont(GraphicVar.titleFont);
      g.setColor(GraphicVar.titleShadow());
      g.drawString("Next",(FrameWidth/2)+153,(FrameHeight/2)+92);
      g.drawString("Back",(FrameWidth/2)-252,(FrameHeight/2)+92);
      g.setColor(GraphicVar.flashcardNextColor());
      g.drawString("Next",(FrameWidth/2)+155,(FrameHeight/2)+90);
      g.setColor(GraphicVar.flashcardBackColor());
      g.drawString("Back",(FrameWidth/2)-250,(FrameHeight/2)+90);
      g.setFont(GraphicVar.flashcardsFont);
      
   /////// Draw out a random ratio ///////      
      g.setColor(Color.black);
      switch(RatioSwitch[0]){ 
         case(1):
            switch(RatioSwitch[1]){
               case(1):
                  g.drawString("sin(30),cos(60)",(FrameWidth/2)-105,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("1",(FrameWidth/2)-15,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-50,(FrameHeight/2)+39,100,2);
                  g.drawString("2",(FrameWidth/2)-15,(FrameHeight/2)+80);
                 break;
            }
           break;
         case(2):
            switch(RatioSwitch[1]){
               case(1):
                  g.drawString("sin(60),cos(30)",(FrameWidth/2)-105,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("√3",(FrameWidth/2)-28,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-50,(FrameHeight/2)+39,100,2);
                  g.drawString("2",(FrameWidth/2)-15,(FrameHeight/2)+80);
                 break;
            }
           break;
         case(3):
            switch(RatioSwitch[1]){
               case(1):
                  g.drawString("tan(30),cot(60)",(FrameWidth/2)-100,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("√3",(FrameWidth/2)-28,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-50,(FrameHeight/2)+39,100,2);
                  g.drawString("3",(FrameWidth/2)-15,(FrameHeight/2)+80);
                 break;
            }
           break;
         case(4):
            switch(RatioSwitch[1]){
               case(1):
                  g.drawString("csc(60),sec(30)",(FrameWidth/2)-110,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("2√3",(FrameWidth/2)-38,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-50,(FrameHeight/2)+39,100,2);
                  g.drawString("3",(FrameWidth/2)-15,(FrameHeight/2)+80);
                 break;
            }
           break;
         case(5):
            switch(RatioSwitch[1]){
               case(1):
                  g.drawString("csc(30),sec(60)",(FrameWidth/2)-110,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("2",(FrameWidth/2)-15,(FrameHeight/2)+45);
                 break;
            }
           break;
         case(6):
            switch(RatioSwitch[1]){
               case(1):
                  g.drawString("cot(30),tan(60)",(FrameWidth/2)-100,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("√3",(FrameWidth/2)-28,(FrameHeight/2)+45);
                 break;
            }
           break;
         case(7):
            switch(RatioSwitch[1]){
               case(1):
                  g.drawString("sin(45),cos(45)",(FrameWidth/2)-105,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("√2",(FrameWidth/2)-28,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-50,(FrameHeight/2)+39,100,2);
                  g.drawString("2",(FrameWidth/2)-15,(FrameHeight/2)+80);
                 break;
            }
           break;
         case(8):
            switch(RatioSwitch[1]){
               case(1):
                  g.drawString("csc(45),sec(45)",(FrameWidth/2)-110,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("√2",(FrameWidth/2)-28,(FrameHeight/2)+45);
                 break;
            }
           break;
         case(9):
            switch(RatioSwitch[1]){
               case(1):
                  g.drawString("tan(45),cot(45)",(FrameWidth/2)-100,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("1",(FrameWidth/2)-15,(FrameHeight/2)+45);
                 break;
            }
      }
   }

   public static void RecipricalIdentitiesG(Graphics g,int FrameWidth,int FrameHeight,int[] IdentitySwitch){
       
   // Flash card graphic //
      FlashCard(g,FrameWidth,FrameHeight);
      
   /////// Draw other UI ///////
      g.setFont(GraphicVar.titleFont);
      g.setColor(GraphicVar.titleShadow());
      g.drawString("Next",(FrameWidth/2)+153,(FrameHeight/2)+92);
      g.drawString("Back",(FrameWidth/2)-252,(FrameHeight/2)+92);
      g.setColor(GraphicVar.flashcardNextColor());
      g.drawString("Next",(FrameWidth/2)+155,(FrameHeight/2)+90);
      g.setColor(GraphicVar.flashcardBackColor());
      g.drawString("Back",(FrameWidth/2)-250,(FrameHeight/2)+90);
      g.setFont(GraphicVar.flashcardsFont);
      
   /////// Draw out a random identity ///////      
      g.setColor(Color.black);
      switch(IdentitySwitch[0]){ 
         case(1):
            switch(IdentitySwitch[1]){
               case(1):
                  g.drawString("sin(θ)",(FrameWidth/2)-50,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("1",(FrameWidth/2)-15,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-70,(FrameHeight/2)+39,140,2);
                  g.drawString("csc(θ)",(FrameWidth/2)-40,(FrameHeight/2)+80);
            }
           break;
         case(2):
            switch(IdentitySwitch[1]){
               case(1):
                  g.drawString("cos(θ)",(FrameWidth/2)-50,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("1",(FrameWidth/2)-15,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-70,(FrameHeight/2)+39,140,2);
                  g.drawString("sec(θ)",(FrameWidth/2)-40,(FrameHeight/2)+80);
            }
           break;
         case(3):
            switch(IdentitySwitch[1]){
               case(1):
                  g.drawString("tan(θ)",(FrameWidth/2)-50,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("1",(FrameWidth/2)-15,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-70,(FrameHeight/2)+39,140,2);
                  g.drawString("cot(θ)",(FrameWidth/2)-40,(FrameHeight/2)+80);
            }
           break;
         case(4):
            switch(IdentitySwitch[1]){
               case(1):
                  g.drawString("csc(θ)",(FrameWidth/2)-50,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("1",(FrameWidth/2)-15,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-70,(FrameHeight/2)+39,140,2);
                  g.drawString("sin(θ)",(FrameWidth/2)-40,(FrameHeight/2)+80);
            }
           break;
         case(5):
            switch(IdentitySwitch[1]){
               case(1):
                  g.drawString("sec(θ)",(FrameWidth/2)-50,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("1",(FrameWidth/2)-15,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-70,(FrameHeight/2)+39,140,2);
                  g.drawString("cos(θ)",(FrameWidth/2)-40,(FrameHeight/2)+80);
            }
           break;
         case(6):
            switch(IdentitySwitch[1]){
               case(1):
                  g.drawString("cot(θ)",(FrameWidth/2)-50,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("1",(FrameWidth/2)-15,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-70,(FrameHeight/2)+39,140,2);
                  g.drawString("tan(θ)",(FrameWidth/2)-40,(FrameHeight/2)+80);
            }
      }
   }
   
   public static void PythagoreanIdentitiesG(Graphics g,int FrameWidth,int FrameHeight,int[] IdentitySwitch){
      
   // Flash card graphic //
      FlashCard(g,FrameWidth,FrameHeight);
      
   /////// Draw other UI ///////
      g.setFont(GraphicVar.titleFont);
      g.setColor(GraphicVar.titleShadow());
      g.drawString("Next",(FrameWidth/2)+153,(FrameHeight/2)+92);
      g.drawString("Back",(FrameWidth/2)-252,(FrameHeight/2)+92);
      g.setColor(GraphicVar.flashcardNextColor());
      g.drawString("Next",(FrameWidth/2)+155,(FrameHeight/2)+90);
      g.setColor(GraphicVar.flashcardBackColor());
      g.drawString("Back",(FrameWidth/2)-250,(FrameHeight/2)+90);
      g.setFont(GraphicVar.flashcardsFont);
      
   /////// Draw out a random identity ///////  
      g.setColor(Color.black);
      switch(IdentitySwitch[0]){ 
         case(1):
            switch(IdentitySwitch[1]){
               case(1):
                  g.setFont(GraphicVar.flashcardsSquareFont);
                  g.drawString("2                  2",(FrameWidth/2)-20,(FrameHeight/2)+25);
                  g.setFont(GraphicVar.flashcardsFont);
                  g.drawString("sin(θ) +cos(θ)",(FrameWidth/2)-100,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.setFont(GraphicVar.flashcardsFlipFont);
                  g.drawString("(hint: is the sum of two functions that are squared)",(FrameWidth/2)-200,(FrameHeight/2)+150);
                  g.setFont(GraphicVar.flashcardsFont);
                  g.drawString("1",(FrameWidth/2)-5,(FrameHeight/2)+45);
            }
           break;
         case(2):
            switch(IdentitySwitch[1]){
               case(1):
                  g.setFont(GraphicVar.flashcardsSquareFont);
                  g.drawString("2",(FrameWidth/2)+25,(FrameHeight/2)+25);
                  g.setFont(GraphicVar.flashcardsFont);
                  g.drawString("tan(θ) +1",(FrameWidth/2)-60,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.setFont(GraphicVar.flashcardsSquareFont);
                  g.drawString("2",(FrameWidth/2)+35,(FrameHeight/2)+25);
                  g.setFont(GraphicVar.flashcardsFont);
                  g.drawString("sec(θ)",(FrameWidth/2)-50,(FrameHeight/2)+45);
            }
           break;
         case(3):
            switch(IdentitySwitch[1]){
               case(1):
                  g.setFont(GraphicVar.flashcardsSquareFont);
                  g.drawString("2",(FrameWidth/2)+40,(FrameHeight/2)+25);
                  g.setFont(GraphicVar.flashcardsFont);
                  g.drawString("1+cot(θ)",(FrameWidth/2)-80,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.setFont(GraphicVar.flashcardsSquareFont);
                  g.drawString("2",(FrameWidth/2)+35,(FrameHeight/2)+25);
                  g.setFont(GraphicVar.flashcardsFont);
                  g.drawString("csc(θ)",(FrameWidth/2)-50,(FrameHeight/2)+45);
            }
           break;
         case(4):
            switch(IdentitySwitch[1]){
               case(1):
                  g.setFont(GraphicVar.flashcardsSquareFont);
                  g.drawString("2",(FrameWidth/2)-40,(FrameHeight/2)+5);
                  g.drawString("2",(FrameWidth/2)-35,(FrameHeight/2)+60);
                  g.drawString("2",(FrameWidth/2)+115,(FrameHeight/2)+5);
                  g.drawString("2",(FrameWidth/2)+115,(FrameHeight/2)+60);
                  g.setFont(GraphicVar.flashcardsFont);
                  g.drawString("sin(θ)",(FrameWidth/2)-120,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-125,(FrameHeight/2)+39,110,2);
                  g.drawString("cos(θ)",(FrameWidth/2)-120,(FrameHeight/2)+80);
                  g.drawString("+",(FrameWidth/2)-8,(FrameHeight/2)+50);
                  g.drawString("cos(θ)",(FrameWidth/2)+30,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)+15,(FrameHeight/2)+39,110,2);
                  g.drawString("cos(θ)",(FrameWidth/2)+30,(FrameHeight/2)+80);
                 break;
               case(2):
                  g.setFont(GraphicVar.flashcardsSquareFont);
                  g.drawString("2",(FrameWidth/2)+45,(FrameHeight/2)+60);
                  g.setFont(GraphicVar.flashcardsFont);
                  g.drawString("1",(FrameWidth/2)-15,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-70,(FrameHeight/2)+39,140,2);
                  g.drawString("cos(θ)",(FrameWidth/2)-40,(FrameHeight/2)+80);
            }
           break;
         case(5):
            switch(IdentitySwitch[1]){
               case(1):
                  g.setFont(GraphicVar.flashcardsSquareFont);
                  g.drawString("2",(FrameWidth/2)-40,(FrameHeight/2)+5);
                  g.drawString("2",(FrameWidth/2)-40,(FrameHeight/2)+60);
                  g.drawString("2",(FrameWidth/2)+115,(FrameHeight/2)+5);
                  g.drawString("2",(FrameWidth/2)+110,(FrameHeight/2)+60);
                  g.setFont(GraphicVar.flashcardsFont);
                  g.drawString("sin(θ)",(FrameWidth/2)-120,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-125,(FrameHeight/2)+39,110,2);
                  g.drawString("sin(θ)",(FrameWidth/2)-120,(FrameHeight/2)+80);
                  g.drawString("+",(FrameWidth/2)-8,(FrameHeight/2)+50);
                  g.drawString("cos(θ)",(FrameWidth/2)+30,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)+15,(FrameHeight/2)+39,110,2);
                  g.drawString("sin(θ)",(FrameWidth/2)+30,(FrameHeight/2)+80);
                 break;
               case(2):
                  g.setFont(GraphicVar.flashcardsSquareFont);
                  g.drawString("2",(FrameWidth/2)+40,(FrameHeight/2)+60);
                  g.setFont(GraphicVar.flashcardsFont);
                  g.drawString("1",(FrameWidth/2)-15,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-70,(FrameHeight/2)+39,140,2);
                  g.drawString("sin(θ)",(FrameWidth/2)-40,(FrameHeight/2)+80);
            }
      }
   }
   
   public static void QuotientIdentitiesG(Graphics g,int FrameWidth,int FrameHeight,int[] IdentitySwitch){
      
   // Flash card graphic //
      FlashCard(g,FrameWidth,FrameHeight);
      
   /////// Draw other UI ///////
      g.setFont(GraphicVar.titleFont);
      g.setColor(GraphicVar.titleShadow());
      g.drawString("Next",(FrameWidth/2)+153,(FrameHeight/2)+92);
      g.drawString("Back",(FrameWidth/2)-252,(FrameHeight/2)+92);
      g.setColor(GraphicVar.flashcardNextColor());
      g.drawString("Next",(FrameWidth/2)+155,(FrameHeight/2)+90);
      g.setColor(GraphicVar.flashcardBackColor());
      g.drawString("Back",(FrameWidth/2)-250,(FrameHeight/2)+90);
      g.setFont(GraphicVar.flashcardsFont);
      
   /////// Draw out a random identity /////// 
      g.setColor(Color.black);
      switch(IdentitySwitch[0]){ 
         case(1):
            switch(IdentitySwitch[1]){
               case(1):
                  g.drawString("tan(θ)",(FrameWidth/2)-50,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("sin(θ)",(FrameWidth/2)-40,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-70,(FrameHeight/2)+39,140,2);
                  g.drawString("cos(θ)",(FrameWidth/2)-40,(FrameHeight/2)+80);
            }
           break;
         case(2):
            switch(IdentitySwitch[1]){
               case(1):
                  g.drawString("cot(θ)",(FrameWidth/2)-50,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("cos(θ)",(FrameWidth/2)-40,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-70,(FrameHeight/2)+39,140,2);
                  g.drawString("sin(θ)",(FrameWidth/2)-40,(FrameHeight/2)+80);
            }
      }
   }
   
   public static void AllIdentitiesG(Graphics g,int FrameWidth,int FrameHeight,int[] IdentitySwitch){
      
   // Flash card graphic //
      FlashCard(g,FrameWidth,FrameHeight);
      
   /////// Draw other UI ///////
      g.setFont(GraphicVar.titleFont);
      g.setColor(GraphicVar.titleShadow());
      g.drawString("Next",(FrameWidth/2)+153,(FrameHeight/2)+92);
      g.drawString("Back",(FrameWidth/2)-252,(FrameHeight/2)+92);
      g.setColor(GraphicVar.flashcardNextColor());
      g.drawString("Next",(FrameWidth/2)+155,(FrameHeight/2)+90);
      g.setColor(GraphicVar.flashcardBackColor());
      g.drawString("Back",(FrameWidth/2)-250,(FrameHeight/2)+90);
      g.setFont(GraphicVar.flashcardsFont);
      
   /////// Draw out a random identity ///////   
      g.setColor(Color.black);
      switch(IdentitySwitch[0]){ 
         case(1):
            switch(IdentitySwitch[1]){
               case(1):
                  g.drawString("tan(θ)",(FrameWidth/2)-50,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("sin(θ)",(FrameWidth/2)-40,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-70,(FrameHeight/2)+39,140,2);
                  g.drawString("cos(θ)",(FrameWidth/2)-40,(FrameHeight/2)+80);
            }
           break;
         case(2):
            switch(IdentitySwitch[1]){
               case(1):
                  g.drawString("cot(θ)",(FrameWidth/2)-50,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("cos(θ)",(FrameWidth/2)-40,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-70,(FrameHeight/2)+39,140,2);
                  g.drawString("sin(θ)",(FrameWidth/2)-40,(FrameHeight/2)+80);
            }
           break;
         case(3):
            switch(IdentitySwitch[1]){
               case(1):
                  g.drawString("sin(θ)",(FrameWidth/2)-50,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("1",(FrameWidth/2)-15,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-70,(FrameHeight/2)+39,140,2);
                  g.drawString("csc(θ)",(FrameWidth/2)-40,(FrameHeight/2)+80);
            }
           break;
         case(4):
            switch(IdentitySwitch[1]){
               case(1):
                  g.drawString("cos(θ)",(FrameWidth/2)-50,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("1",(FrameWidth/2)-15,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-70,(FrameHeight/2)+39,140,2);
                  g.drawString("sec(θ)",(FrameWidth/2)-40,(FrameHeight/2)+80);
            }
           break;
         case(5):
            switch(IdentitySwitch[1]){
               case(1):
                  g.drawString("tan(θ)",(FrameWidth/2)-50,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("1",(FrameWidth/2)-15,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-70,(FrameHeight/2)+39,140,2);
                  g.drawString("cot(θ)",(FrameWidth/2)-40,(FrameHeight/2)+80);
            }
           break;
         case(6):
            switch(IdentitySwitch[1]){
               case(1):
                  g.drawString("csc(θ)",(FrameWidth/2)-50,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("1",(FrameWidth/2)-15,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-70,(FrameHeight/2)+39,140,2);
                  g.drawString("sin(θ)",(FrameWidth/2)-40,(FrameHeight/2)+80);
            }
           break;
         case(7):
            switch(IdentitySwitch[1]){
               case(1):
                  g.drawString("sec(θ)",(FrameWidth/2)-50,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("1",(FrameWidth/2)-15,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-70,(FrameHeight/2)+39,140,2);
                  g.drawString("cos(θ)",(FrameWidth/2)-40,(FrameHeight/2)+80);
            }
           break;
         case(8):
            switch(IdentitySwitch[1]){
               case(1):
                  g.drawString("cot(θ)",(FrameWidth/2)-50,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.drawString("1",(FrameWidth/2)-15,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-70,(FrameHeight/2)+39,140,2);
                  g.drawString("tan(θ)",(FrameWidth/2)-40,(FrameHeight/2)+80);
            }
           break;
         case(9):
            switch(IdentitySwitch[1]){
               case(1):
                  g.setFont(GraphicVar.flashcardsSquareFont);
                  g.drawString("2                  2",(FrameWidth/2)-20,(FrameHeight/2)+25);
                  g.setFont(GraphicVar.flashcardsFont);
                  g.drawString("sin(θ) +cos(θ)",(FrameWidth/2)-100,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.setFont(GraphicVar.flashcardsFlipFont);
                  g.drawString("(hint: is the sum of two functions that are squared)",(FrameWidth/2)-180,(FrameHeight/2)+150);
                  g.setFont(GraphicVar.flashcardsFont);
                  g.drawString("1",(FrameWidth/2)-5,(FrameHeight/2)+45);
            }
           break;
         case(10):
            switch(IdentitySwitch[1]){
               case(1):
                  g.setFont(GraphicVar.flashcardsSquareFont);
                  g.drawString("2",(FrameWidth/2)+25,(FrameHeight/2)+25);
                  g.setFont(GraphicVar.flashcardsFont);
                  g.drawString("tan(θ) +1",(FrameWidth/2)-60,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.setFont(GraphicVar.flashcardsSquareFont);
                  g.drawString("2",(FrameWidth/2)+35,(FrameHeight/2)+25);
                  g.setFont(GraphicVar.flashcardsFont);
                  g.drawString("sec(θ)",(FrameWidth/2)-50,(FrameHeight/2)+45);
            }
           break;
         case(11):
            switch(IdentitySwitch[1]){
               case(1):
                  g.setFont(GraphicVar.flashcardsSquareFont);
                  g.drawString("2",(FrameWidth/2)+40,(FrameHeight/2)+25);
                  g.setFont(GraphicVar.flashcardsFont);
                  g.drawString("1+cot(θ)",(FrameWidth/2)-80,(FrameHeight/2)+45);
                 break;
               case(2):
                  g.setFont(GraphicVar.flashcardsSquareFont);
                  g.drawString("2",(FrameWidth/2)+35,(FrameHeight/2)+25);
                  g.setFont(GraphicVar.flashcardsFont);
                  g.drawString("csc(θ)",(FrameWidth/2)-50,(FrameHeight/2)+45);
            }
           break;
         case(12):
            switch(IdentitySwitch[1]){
               case(1):
                  g.setFont(GraphicVar.flashcardsSquareFont);
                  g.drawString("2",(FrameWidth/2)-40,(FrameHeight/2)+5);
                  g.drawString("2",(FrameWidth/2)-35,(FrameHeight/2)+60);
                  g.drawString("2",(FrameWidth/2)+115,(FrameHeight/2)+5);
                  g.drawString("2",(FrameWidth/2)+115,(FrameHeight/2)+60);
                  g.setFont(GraphicVar.flashcardsFont);
                  g.drawString("sin(θ)",(FrameWidth/2)-120,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-125,(FrameHeight/2)+39,110,2);
                  g.drawString("cos(θ)",(FrameWidth/2)-120,(FrameHeight/2)+80);
                  g.drawString("+",(FrameWidth/2)-8,(FrameHeight/2)+50);
                  g.drawString("cos(θ)",(FrameWidth/2)+30,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)+15,(FrameHeight/2)+39,110,2);
                  g.drawString("cos(θ)",(FrameWidth/2)+30,(FrameHeight/2)+80);
                 break;
               case(2):
                  g.setFont(GraphicVar.flashcardsSquareFont);
                  g.drawString("2",(FrameWidth/2)+45,(FrameHeight/2)+60);
                  g.setFont(GraphicVar.flashcardsFont);
                  g.drawString("1",(FrameWidth/2)-15,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-70,(FrameHeight/2)+39,140,2);
                  g.drawString("cos(θ)",(FrameWidth/2)-40,(FrameHeight/2)+80);
            }
           break;
         case(13):
            switch(IdentitySwitch[1]){
               case(1):
                  g.setFont(GraphicVar.flashcardsSquareFont);
                  g.drawString("2",(FrameWidth/2)-40,(FrameHeight/2)+5);
                  g.drawString("2",(FrameWidth/2)-40,(FrameHeight/2)+60);
                  g.drawString("2",(FrameWidth/2)+115,(FrameHeight/2)+5);
                  g.drawString("2",(FrameWidth/2)+110,(FrameHeight/2)+60);
                  g.setFont(GraphicVar.flashcardsFont);
                  g.drawString("sin(θ)",(FrameWidth/2)-120,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-125,(FrameHeight/2)+39,110,2);
                  g.drawString("sin(θ)",(FrameWidth/2)-120,(FrameHeight/2)+80);
                  g.drawString("+",(FrameWidth/2)-8,(FrameHeight/2)+50);
                  g.drawString("cos(θ)",(FrameWidth/2)+30,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)+15,(FrameHeight/2)+39,110,2);
                  g.drawString("sin(θ)",(FrameWidth/2)+30,(FrameHeight/2)+80);
                 break;
               case(2):
                  g.setFont(GraphicVar.flashcardsSquareFont);
                  g.drawString("2",(FrameWidth/2)+40,(FrameHeight/2)+60);
                  g.setFont(GraphicVar.flashcardsFont);
                  g.drawString("1",(FrameWidth/2)-15,(FrameHeight/2)+25);
                  g.fillRect((FrameWidth/2)-70,(FrameHeight/2)+39,140,2);
                  g.drawString("sin(θ)",(FrameWidth/2)-40,(FrameHeight/2)+80);
            }
      }
   }

   public static void IdentitiesMatching(Graphics g, int FrameWidth,int FrameHeight,Rectangle[] draggable,Rectangle[] targets,boolean[] show,int t){
      Arrow(g,0,(FrameWidth/2)-40,390+((int)Math.round(10*Math.sin(t*Math.PI/90))));
      g.setFont(GraphicVar.titleFont);
      g.setColor(GraphicVar.titleShadow());
      g.drawString("Back",(FrameWidth/2)-36,FrameHeight-(FrameHeight/8)+2);
      g.drawString("Reshuffle",(FrameWidth/2)-62,FrameHeight-(FrameHeight/8)+37);
      g.setColor(GraphicVar.flashcardBackColor());
      g.drawString("Back",(FrameWidth/2)-34,FrameHeight-(FrameHeight/8));
      g.setColor(GraphicVar.flashcardNextColor());
      g.drawString("Reshuffle",(FrameWidth/2)-60,FrameHeight-(FrameHeight/8)+35);
      g.setFont(GraphicVar.promptFont);
      for(int i=0;i<targets.length;i++)
         if(show[i]){
            g.setColor(GraphicVar.flashcardColor());
            g.fillRoundRect(targets[i].x, targets[i].y, targets[i].width, targets[i].height,10,10);  // Draw drop target
            g.setColor(Color.black);
            g.drawRoundRect(targets[i].x + 3, targets[i].y + 3, targets[i].width - 6, targets[i].height - 6, 10, 10);  // Draw drop target
            g.drawRoundRect(targets[i].x, targets[i].y, targets[i].width, targets[i].height,10,10);  // Draw drop target
            switch (i) {
               case 0:
                  g.drawString("tanθ", targets[i].x+32, targets[i].y+35);
                  break;
               case 1:
                  g.drawString("cotθ", targets[i].x+32, targets[i].y+35);
                  break;
               case 2:
                  g.drawString("1", targets[i].x+48, targets[i].y+35);
                  break;
               case 3:
                  g.drawString("1", targets[i].x+48, targets[i].y+26);
                  g.drawLine(targets[i].x+29, targets[i].y+30,targets[i].x+71,targets[i].y+30);
                  g.drawString("sinθ", targets[i].x+34, targets[i].y+44);
                  break;
               case 4:
                  g.drawString("sec²θ", targets[i].x+30, targets[i].y+35);
                  break;
               case 5:
                  g.drawString("cot²θ", targets[i].x+30, targets[i].y+35);
                  break;
               default:
                  g.drawString("W.I.P.", targets[i].x+25, targets[i].y+35);

            }
         }
      for(int i=0;i<draggable.length;i++)
         if(show[i]){
            g.setColor(GraphicVar.flashcardColor());
            g.fillRoundRect(draggable[i].x, draggable[i].y, draggable[i].width, draggable[i].height, 10, 10);  // Draw draggable item
            g.setColor(Color.black);
            g.drawRoundRect(draggable[i].x + 3, draggable[i].y + 3, draggable[i].width - 6, draggable[i].height - 6, 10, 10);  // Draw draggable item
            g.drawRoundRect(draggable[i].x, draggable[i].y, draggable[i].width, draggable[i].height, 10, 10);  // Draw draggable item
            switch (i) {
               case 0:
                  g.drawString("sinθ", draggable[i].x+34, draggable[i].y+26);
                  g.drawLine(draggable[i].x+29, draggable[i].y+30,draggable[i].x+71,draggable[i].y+30);
                  g.drawString("cosθ", draggable[i].x+33, draggable[i].y+44);
                  break;
               case 1:
                  g.drawString("cosθ", draggable[i].x+33, draggable[i].y+26);
                  g.drawLine(draggable[i].x+29, draggable[i].y+30,draggable[i].x+71,draggable[i].y+30);
                  g.drawString("sinθ", draggable[i].x+34, draggable[i].y+44);
                  break;
               case 2:
                  g.drawString("sin²θ+cos²θ", draggable[i].x+6, draggable[i].y+35);
                  break;
               case 3:
                  g.drawString("cscθ", draggable[i].x+32, draggable[i].y+35);
                  break;
               case 4:
                  g.drawString("tan²θ+1",draggable[i].x+22, draggable[i].y+35);
                  break;
               case 5:
                  g.drawString("csc²θ-1",draggable[i].x+22, draggable[i].y+35);
                  break;
               default:
                  g.drawString("W.I.P.", draggable[i].x+25, draggable[i].y+35);

            }
         }
   }

   public static void IdentityFlashcardsG(Graphics g){
      
   ///////  Flashcard Options  ///////
      g.setColor(GraphicVar.title());
      g.setFont(GraphicVar.promptTitleFont);
      g.drawString("Identity Flashcards",10,95);
      g.setColor(GraphicVar.flashcardBackColor());
      g.drawString("Back",10,215);
      g.setFont(GraphicVar.promptFont);
      g.setColor(GraphicVar.title());
      g.drawString("Reciprocal",15,115);
      g.drawString("Quotient",15,135);
      g.drawString("Pythagorean",15,155);
      g.drawString("Shotgun/ALL",15,175);
      g.drawString("Matching",15,195);
   }

   public static void TriangleFlashcardsG(Graphics g){
      
   ///////  Flashcard Options  ///////
      g.setColor(GraphicVar.title());
      g.setFont(GraphicVar.promptTitleFont);
      g.drawString("Triangle Flashcards",10,95);
      g.setColor(GraphicVar.flashcardBackColor());
      g.drawString("Back",10,195);
      g.setFont(GraphicVar.promptFont);
      g.setColor(GraphicVar.title());
      g.drawString("90,45,45",15,115);
      g.drawString("90,60,30",15,135);
      g.drawString("Shotgun/ALL",15,155);
      g.drawString("Matching",15,175);
   }
   
   public static void StudyOptionsPrompt(Graphics g,int FrameHeight){
      
   ///////  Study Options  ///////
      g.setColor(GraphicVar.title());
      g.setFont(GraphicVar.promptTitleFont);
      g.drawString("Study Options",10,95);
      g.drawString("Settings",10,FrameHeight-25);
      g.setFont(GraphicVar.promptFont);
      g.drawString("Identity Flashcards",15,115);
      g.drawString("Triangle Flashcards",15,135);
   ///////  Graphic Icons  ///////
   // Flash card graphic picolissima //
      g.setColor(GraphicVar.flashcardColor());
      g.fillRect(165,100,18,9);
      g.setColor(Color.black);
      g.drawRect(165,100,18,9);
      g.setColor(GraphicVar.flashcardColor());
      g.fillRect(167,102,18,9);
      g.setColor(Color.black);
      g.drawRect(167,102,18,9);
      g.setColor(GraphicVar.flashcardColor());
      g.fillRect(169,104,18,9);
      g.setColor(Color.black);
      g.drawRect(169,104,18,9);
   // right triangle picolissima //
      g.drawLine(170,120,170,135);
      g.drawLine(170,135,185,135);
      g.drawLine(170,120,185,135);
      g.drawLine(170,130,175,130);
      g.drawLine(175,135,175,130);
   }

   private static void Arrow(Graphics g,double rotation_rad, int x, int y){
      Color Original = g.getColor();
      long stemYoffset = Math.round(75 * Math.sin(rotation_rad));
      long stemXoffset = Math.round(75 * Math.cos(rotation_rad));

      int x2 = x+3;
      int y2 = y-3;

      int[] poly_x1 = {x+((int) stemXoffset),x+((int) stemXoffset)+((int)Math.round(25*Math.cos(rotation_rad+(3*Math.PI/4)))),x+(int)(-Math.round(5*Math.cos(-rotation_rad+Math.PI/2))+Math.round(60*Math.cos(rotation_rad))),x-((int)Math.round(5*Math.cos(-rotation_rad+Math.PI/2))),x-((int)Math.round(5*Math.cos(-rotation_rad-Math.PI/2))),x+(int)(-Math.round(5*Math.cos(-rotation_rad-Math.PI/2))+Math.round(60*Math.cos(rotation_rad))),x+((int) stemXoffset)+((int)Math.round(25*Math.cos(-rotation_rad+(3*Math.PI/4))))};
      int[] poly_y1 = {y-((int) stemYoffset),y-((int) stemYoffset)-((int)Math.round(25*Math.sin(rotation_rad+(3*Math.PI/4)))),y+(int)(-Math.round(5*Math.sin(-rotation_rad+Math.PI/2))-Math.round(60*Math.sin(rotation_rad))),y-((int)Math.round(5*Math.sin(-rotation_rad+Math.PI/2))),y-((int)Math.round(5*Math.sin(-rotation_rad-Math.PI/2))),y+(int)(-Math.round(5*Math.sin(-rotation_rad-Math.PI/2))-Math.round(60*Math.sin(rotation_rad))),y+((int) -stemYoffset)+((int)Math.round(25*Math.sin(-rotation_rad+(3*Math.PI/4))))};
      Polygon Arrow1 = new Polygon(poly_x1,poly_y1,7);

      int[] poly_x2 = {x2+((int) stemXoffset),x2+((int) stemXoffset)+((int)Math.round(25*Math.cos(rotation_rad+(3*Math.PI/4)))),x2+(int)(-Math.round(5*Math.cos(-rotation_rad+Math.PI/2))+Math.round(60*Math.cos(rotation_rad))),x2-((int)Math.round(5*Math.cos(-rotation_rad+Math.PI/2))),x2-((int)Math.round(5*Math.cos(-rotation_rad-Math.PI/2))),x2+(int)(-Math.round(5*Math.cos(-rotation_rad-Math.PI/2))+Math.round(60*Math.cos(rotation_rad))),x2+((int) stemXoffset)+((int)Math.round(25*Math.cos(-rotation_rad+(3*Math.PI/4))))};
      int[] poly_y2 = {y2-((int) stemYoffset),y2-((int) stemYoffset)-((int)Math.round(25*Math.sin(rotation_rad+(3*Math.PI/4)))),y2+(int)(-Math.round(5*Math.sin(-rotation_rad+Math.PI/2))-Math.round(60*Math.sin(rotation_rad))),y2-((int)Math.round(5*Math.sin(-rotation_rad+Math.PI/2))),y2-((int)Math.round(5*Math.sin(-rotation_rad-Math.PI/2))),y2+(int)(-Math.round(5*Math.sin(-rotation_rad-Math.PI/2))-Math.round(60*Math.sin(rotation_rad))),y2+((int) -stemYoffset)+((int)Math.round(25*Math.sin(-rotation_rad+(3*Math.PI/4))))};
      Polygon Arrow2 = new Polygon(poly_x2,poly_y2,7);

      g.setColor(GraphicVar.titleShadow());
      g.fillPolygon(Arrow1);
      g.setColor(GraphicVar.title());
      g.fillPolygon(Arrow2);
      g.setColor(Original);
   }
   
   public static void SettingsMeny(Graphics g, int FrameWidth,int FrameHeight){
   ///////  Dividers  ///////
      g.setFont(GraphicVar.promptTitleFont);
      g.drawString("Theme",10,95);
      g.setColor(GraphicVar.flashcardBackColor());
      g.drawString("Back",10,175);
   //////  Selectors  ///////
      g.setColor(GraphicVar.title());
      int[] x = {13,20,20};
      int[] y = {105,98,112};
      g.fillPolygon(x,y,3);
      x[0] = 217;x[1] = 210;x[2] = 210;
      g.fillPolygon(x,y,3);
   //////  Credits  //////
      g.setColor(Color.black);
      g.fillRoundRect(400,120,210,300,10,10);
      g.setColor(Color.white);
      g.setFont(new Font("Helvetica",1,15));
      g.drawString("Credits",480,135);
      g.drawString("Developer",400,150);
      g.drawString("Evan Ozment (YesItIsEvan)",410,165);
      g.drawString("Alpha Testers",400,180);
      g.drawString("Catherine Book",410,195);
      g.drawString("Addison Crain",410,210);
      g.drawString("Sarah Rockforte",410,225);

   }

   public static void PaletteChoice(Graphics g, ColorPalette palette){
      g.setFont(new Font("Helvetica",1,15));
      Color[] Palette;
      String[] Charset;
      switch(palette){
         case WHITESCAPE:
            g.setColor(Color.darkGray);
            g.fillRect(22,98,186,16);
            Palette = new Color[]
                    {new Color(232,227,227),new Color(225,192,169),new Color(225,143,137),
                     new Color(165,53,81),new Color(67,24,55),new Color(162,179,178),
                     new Color(95,115,123),new Color(31,35,46),new Color(0,0,0),
                     new Color(232,227,227)};
            Charset = new String[]{"W","H","I","T","E","S","C","A","P","E"};
            for(int i=0;i<Palette.length;i++){
               g.setColor(Palette[i]);
               g.drawString(Charset[i],25+(15*i),112);
            }
            break;
         case VIVIDMEMORY8:
            g.setColor(Color.darkGray);
            g.fillRect(22,98,186,16);
            Palette = new Color[]
                    {new Color(56,22,49),new Color(226,28,97),new Color(226,97,89),
                     new Color(254,168,95),new Color(216,220,180),new Color(94,182,173),
                     new Color(27,149,141),new Color(16,83,144),new Color(56,22,49),
                     new Color(226,28,97),new Color(226,97,89),new Color(254,168,95)};
            Charset = new String[]{"V","I","V","I","D","M","E","M","O","R","Y","8"};
            for(int i=0;i<Palette.length;i++){
               g.setColor(Palette[i]);
               g.drawString(Charset[i],25+(15*i),112);
            }
            break;
         case SEAFOAM8:
            g.setColor(Color.gray);
            g.fillRect(22,98,186,16);
            Palette = new Color[]
                    {new Color(50,63,77),new Color(109,120,131),new Color(152,167,175),
                     new Color(186,200,200),new Color(56,56,56),new Color(120,120,120),
                     new Color(167,167,167),new Color(200,200,200)};
            Charset = new String[]{"S","E","A","F","O","A","M","8"};
            for(int i=0;i<Palette.length;i++){
               g.setColor(Palette[i]);
               g.drawString(Charset[i],25+(15*i),112);
            }
            break;
      }
   }

   public static void Background(Graphics g, int FrameWidth, int FrameHeight){
      ///////  Refresh/Paint Background  ///////
      g.setColor(GraphicVar.backgroundColor());
      g.fillRect(0,0,FrameWidth,FrameHeight);
   }

   public static void NonInteractables(Graphics g,int FrameWidth,int FrameHeight){

   ///////  Borders  ///////
      g.setColor(GraphicVar.edgesColor());
      g.fillRect(0,0,FrameWidth,71);
      g.fillRect(0,FrameHeight-17,FrameWidth,17);
      g.setColor(Color.black);
      g.fillRect(0,70,FrameWidth,3);
      g.fillRect(0,FrameHeight-17,FrameWidth,3);
   
   ///////  Bug Report  ///////
      g.setFont(new Font("Times New Roman",1,14));
      g.drawString("For support open readme.txt",3,FrameHeight-3);
   
   ///////  Version  ///////
      g.setFont(new Font("Times New Roman",1,13));
      g.setColor(GraphicVar.edgesColor());
      g.fillRect(FrameWidth-70,FrameHeight-14,70,14);
      g.setColor(Color.black);
      g.fillRect(FrameWidth-75,FrameHeight-16,3,16);
      g.drawString("V 0.2.6 2025",FrameWidth-70,FrameHeight-3);
   
   ///////  Title  ///////
      g.setFont(GraphicVar.titleFont);
   // Shadow //
      g.setColor(GraphicVar.titleShadow());
      g.drawString("Trigonometry",(FrameWidth/2)-95,32);
      g.drawString("Study Helper",(FrameWidth/2)-92,62);
   // Main Title //
      g.setColor(GraphicVar.title());
      g.drawString("Trigonometry",(FrameWidth/2)-93,30);
      g.drawString("Study Helper",(FrameWidth/2)-90,60);
   }

   public static void Waiting(Graphics g,int t,int FrameWidth,int FrameHeight){

      ///////  Background  ///////
      g.setColor(GraphicVar.backgroundColor());
      g.fillRect(0,0,FrameWidth,FrameHeight);

      ///////  Waiting ///////
      g.setFont(new Font("Times New Roman",3,42));
      g.setColor(GraphicVar.title());
      g.drawString("Waiting",(FrameWidth/2)-125,(FrameHeight/2)+15);

      ///////  dot dot dot  ///////
      if(0<=t&&t<60)
         g.drawString("θ o o",(FrameWidth/2)+25,(FrameHeight/2)+15);
      if(60<=t&&t<120)
         g.drawString("o θ o",(FrameWidth/2)+25,(FrameHeight/2)+15);
      if(120<=t&&t<180)
         g.drawString("o o θ",(FrameWidth/2)+25,(FrameHeight/2)+15);

      ///////  edges  ///////
      g.setColor(GraphicVar.edgesColor());
      g.fillRect(0,0,FrameWidth,71);
      g.fillRect(0,FrameHeight-17,FrameWidth,17);
      g.setColor(Color.black);
      g.fillRect(0,70,FrameWidth,3);
      g.fillRect(0,FrameHeight-17,FrameWidth,3);

   }
}