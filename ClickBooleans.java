

public class ClickBooleans{

   static int WindowWidth;
   static int WindowHeight;
   
   public static void WindowSize(int WindowX,int WindowY){
      WindowWidth = WindowX;
      WindowHeight = WindowY;
   }

   public static boolean Home(boolean[] StudyOptions){
      if(FalseBooleanArray(StudyOptions))
         return true;
      else
         return false;
   }

   public static boolean Settings(boolean[] StudyOptions){
      if(StudyOptions[2])
         return true;
      else
         return false;
   }


   ///////  Settings  ///////
   public static boolean OpenSettings(int x,int y){
      if(x > 10 && x < 75 && y < (WindowHeight-25) && y > (WindowHeight-40))
         return true;
      else
         return false;
   }

   public static boolean SwitchThemeRight(int x,int y){
      if(x > 210 && x < 220 && y < 113 && y > 98)
         return true;
      else
         return false;
   }

   public static boolean SwitchThemeLeft(int x,int y){
      if(x > 10 && x < 20 && y < 113 && y > 98)
         return true;
      else
         return false;
   }

   public static boolean CloseSettings(int x,int y){
      if(x > 10 && x < 55 && y < 175 && y > 160)
         return true;
      else
         return false;
   }

   ///////  Triangles  ///////
   public static boolean TriangleFlashcards(boolean[] StudyOptions){
      if(StudyOptions[1])
         return true;
      else
         return false;
   }

   public static boolean TriangleFlashcards(int x,int y){
      if(x > 15 && x < 190 && y > 120 && y < 135)
         return true;
      else
         return false;
   }
   
   public static boolean ExitTriangleFlashcards(int x,int y,boolean[] TriangleFlashcards){
      if(x > 10 && x < 55 && y > 160 && y < 175 && FalseBooleanArray(TriangleFlashcards))
         return true;
      else
         return false;
   }
   
   public static boolean StudyFortyFiveTriangleFlashcards(int x,int y,boolean[] TriangleFlashcards){
      if(x > 15 && x < 80 && y > 100 && y < 115 && FalseBooleanArray(TriangleFlashcards))
         return true;
      else
         return false;
   }
   
   public static boolean FlipFortyFiveCard(int x,int y,boolean[] TriangleFlashcards){
      if(x > (WindowWidth/2)+90 && x < (WindowWidth/2)+150 && y > (WindowHeight/2)+85 && y < (WindowHeight/2)+115 && TriangleFlashcards[0])
         return true;
      else
         return false;
   }

   public static boolean ExitFortyFiveFlashcards(int x,int y,boolean[] TriangleFlashcards){
      if(x > (WindowWidth/2)-252 && x < (WindowWidth/2)-180 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && TriangleFlashcards[0])
         return true;
      else
         return false;
   }
   
   public static boolean NextFortyFiveCard(int x,int y,boolean[] TriangleFlashcards){
      if(x > (WindowWidth/2)+153 && x < (WindowWidth/2)+218 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && TriangleFlashcards[0])
         return true;
      else
         return false;
   }
   
   public static boolean StudySixtyTriangleFlashcards(int x,int y,boolean[] TriangleFlashcards){
      if(x > 15 && x < 80 && y > 120 && y < 135 && FalseBooleanArray(TriangleFlashcards))
         return true;
      else
         return false;
   }
   
   public static boolean FlipSixtyCard(int x,int y,boolean[] TriangleFlashcards){
      if(x > (WindowWidth/2)+90 && x < (WindowWidth/2)+150 && y > (WindowHeight/2)+85 && y < (WindowHeight/2)+115 && TriangleFlashcards[1])
         return true;
      else
         return false;
   }

   public static boolean ExitSixtyFlashcards(int x,int y,boolean[] TriangleFlashcards){
      if(x > (WindowWidth/2)-252 && x < (WindowWidth/2)-180 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && TriangleFlashcards[1])
         return true;
      else
         return false;
   }
   
   public static boolean NextSixtyCard(int x,int y,boolean[] TriangleFlashcards){
      if(x > (WindowWidth/2)+153 && x < (WindowWidth/2)+218 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && TriangleFlashcards[1])
         return true;
      else
         return false;
   }
   
   public static boolean StudyAllTriangleFlashcards(int x,int y,boolean[] TriangleFlashcards){
      if(x > 15 && x < 121 && y > 141 && y < 155 && FalseBooleanArray(TriangleFlashcards))
         return true;
      else
         return false;
   }
   
   public static boolean FlipAllTriangleCard(int x, int y, boolean[] TriangleFlashcards){
      if(x > (WindowWidth/2)+90 && x < (WindowWidth/2)+150 && y > (WindowHeight/2)+85 && y < (WindowHeight/2)+115 && TriangleFlashcards[2])
         return true;
      else
         return false;
   }

   public static boolean ExitAllTriangleFlashcards(int x, int y, boolean[] TriangleFlashcards){
      if(x > (WindowWidth/2)-252 && x < (WindowWidth/2)-180 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && TriangleFlashcards[2])
         return true;
      else
         return false;
   }
   
   public static boolean NextAllTriangleCard(int x, int y, boolean[] TriangleFlashcards){
      if(x > (WindowWidth/2)+153 && x < (WindowWidth/2)+218 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && TriangleFlashcards[2])
         return true;
      else
         return false;
   }
   
   ///////  Identities  ///////
   public static boolean IdentityFlashcards(boolean[] StudyOptions){
      if(StudyOptions[0])
         return true;
      else
         return false;
   }

   public static boolean IdentityFlashcards(int x, int y){
      if(x > 15 && x < 190 && y > 100 && y < 115)
         return true;
      else
         return false;
   }

   public static boolean ExitIdentityFlashcards(int x,int y,boolean[] IdentityFlashcards){
      if(x > 15 && x < 55 && y > 180 && y < 195 && FalseBooleanArray(IdentityFlashcards))
         return true;
      else
         return false;
   }
   
   public static boolean StudyReciprocalIdentities(int x, int y, boolean[] IdentityFlashcards){
      if(x > 15 && x < 93 && y > 100 && y < 115 && FalseBooleanArray(IdentityFlashcards))
         return true;
      else 
         return false;
   }
   
   public static boolean FlipReciprocalCard(int x, int y, boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)+90 && x < (WindowWidth/2)+150 && y > (WindowHeight/2)+85 && y < (WindowHeight/2)+115 && IdentityFlashcards[0])
         return true;
      else
         return false;
   }

   public static boolean ExitReciprocalFlashcards(int x, int y, boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)-252 && x < (WindowWidth/2)-180 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && IdentityFlashcards[0])
         return true;
      else
         return false;
   }
   
   public static boolean NextReciprocalCard(int x, int y, boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)+153 && x < (WindowWidth/2)+218 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && IdentityFlashcards[0])
         return true;
      else
         return false;
   }
   
   public static boolean StudyQuotientFlashcards(int x, int y, boolean[] IdentityFlashcards){
      if(x > 15 && x < 83 && y > 125 && y < 135 && FalseBooleanArray(IdentityFlashcards))
         return true;
      else 
         return false;
   }

   public static boolean FlipQuotientCard(int x, int y, boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)+90 && x < (WindowWidth/2)+150 && y > (WindowHeight/2)+85 && y < (WindowHeight/2)+115 && IdentityFlashcards[1])
         return true;
      else
         return false;
   }

   public static boolean ExitQuotientFlashcards(int x, int y, boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)-252 && x < (WindowWidth/2)-180 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && IdentityFlashcards[1])
         return true;
      else
         return false;
   }
   
   public static boolean NextQuotientCard(int x, int y, boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)+153 && x < (WindowWidth/2)+218 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && IdentityFlashcards[1])
         return true;
      else
         return false;
   }
   
   public static boolean StudyPythagoreanFlashcards(int x, int y, boolean[] IdentityFlashcards){
      if(x > 15 && x < 112 && y > 140 && y < 155 && FalseBooleanArray(IdentityFlashcards))
         return true;
      else 
         return false;
   }
   
   public static boolean FlipPythagoreanCard(int x, int y, boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)+90 && x < (WindowWidth/2)+150 && y > (WindowHeight/2)+85 && y < (WindowHeight/2)+115 && IdentityFlashcards[2])
         return true;
      else
         return false;
   }

   public static boolean ExitPythagoreanFlashcards(int x, int y, boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)-252 && x < (WindowWidth/2)-180 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && IdentityFlashcards[2])
         return true;
      else
         return false;
   }
   
   public static boolean NextPythagoreanCard(int x, int y, boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)+153 && x < (WindowWidth/2)+218 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && IdentityFlashcards[2])
         return true;
      else
         return false;
   }
   
   public static boolean StudyAllIdentityFlashcards(int x, int y, boolean[] IdentityFlashcards){
      if(x > 15 && x < 121 && y > 161 && y < 175 && (IdentityFlashcards[0] == false))
         return true;
      else 
         return false;
   }
   
   public static boolean FlipAllIdentityCard(int x, int y, boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)+90 && x < (WindowWidth/2)+150 && y > (WindowHeight/2)+85 && y < (WindowHeight/2)+115 && IdentityFlashcards[3])
         return true;
      else
         return false;
   }

   public static boolean ExitAllIdentityFlashcards(int x, int y, boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)-252 && x < (WindowWidth/2)-180 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && IdentityFlashcards[3])
         return true;
      else
         return false;
   }
   
   public static boolean NextAllIdentityCard(int x, int y, boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)+153 && x < (WindowWidth/2)+218 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && IdentityFlashcards[3])
         return true;
      else
         return false;
   }
   
   private static boolean FalseBooleanArray(boolean[] Array){
      for(int i=0;i<Array.length;i++)
         if(Array[i])
            return false;
      return true;
   }
}