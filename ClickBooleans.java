

public class ClickBooleans{

   static int WindowWidth;
   static int WindowHeight;
   
   public static void WindowSize(int WindowX,int WindowY){
      WindowWidth = WindowX;
      WindowHeight = WindowY;
   }
   
   ///////  Settings  ///////
   public static boolean OpenSettings(int x,int y,boolean[] StudyOptions){
      if(x > 10 && x < 75 && y < (WindowHeight-25) && y > (WindowHeight-40) && FalseBooleanArray(StudyOptions))
         return true;
      else
         return false;
   }
   
   public static boolean CloseSettings(int x,int y,boolean[] StudyOptions){
      if(x > 10 && x < 55 && y < 175 && y > 160 && StudyOptions[2])
         return true;
      else
         return false;   }
   
   ///////  Triangles  ///////
   public static boolean TriangleFlashcardOptions(int x,int y,boolean[] StudyOptions){
      if(x > 15 && x < 190 && y > 120 && y < 135 && FalseBooleanArray(StudyOptions))
         return true;
      else
         return false;
   }
   
   public static boolean ExitTriangleFlashcards(int x,int y,boolean[] StudyOptions,boolean[] TriangleFlashcards){
      if(x > 10 && x < 55 && y > 160 && y < 175 && StudyOptions[1] && FalseBooleanArray(TriangleFlashcards))
         return true;
      else
         return false;
   }
   
   public static boolean TriangleFlashcardOption1(int x,int y,boolean[] StudyOptions,boolean[] TriangleFlashcards){
      if(x > 15 && x < 80 && y > 100 && y < 115 && StudyOptions[1] && FalseBooleanArray(TriangleFlashcards))
         return true;
      else
         return false;
   }
   
   public static boolean TriangleFlashcardOption1Flip(int x,int y,boolean[] StudyOptions,boolean[] TriangleFlashcards){
      if(x > (WindowWidth/2)+90 && x < (WindowWidth/2)+150 && y > (WindowHeight/2)+85 && y < (WindowHeight/2)+115 && StudyOptions[1] && TriangleFlashcards[0])
         return true;
      else
         return false;
   }

   public static boolean ExitTriangleFlashcardOption1(int x,int y,boolean[] StudyOptions,boolean[] TriangleFlashcards){
      if(x > (WindowWidth/2)-252 && x < (WindowWidth/2)-180 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && StudyOptions[1] && TriangleFlashcards[0])
         return true;
      else
         return false;
   }
   
   public static boolean TriangleFlashcardOption1Shuffle(int x,int y,boolean[] StudyOptions,boolean[] TriangleFlashcards){
      if(x > (WindowWidth/2)+153 && x < (WindowWidth/2)+218 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && StudyOptions[1] && TriangleFlashcards[0])
         return true;
      else
         return false;
   }
   
   public static boolean TriangleFlashcardOption2(int x,int y,boolean[] StudyOptions,boolean[] TriangleFlashcards){
      if(x > 15 && x < 80 && y > 120 && y < 135 && StudyOptions[1] && FalseBooleanArray(TriangleFlashcards))
         return true;
      else
         return false;
   }
   
   public static boolean TriangleFlashcardOption2Flip(int x,int y,boolean[] StudyOptions,boolean[] TriangleFlashcards){
      if(x > (WindowWidth/2)+90 && x < (WindowWidth/2)+150 && y > (WindowHeight/2)+85 && y < (WindowHeight/2)+115 && StudyOptions[1] && TriangleFlashcards[1])
         return true;
      else
         return false;
   }

   public static boolean ExitTriangleFlashcardOption2(int x,int y,boolean[] StudyOptions,boolean[] TriangleFlashcards){
      if(x > (WindowWidth/2)-252 && x < (WindowWidth/2)-180 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && StudyOptions[1] && TriangleFlashcards[1])
         return true;
      else
         return false;
   }
   
   public static boolean TriangleFlashcardOption2Shuffle(int x,int y,boolean[] StudyOptions,boolean[] TriangleFlashcards){
      if(x > (WindowWidth/2)+153 && x < (WindowWidth/2)+218 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && StudyOptions[1] && TriangleFlashcards[1])
         return true;
      else
         return false;
   }
   
   public static boolean TriangleFlashcardOption3(int x,int y,boolean[] StudyOptions,boolean[] TriangleFlashcards){
      if(x > 15 && x < 121 && y > 141 && y < 155 && StudyOptions[1] && FalseBooleanArray(TriangleFlashcards))
         return true;
      else
         return false;
   }
   
   public static boolean TriangleFlashcardOption3Flip(int x,int y,boolean[] StudyOptions,boolean[] TriangleFlashcards){
      if(x > (WindowWidth/2)+90 && x < (WindowWidth/2)+150 && y > (WindowHeight/2)+85 && y < (WindowHeight/2)+115 && StudyOptions[1] && TriangleFlashcards[2])
         return true;
      else
         return false;
   }

   public static boolean ExitTriangleFlashcardOption3(int x,int y,boolean[] StudyOptions,boolean[] TriangleFlashcards){
      if(x > (WindowWidth/2)-252 && x < (WindowWidth/2)-180 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && StudyOptions[1] && TriangleFlashcards[2])
         return true;
      else
         return false;
   }
   
   public static boolean TriangleFlashcardOption3Shuffle(int x,int y,boolean[] StudyOptions,boolean[] TriangleFlashcards){
      if(x > (WindowWidth/2)+153 && x < (WindowWidth/2)+218 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && StudyOptions[1] && TriangleFlashcards[2])
         return true;
      else
         return false;
   }
   
   ///////  Identities  ///////
   public static boolean IdentitiyFlashcardOptions(int x,int y,boolean[] StudyOptions){
      if(x > 15 && x < 190 && y > 100 && y < 115 && FalseBooleanArray(StudyOptions))
         return true;
      else
         return false;
   }

   public static boolean ExitIdentityFlashcards(int x,int y,boolean[] StudyOptions,boolean[] IdentityFlashcards){
      if(x > 15 && x < 55 && y > 180 && y < 195 && StudyOptions[0] && FalseBooleanArray(IdentityFlashcards))
         return true;
      else
         return false;
   }
   
   public static boolean IdentityFlashcardOption1(int x,int y,boolean[] StudyOptions,boolean[] IdentityFlashcards){
      if(x > 15 && x < 93 && y > 100 && y < 115 && StudyOptions[0] && FalseBooleanArray(IdentityFlashcards))
         return true;
      else 
         return false;
   }
   
   public static boolean IdentityFlashcardOption1Flip(int x,int y,boolean[] StudyOptions,boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)+90 && x < (WindowWidth/2)+150 && y > (WindowHeight/2)+85 && y < (WindowHeight/2)+115 && StudyOptions[0] && IdentityFlashcards[0])
         return true;
      else
         return false;
   }

   public static boolean ExitIdentityFlashcardOption1(int x,int y,boolean[] StudyOptions,boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)-252 && x < (WindowWidth/2)-180 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && StudyOptions[0] && IdentityFlashcards[0])
         return true;
      else
         return false;
   }
   
   public static boolean IdentityFlashcardOption1Shuffle(int x,int y,boolean[] StudyOptions,boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)+153 && x < (WindowWidth/2)+218 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && StudyOptions[0] && IdentityFlashcards[0])
         return true;
      else
         return false;
   }
   
   public static boolean IdentityFlashcardOption2(int x,int y,boolean[] StudyOptions,boolean[] IdentityFlashcards){
      if(x > 15 && x < 83 && y > 125 && y < 135 && StudyOptions[0] && FalseBooleanArray(IdentityFlashcards))
         return true;
      else 
         return false;
   }
   
   public static boolean IdentityFlashcardOption2Flip(int x,int y,boolean[] StudyOptions,boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)+90 && x < (WindowWidth/2)+150 && y > (WindowHeight/2)+85 && y < (WindowHeight/2)+115 && StudyOptions[0] && IdentityFlashcards[1])
         return true;
      else
         return false;
   }

   public static boolean ExitIdentityFlashcardOption2(int x,int y,boolean[] StudyOptions,boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)-252 && x < (WindowWidth/2)-180 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && StudyOptions[0] && IdentityFlashcards[1])
         return true;
      else
         return false;
   }
   
   public static boolean IdentityFlashcardOption2Shuffle(int x,int y,boolean[] StudyOptions,boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)+153 && x < (WindowWidth/2)+218 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && StudyOptions[0] && IdentityFlashcards[1])
         return true;
      else
         return false;
   }
   
   public static boolean IdentityFlashcardOption3(int x,int y,boolean[] StudyOptions,boolean[] IdentityFlashcards){
      if(x > 15 && x < 112 && y > 140 && y < 155 && StudyOptions[0] && FalseBooleanArray(IdentityFlashcards))
         return true;
      else 
         return false;
   }
   
   public static boolean IdentityFlashcardOption3Flip(int x,int y,boolean[] StudyOptions,boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)+90 && x < (WindowWidth/2)+150 && y > (WindowHeight/2)+85 && y < (WindowHeight/2)+115 && StudyOptions[0] && IdentityFlashcards[2])
         return true;
      else
         return false;
   }

   public static boolean ExitIdentityFlashcardOption3(int x,int y,boolean[] StudyOptions,boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)-252 && x < (WindowWidth/2)-180 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && StudyOptions[0] && IdentityFlashcards[2])
         return true;
      else
         return false;
   }
   
   public static boolean IdentityFlashcardOption3Shuffle(int x,int y,boolean[] StudyOptions,boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)+153 && x < (WindowWidth/2)+218 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && StudyOptions[0] && IdentityFlashcards[2])
         return true;
      else
         return false;
   }
   
   public static boolean IdentityFlashcardOption4(int x,int y,boolean[] StudyOptions,boolean[] IdentityFlashcards){
      if(x > 15 && x < 121 && y > 161 && y < 175 && StudyOptions[0] && (IdentityFlashcards[0] == false))
         return true;
      else 
         return false;
   }
   
   public static boolean IdentityFlashcardOption4Flip(int x,int y,boolean[] StudyOptions,boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)+90 && x < (WindowWidth/2)+150 && y > (WindowHeight/2)+85 && y < (WindowHeight/2)+115 && StudyOptions[0] && IdentityFlashcards[3])
         return true;
      else
         return false;
   }

   public static boolean ExitIdentityFlashcardOption4(int x,int y,boolean[] StudyOptions,boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)-252 && x < (WindowWidth/2)-180 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && StudyOptions[0] && IdentityFlashcards[3])
         return true;
      else
         return false;
   }
   
   public static boolean IdentityFlashcardOption4Shuffle(int x,int y,boolean[] StudyOptions,boolean[] IdentityFlashcards){
      if(x > (WindowWidth/2)+153 && x < (WindowWidth/2)+218 && y > (WindowHeight/2)+68 && y < (WindowHeight/2)+92 && StudyOptions[0] && IdentityFlashcards[3])
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