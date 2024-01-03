package busreservation;

public class Bus {
    private      int BusNo;
    private      int Capacity;
    private    boolean Ac;
          
          Bus(int busno,int Cap,boolean ac){
        	  this.BusNo=busno;
        	  this.Capacity=Cap;
        	  this.Ac=ac;
          }
          
     public  int getBusNo(){
        	  return BusNo;
          }
         
   public  void  setBusno(int busno) {
	   BusNo=busno;
    	   
       }
   public  int getCapacity(){
 	  return Capacity;
   }
  
public  void  set(int cap) {
	Capacity=cap;
	   
}
public  boolean getAc(){
	  return Ac;
}

public  void  setAc(boolean ac) {
  Ac=ac;}
  
  public void displayBusinfo(){
	  System.out.println(" BusNo : "  +  BusNo +  "  Bus Ac : "+ Ac + " Bus Capacity : "  +Capacity);
  }
 
}

