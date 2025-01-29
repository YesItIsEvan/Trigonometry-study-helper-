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
   
   public static void IdentityFlashcardsG(Graphics g){
      
   ///////  Flashcard Options  ///////
      g.setFont(GraphicVar.promptTitleFont);
      g.drawString("Identity Flashcards",10,95);
      g.setColor(GraphicVar.flashcardBackColor());
      g.drawString("Back",10,195);
      g.setFont(GraphicVar.promptFont);
      g.setColor(GraphicVar.title());
      g.drawString("Reciprical",15,115);
      g.drawString("Quotient",15,135);
      g.drawString("Pythagorean",15,155);
      g.drawString("Shotgun/ALL",15,175);
   }

   public static void TriangleFlashcardsG(Graphics g){
      
   ///////  Flashcard Options  ///////
      g.setFont(GraphicVar.promptTitleFont);
      g.drawString("Triangle Flashcards",10,95);
      g.setColor(GraphicVar.flashcardBackColor());
      g.drawString("Back",10,175);
      g.setFont(GraphicVar.promptFont);
      g.setColor(GraphicVar.title());
      g.drawString("90,45,45",15,115);
      g.drawString("90,60,30",15,135);
      g.drawString("Shotgun/ALL",15,155);
   }
   
   public static void StudyOptionsPrompt(Graphics g,int FrameHeight){
      
   ///////  Study Options  ///////
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
   }

   public static void PaletteChoice(Graphics g, ColorPalette palette){
      g.setFont(new Font("Helvetica",1,15));
      g.setColor(Color.darkGray);///////////////////////////put in other cases it is too dark for SEAFOAM8
      g.fillRect(22,98,186,16);///////////////////////////////////////
      Color[] Palette;
      String[] Charset;
      switch(palette){
         case WHITESCAPE:
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
   
   public static void NonInteractables(Graphics g,int FrameWidth,int FrameHeight){
   
   ///////  Refresh/Paint Background  ///////
      g.setColor(GraphicVar.backgroundColor());
      g.fillRect(0,0,FrameWidth,FrameHeight);
   
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
      g.fillRect(FrameWidth-70,FrameHeight-16,3,14);
      g.drawString("V 0.2  2024",FrameWidth-65,FrameHeight-3);
   
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
}