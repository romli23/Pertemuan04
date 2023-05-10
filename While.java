
public class While {
     public static void main(String [] args){
         int isigelas = 0;
         int penuh = 225;
         
         System.out.println("Isi gelas sekarang : " + isigelas + "ml");
         System.out.println("Isi gelas ketika Penuh : " + penuh + "ml");
         
         while(isigelas != penuh){
             isigelas++;
             System.out.println("Sedang mengisi gelas..");
             System.out.println("Isi gelas sekarang : " + isigelas+ "ml");
             
         }
         System.out.println("Finale : Isi gelas sekarang : " + isigelas + "ml");
     }   
}
