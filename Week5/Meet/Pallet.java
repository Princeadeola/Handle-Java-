package Week5.Meet;

 public class Pallet{
   private static int num = 1000;
   private int id;
   private int height;
   private int width;
   private int depth;
   private String origin;
   private String destination;
   
   public Pallet(){
     id = num+1;
     num++;
     height = 0;
     width = 0;
     depth = 0;
     origin = "NA";
     destination = "NA";
   }
   public Pallet(int h, int w, int d, String o, String dest){
     id = num+1;
     num++;
     height = h;
     width = w;
     depth = d;
     origin = o;
     destination = dest;
   }
   
   public int getVolume(){
     return height * width * depth;
   }
   public int getID(){
     return id;
   }
   public String getDimensions(){
     String dim = "H: " + height + " W: " + width + " D: " + depth;
     return dim;
   }
   public String getOrigin(){
     return origin;
   }
   public String getDestination(){
     return destination;
   }
   public void setHeight(int h){
     height = h;
   }
   public void setWidth(int w){
     width = w;
   }
   public void setDepth(int d){
     depth = d;
   }
   public void setOrigin(String o){
     origin = o;
   }
   public void setDestination(String d){
     destination = d;
   }

   public String toString(){
     String label = "PalletID: " + this.getID() + "\nOrigin: " +
             this.getOrigin() + "\nDestination: " + this.getDestination() +
             "\nDim: " + this.getDimensions();
     return label;
   }
 }