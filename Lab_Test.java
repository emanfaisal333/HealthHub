public class Lab_Test{

  //Fields
  private String testName;
  private boolean SampleRequired;
  private double price;
  private boolean availability;
  private int turnAroundTime;
  private String sample;

  //Default-Constructor
  public Lab_Test(){
  	this.setTestName("null");
  	this.setSampleRequired(true);
  	this.setPrice(0.0);
  	this.setAvailability(true);
  	this.setTurnAroundTime(0);
  	this.setSample("null");
  }//default-cons	

  //6-Arg-Constructor
  public Lab_Test(String testName,boolean SampleRequired,double price,boolean
                  availability,int turnAroundTime,String sample){
   this.testName = testName;
   this.SampleRequired = SampleRequired;
   this.price = price;
   this.availability = availability;
   this.turnAroundTime = turnAroundTime;
   this.sample = sample;	
  }//cons	

  //Setters
  public void setTestName(String testName){
   this.testName = testName;
  }//setTestName

  public void setSampleRequired(boolean SampleRequired){
   this.SampleRequired = SampleRequired;
  }//setSampleRequired

  public void setPrice(double price){
   this.price = price;
  }//setPrice

  public void setAvailability(boolean availability){
   this.availability = availability;
  }//setAvailability

  public void setTurnAroundTime(int turnAroundTime){
   this.turnAroundTime = turnAroundTime;
  }//setTurnAroundTime

  public void setSample(String sample){
   this.sample = sample;
  }//setSample
  
  //Getters
  public String getTestName(){
   return testName;
  }//getTestName

  public boolean getSampleRequired(){
   return SampleRequired;
  }//getSampleRequired

  public double getPrice(){
   return price;
  }//getPrice

  public boolean getAvailability(){
   return availability;
  }//getAvailability

  public int getTurnAroundTime(){
   return turnAroundTime;
  }//getTurnAroundTime

  public String getSample(){
   return sample;
  }//getSample

  //Display
  public void display(){
   System.out.println("TestName: " + getTestName());
   System.out.println("SampleRequired: " + getSampleRequired());
   System.out.println("Price: " + getPrice());
   System.out.println("Availability: " + getAvailability());
   System.out.println("TurnAroundTime: " + getTurnAroundTime());
   System.out.println("Sample: " + getSample());
  }//display

  //toString
  public String toString(){
   return "TestName:" + getTestName() + "SampleRequired:" + getSampleRequired() +
          "Price:" + getPrice() + "Availability:" + getAvailability() + "TurnAroundTime:" +
           getTurnAroundTime() + "Sample:" + getSample();
  }//toString
  

}//class