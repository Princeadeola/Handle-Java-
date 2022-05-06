package Week5.Meet;

 import java.util.ArrayList;
 public class Truck implements Fuelable {
   private String driver;
   private int range;
   private int capacity;
   private int weight;
   private int fuelGallons;
   private int tank1;
   private int tank2;
   private ArrayList<Pallet> cargo = new ArrayList<Pallet>();
    
   public Truck(){
     driver = "NA";
     range = 0;
     capacity = 0;
     weight = 0;
     fuelGallons = 0;
     tank1 = 50;
     tank2 = 50;
   }
   public Truck(String driver, int range, int capacity, int weight, int fuel){
     this.driver = driver;
     this.range = range;
     this.capacity = capacity;
     this.weight = weight;
     fuelGallons = fuel;
   }
   public Truck(String driver, int range, int capacity, int weight, int fuel, ArrayList<Pallet> cargo){
     this.driver = driver;
     this.range = range;
     this.capacity = capacity;
     this.weight = weight;
     fuelGallons = fuel;
     this.cargo = cargo;
   }

//   If Truck has two fuel tanks of 50 gallons each(a not uncommon occurrence) how
//   could you improve the implementation code for addFuel() for the truck?
   public void addFuel(int fuel){
     if (fuel <= tank1){
       tank1 = fuelGallons + fuel;
     }else if (tank1 == 50 && (fuel - tank1) != 0){
       tank2 = fuelGallons + fuel;
     }else {
       System.out.println("Both tanks are filled");
     }
   }
   public int getFuel(){
     return fuelGallons;
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

   public void setDriver(String driver){
     this.driver = driver;
   }
   public String getDriver(){
     return driver;
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
   private void setWeight(int weight){
     this.weight = weight;
   }
   public int getWeight(){
     return weight;
   }
 }