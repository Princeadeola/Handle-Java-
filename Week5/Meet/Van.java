package Week5.Meet;

 import java.util.ArrayList;
 public class Van {
   private int range;
   private int capacity;
   private ArrayList<Pallet> cargo = new ArrayList<Pallet>();
   
   public Van(){
     range = 0;
     capacity = 0;
   }
   public Van(int range, int capacity){
     this.range = range;
     this.capacity = capacity;
   }
   public Van(int range, int capacity, ArrayList<Pallet> cargo){
     this.range = range;
     this.capacity = capacity;
     this.cargo = cargo;
   }
   
   public boolean load(Pallet p){
     boolean fits;
     if ((capacity - p.getVolume()) > 0){
       fits = cargo.add(p);
       capacity -= p.getVolume();
     }
     else {
       fits = false;
     }
     return fits;  
   }
   
   public Pallet unload(Pallet p){
     int loc = cargo.indexOf(p);
     int vol = p.getVolume();
     capacity += vol;
     return cargo.remove(loc);     
   }

 }