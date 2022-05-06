package Week5.Meet;

 import java.util.ArrayList;
 public class Boat implements Fuelable {
   private String captain;
   private int range;
   private int capacity;
   private int topSpeed;
   private int fuelGallons;
   private ArrayList<Pallet> cargo = new ArrayList<Pallet>();
    
   public Boat(){
     captain = "NA";
     range = 0;
     capacity = 0;
     topSpeed = 0;
     fuelGallons = 0;
   }
   public Boat(String captain, int range, int capacity, int speed, int fuel){
     this.captain = captain;
     this.range = range;
     this.capacity = capacity;
     topSpeed = speed;
     fuelGallons = fuel;
   }
   public Boat(String captain, int range, int capacity, int speed, int fuel, ArrayList<Pallet> cargo){
     this.captain = captain;
     this.range = range;
     this.capacity = capacity;
     topSpeed = speed;
     fuelGallons = fuel;
     this.cargo = cargo;
   }
//If the boat can hold 100 gallons of diesel, how can you improve the implementation
//of addFuel() so it is impossible to add fuel over the 100 gallon limit?
   public void addFuel(int fuel){
       if (fuel < 100) {
           fuelGallons += fuel;
           System.out.println("Fuel topped: " + fuelGallons);
       }else{
           System.out.println("100 Gallon Limit");
       }
   }
   public int getFuel(){
     return fuelGallons;
   }
   
   public String dock(){
     return "Docking procedures go here";
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
   public void setCaptain(String cap){
     captain = cap;
   }
   public String getCaptain(){
     return captain;
   }
   public void setRange(int range){
     this.range = range;
   }
   public int getRange(){
    return range;
   }
   public void setCapacity(int capacity){
     this.capacity = capacity;
   }
   public int getCapacity(){
     return capacity;
   }  
   private void setTopSpeed(int speed){
     topSpeed = speed;
   }
   public int getTopSpeed(){
     return topSpeed;
   }
 }