public class Droid {
  int batteryLevel;
  
  Droid(){
    batteryLevel=100;
  }
  
  public void activate() {
    System.out.println("Droid Activated!");
    batteryLevel=batteryLevel-5;
    System.out.println("Battery level is: "+batteryLevel+" percent.");
  }
  
  public void chargeBattery(int hours){
    System.out.println("Droid Charging...");
    batteryLevel=batteryLevel+hours;
    
    if(batteryLevel>100){
      batteryLevel=100;
      System.out.println("Battery level is: "+batteryLevel+" percent.");
    }
    else{
      System.out.println("Battery level is: "+batteryLevel+" percent.");
    }
    }
  public int checkBatteryLevel(){
    return batteryLevel;
  }
  
  public void hover(int feet){
    if(feet>2){
      System.out.println("Error! I cannot hover above 2 feet");
    }
    else{
      System.out.println("Hover...");
      batteryLevel=batteryLevel-20;
      System.out.println("Battery level is: "+batteryLevel+" percent.");
    }
  }
    
    public static void main(String[] args) {
      Droid myDroid = new Droid();
      myDroid.activate();
      myDroid.chargeBattery(5);
      myDroid.hover(1);
      
    }
    
  }
  
  
  
  
  
  
