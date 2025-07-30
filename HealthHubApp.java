import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileWriter; 
import java.io.IOException;
import java.util.Locale;
import java.io.FileNotFoundException;
import java.time.format.DateTimeParseException;

abstract class User {
    protected String name;
    protected String phoneNumber;
    protected String address;
    protected String password;
    protected String gender;

    public User(){

    }//Default Constructor

    public User(String name, String phoneNumber, String address, String password, String gender) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.password = password;
        this.gender = gender;
    }//constructor 

    public abstract void displayInfo();

     public void enterCredentials() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        setName(scanner.nextLine());
        System.out.print("Phone Number: ");
        setPhoneNumber(scanner.nextLine());
        System.out.print("Address: ");
        setAddress(scanner.nextLine());
        System.out.print("Password: ");
        setPassword(scanner.nextLine());
        System.out.print("Gender: ");
        setGender(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
               "Phone Number: " + phoneNumber + "\n" +
               "Address: " + address + "\n" +
               "Gender: " + gender;
    }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

     public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}//User


class Customer extends User {
    private int id;
    private static int count=0;
    private  ArrayList<BloodPressureRecord> BpList;
    private int advisedSystolic;
    private int advisedDiastolic;
    private ArrayList<Cart> cart;
    private Account account;

    public Customer(){

    }//default Constructor


    public Customer(String name, String phoneNumber, String address, String password, String gender, String acNum, double balance) {
        super(name, phoneNumber, address, password, gender);
        ++count;
        this.id=count;
        this.BpList = new ArrayList<>();
        this.cart= new ArrayList<>();
        this.account = new Account(acNum, balance);
        
    }//constructor

    public ArrayList<Cart> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Cart> cart) {
        this.cart = cart;
    }

    public int getId() {
        return id;
    }//getId

    public void setId(int id) {
        this.id = id;
    }//setId

    public int getAdvisedSystolic() {
        return advisedSystolic;
    }//getAdvisedSystolic

    public void setAdvisedSystolic(int advisedSystolic) {
        this.advisedSystolic = advisedSystolic;
    }//setAdvisedSystolic

    public int getAdvisedDiastolic() {
        return advisedDiastolic;
    }//getAdvisedDiastolic

    public void setAdvisedDiastolic(int advisedDiastolic) {
        this.advisedDiastolic = advisedDiastolic;
    }//setAdvisedDiastolic

    public Account getAccount(){
        return account;
    }//

    @Override
    public void displayInfo() {
        System.out.println("Customer Information:");
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Gender: " + gender);
        System.out.println();
    }//displayInfo

    public void personalization(){ 
        Scanner keyboard = new Scanner(System.in);
       

        System.out.println("Enter your doctor advised (normal) systolic pressure reading: ");

        int advised = keyboard.nextInt();

        while(advised<=0){

            System.out.println("Enter your docotr advised (normal) systolic pressure reading greater than zero: ");
            advised = keyboard.nextInt();

        }//while
        
        this.setAdvisedSystolic(advised);

        System.out.println("Enter your doctor advised (normal) diastolic pressure reading: ");

        advised = keyboard.nextInt();

         while(advised<=0){

            System.out.println("Enter your docotr advised (normal) diastolic pressure reading greater than zero: ");
            advised = keyboard.nextInt();

        }//while
        
        this.setAdvisedDiastolic(advised);

        System.out.println();

    }//personalization

    

    public void addBpRecord(){

        Scanner keyboard = new Scanner(System.in);
        

        System.out.println("Enter systolic pressure reading: ");
        int systolic = keyboard.nextInt();

        while(systolic<=0){

            System.out.println("Enter systolic pressure reading greater than zero: ");
            systolic = keyboard.nextInt();

        }//while

        System.out.println("Enter diastolic pressure reading: ");
        int diastolic = keyboard.nextInt();

        while(diastolic<=0){

             System.out.println("Enter diastolic pressure reading greater than zero: ");
              diastolic = keyboard.nextInt();

        }//while

        checkWarning(systolic,diastolic);

        BpList.add(new BloodPressureRecord(systolic,diastolic));
        System.out.println("Record Successfully Added.");
        displayBpRecords();

        System.out.println();
    }//add

    public void removeBpRecord(){  

        Scanner keyboard = new Scanner(System.in);

        if (!BpList.isEmpty()) {

        int number = 0;
        while(number<=0 || number>BpList.size()){

              System.out.println("Enter the record number you want to remove ( from 1 to " + BpList.size() + " ):" );
              number = keyboard.nextInt();

        }//while

        if (!BpList.remove( this.getBpRecord(number-1) ) ) {
            System.out.println("Failed to remove. Entered record does not exist.");
        } else {
            System.out.println("Successfully removed.");

        }//if

        displayBpRecords();


        } else {
            System.out.println("There are no added records. Kindly add a record first.");
        }//if
        System.out.println();

    }//remove

    public BloodPressureRecord getBpRecord(int index){      //check if we want to get by sys and dia
        return BpList.get(index);
    }//get record

    public void updateBpRecord(){      
       
        if (BpList.size()!=0) {
             System.out.println("Existing Records:");
            displayBpRecords();

        Scanner keyboard = new Scanner(System.in);

        int number = 0;
        while(number<=0 || number>BpList.size()){

              System.out.println("Enter the record number you want to update ( from 1 to " + BpList.size() + " ):" );
              number = keyboard.nextInt();

        }//while

        System.out.println("Enter the updated systolic pressure reading: ");
        int sys = keyboard.nextInt();

        while(sys<=0){

            System.out.println("Enter the updated systolic pressure reading greater than zero: ");
            sys = keyboard.nextInt();

        }//while

        getBpRecord(number-1).setSystolicMMHG(sys);

        System.out.println("Enter the updated diastolic pressure reading: ");
        int dia = keyboard.nextInt();

        while(dia<=0){

             System.out.println("Enter the updated diastolic pressure reading greater than zero: ");
              dia = keyboard.nextInt();

        }//while
       
        getBpRecord(number-1).setDiastolicMMHG(dia);

        checkWarning(getBpRecord(number-1).getSystolicMMHG(), getBpRecord(number-1).getDiastolicMMHG() );

        System.out.println("Record Successfully Updated.");
        displayBpRecords();

        System.out.println();

        } else {
            System.out.println("You cannot update any record as there are no existing records. Kindly add a record first.");
        }//if
        System.out.println();

    }//update bp record

    public void analyseRecords(){

        if (BpList.size()!=0) {

        Scanner keyboard = new Scanner(System.in);

        int sumSys=0;int sumDia=0;int count=0;
        boolean exit=false;
        String d;
        LocalDate givenDate;

        while(sumSys==0 && sumDia==0 && !exit){

            System.out.println("Enter correct date for which which you want to analyse your records. (Press E to exit)");
             d = keyboard.nextLine();

            if (!d.equalsIgnoreCase("e")) {
                
        try{

         givenDate = LocalDate.parse(d);


           for (BloodPressureRecord temp : BpList) {
            if (temp.getDate().equals(givenDate)) {
                sumSys += temp.getSystolicMMHG();
                sumDia += temp.getDiastolicMMHG();
                ++count;
            }//if
        }//for

     
         }catch(DateTimeParseException e){
            System.out.println("Error Invalid Format.");
        }//try-catch

            } else {
                exit=true;
            }//if

        }//while


        if (sumSys!=0 && sumDia!=0) {
            
        
        int averageSys = sumSys/count;
        int averageDia = sumDia/count; 

        System.out.println("Average Systolic Reading: " + averageSys);
        System.out.println("Average Diastolic Reading: " + averageDia);

        } else{
            System.out.println("Exited Successfully from analysis of records.");
        }//if

        } else {
            System.out.println("There are no added records. To analyse your records, kindly first add a record.");
        }//if

        System.out.println();

      
    }//analyse

    public void readFromFile(String fileName) throws IOException{

        File file = new File(fileName);

        if (!file.exists()) {
    
            if (file.createNewFile()) {
               // System.out.println("New file created: " + fileName);
            } else {
                System.out.println("Failed to create new file.");
                return;
            }//if

        }//if
          
        Scanner sc = new Scanner(file);    

        while (sc.hasNextLine()){
            String line = sc.nextLine();

            if (!line.isEmpty()) {
                
            String[] spliting = line.split(",");

            if (spliting.length==4) {

               try{ 
                

                 BloodPressureRecord bp = new BloodPressureRecord(Integer.parseInt(spliting[0]) , Integer.parseInt(spliting[1]) , LocalDate.parse(spliting[2]) , LocalTime.parse(spliting[3]) );

                 BpList.add(bp);

                }catch(NumberFormatException e){
                    System.out.println("Error line: " + line + " , " + e);
                }catch(DateTimeParseException e){
                    System.out.println("Error line: " + line + " , " + e);
                }//catch

            } else {
                System.out.println("Invalid Format.");
            }//if

            } else {
                System.out.println("Line empty.");
            }//if

        }//while

        sc.close();

    }//readFromFile

    public void writeToFile(String fileName) throws IOException{

        try(FileWriter fw = new FileWriter(fileName) ){

        for (BloodPressureRecord temp : BpList) {
            fw.write(temp.getSystolicMMHG()  + "," + temp.getDiastolicMMHG() + "," + temp.getDate() + "," + temp.getTime());
            fw.write("\r\n");       //to move to next line
        }//for

        }//try   

    }//writeToFile

    public void checkWarning(int systolic, int diastolic){
        System.out.println();

        if (this.getAdvisedSystolic()!=0 && this.getAdvisedDiastolic() !=0) {

        if (systolic==this.getAdvisedSystolic() && diastolic==this.getAdvisedDiastolic()) {
                
        } else {   
        
        if (systolic>=this.advisedSystolic -10 && systolic<=this.advisedSystolic + 10 && diastolic>=this.advisedDiastolic -10 && diastolic<=this.advisedDiastolic + 10 ) {
            System.out.println("LOW LEVEL WARNING");
        
        } else if (systolic>=this.getAdvisedSystolic() - 20 && systolic<=this.getAdvisedSystolic() + 20 && diastolic>=this.getAdvisedDiastolic() -20 && diastolic<=this.getAdvisedDiastolic() + 20) {
                System.out.println("MEDIUM LEVEL WARNING");
                    
        } else {
            System.out.println("HIGH LEVEL WARNING");

        }//IF

            System.out.println("Entered systolic " + systolic + " out of range from advised systolic " + this.getAdvisedSystolic() +" and entered diastolic " + diastolic + " out of range from advised diastolic " + getAdvisedDiastolic() + ".");

        }//if  

        }//if  

        System.out.println();

    }//checkWarning

    public void displayBpRecords(){
        if (BpList.size()!=0) {
            
        int count=1;
        for (BloodPressureRecord temp  : BpList) {
            System.out.println("Record#" + count);
            temp.display();
            ++count;
            System.out.println();
        }//for

        } else {
            System.out.println("You have no added records.");
        }//if
        System.out.println();
    }//display

    public void runningBloodTestFeature() throws IOException {

        this.readFromFile(this.getId()+"ID.txt");
        Scanner keyboard = new Scanner(System.in);

        //if (this.getAdvisedSystolic()==0 && this.getAdvisedDiastolic()==0) {

        System.out.println("BLOOD PRESSURE RECORD:\nDo you want to enter doctor advised blood pressure readings? Press 1 for YES and 2 for NO.");
        int input = keyboard.nextInt();

        while(input!=1 && input!=2){
            System.out.println("Press 1 for Yes and 2 for NO.");
            input = keyboard.nextInt();
        }//while

        System.out.println();

        if (input==1) {
        this.personalization();   
        }//if

       // }//if

        this.displayBpRecords();

        boolean exit=false;

        while(!exit){

        System.out.println("1. Add new record.\n2. Update existing record.\n3. Remove existing record.\n4. Get analysis of records for a specific date.\nEnter 0 to exit.");
        input = keyboard.nextInt();


         while(input<0 || input>4){
            System.out.println("Enter correct value between 1 and 4 again.");
            input = keyboard.nextInt();
        }//while

        System.out.println();

        if (input==0) {
            exit=true;
            System.out.println("Exited Successfully from Blood Pressure Record.");
        }//if

        if (input==1) {
         this.addBpRecord();  
        }//if

        if (input==2) {
         this.updateBpRecord();
        }//if

        if (input==3) {
         this.removeBpRecord(); 
        }//if

        if (input==4) {
         this.analyseRecords();
        }//if   

        }//while     

        this.writeToFile(this.getId()+"ID.txt");

    }//runningBloodTestFeature

    public void add(int quantity, Item i, String date, String time){
        cart.add(new Cart(i,quantity, date, time));
        System.out.println("Successfully Added.");
        System.out.println();
    }//add

    public void display() {
        System.out.println("Customer Details:");
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("ID: " + getId());
        System.out.println();
    }//
 

    public static void main(String[] args)  {
        Customer s = new Customer("wd","re","sd","ds"," fd", "1", 200);

        try{
            s.runningBloodTestFeature();
        } catch(IOException e){
            System.out.println( "Error message: "+e.getMessage() );
        }//try
    
    }//main

}//customer
class Doctor extends User {
    private int id = 0;
    private int experience;
    private double rating;
    private double rate;
    private String category;
    private ArrayList<Appointment> appointment;
    private PriorityQueue priorityQueue;
     private String[][] slots;


                                //    {
                                // {"Date/Time", "0900", "1000", "1100", "1200", "1300"},
                                // {"15 Feb", "available", "available", "available", "available", "available"},
                                // {"16 Feb", "available", "available", "available", "available", "available"},
                                // {"17 Feb", "available", "available", "available", "available", "available"},
                                // {"18 Feb", "available", "available", "available", "available", "available"},
                                // {"19 Feb", "available", "available", "available", "available", "available"},
                                // {"20 Feb", "available", "available", "available", "available", "available"}

                                // };


     Doctor(){
        super();
        id++;
        slots = new String[15][10];
    }

     Doctor( int id, String name, String phoneNumber, String address, String password, String gender, int experience, double rating, double rate, String category) {
        super(name, phoneNumber, address, password, gender);
        this.id = id;
        this.experience = experience;
        this.rating = rating;
        this.rate = rate;
        this.category = category;
        this.appointment = new ArrayList<Appointment>();
        this.priorityQueue = new PriorityQueue();
        slots = new String[15][10];
        fill2DArray();
    }//Constructor

    public void fill2DArray(){

        LocalDate currentDate = LocalDate.now();

        // Convert LocalDate to String
        String dateString = currentDate.toString();

       LocalDate futureDate;
       String date = "";
       String month = "";
       int monthInt = 0;
       int dateInt = 0;

       LocalTime nextSlot;
       String formattedSlot = "";

        LocalTime currentTime = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        // Format the current time
        String formattedTime = currentTime.format(formatter);

        
        String[] array = {"0900", "0920", "0940", "1000","1020", "1040", "1900" , "1920", "1940" };

        slots[0][0] ="D/T";

        for (int i=1;  i<slots.length ; i++) {

                futureDate = currentDate.plusDays(i-1);
                monthInt = futureDate.getMonthValue();
                month = monthInt + "";
                dateInt = futureDate.getDayOfMonth();
                date = dateInt + "";
                slots[i][0] =  month+ "/" + date;
            
           int a =0;
        for (int j=1 ; j<slots[i].length ; j++ ) {
            
            slots[0][j] = array[a];
            a++;

            if (j>=0 ) {
                slots[i][j] = "O";

                if (converting(formattedTime) >  converting(slots[0][j]) ) {
                slots[1][j] = "X";
                }//if

            }//if
               
         }//for

        }//for

        // for (int i=0 ; i<slots.length; i++) {
        //     for (int j=0 ;j<slots[i].length ; j++) {
        //         if (i==0 && j==0) {
        //             System.out.print(slots[0][0] + "   ");
        //         }else{
        //         System.out.print(slots[i][j] + " \t  ");
        //         }//if
        //     }//for
        //     System.out.println();
        // }//for

        

    }//fill2DArray()

     public int converting(String input){

        char c = ' ';
        String str = "";
        for (int i =0 ; i<input.length() ; i++) {
            c = input.charAt(i);
            if (Character.isDigit(c)) {
                str += c;
            }//if
        }//for

        int num = Integer.parseInt(str);

        return num;

    }//converting()

    //  public void removeAppointments(Appointment app, String str){

    //     Node current = head;

    //     if (str.equals("cancel")) {
    //         for (int i=0 ; i<priorityQueue.getSize(); i++) {
    //             while (current.data.getState().equals("tbh")) {
    //                 appointment.add(current.dequeue());
    //                 current = current.next;
    //             }//while
               
    //         }//for
    //     }//if

    // }//removeAppointments()

    public void appointmentHeld(Appointment app){
         System.out.println("----------------------");
        System.out.println("APPOINTMENT HELD");
        System.out.println("----------------------");
        System.out.println("\nTime is: " + app.getTime());
        //appointment.setState("cancel");

        appointment.add(app);

        System.out.println("It is the turn of:" + app.getCustomer().getName());

        LocalTime currentTime = LocalTime.now();

        LocalTime newTime = currentTime.plusMinutes(20);

        System.out.println("It is "+ newTime + ".\nYour time is up.");
        priorityQueue.dequeue();
        System.out.println("---------------------------------------------------------");

    }//appointmentHeld()

    public void enterDocCredentials() {
        Scanner key = new Scanner(System.in);

        System.out.println("Enter doctor details:");
        enterCredentials();

        System.out.print("Experience (in years): ");
        setExperience(key.nextInt());
        System.out.print("Rating: ");
        setRating(key.nextDouble());
        System.out.print("Rate (per hour): ");
        setRate(key.nextDouble());

    }//enterDocCredentials()




    @Override
    public void displayInfo() {
        System.out.println("Doctor Information:");
        System.out.println("Name: " + getName());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Address: " + getAddress());
        System.out.println("Gender: " + getGender());
        System.out.println("Experience: " + getExperience() + " years");
        System.out.println("Rating: " + getRating());
        System.out.println("Rate: $" + getRate() + " per hour");
    }//

     public void displayDoctorInfo() {
        System.out.println("Doctor Information:");
        System.out.println("Name: " + getName());
        System.out.println("Category: " + getCategory());
        System.out.println("Phone Number: " + getPhoneNumber());
        //System.out.println("Address: " + getAddress());
        //System.out.println("Gender: " + getGender());
        System.out.println("Experience: " + getExperience() + " years");
        System.out.println("Rating: " + getRating());
        System.out.println("Rate: $" + getRate() + " per hour");
    }//

    public int getID(){
        return id;
    }


     public String getName() {
        return name;
    }//

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Getter methods for address
    public String getAddress() {
        return address;
    }

    // Getter methods for password
    public String getPassword() {
        return password;
    }

    // Getter methods for gender
    public String getGender() {
        return gender;
    }

    // Getter methods for experience
    public int getExperience() {
        return experience;
    }

    // Getter methods for rating
    public double getRating() {
        return rating;
    }

    public double getRate() {
        return rate;
    }

     public String getCategory() {
        return category;
    }

    public PriorityQueue getPriorityQueue(){
        return priorityQueue;
    }

    public void setID(int id){
        this.id = id;
    }

    public void setExperience(int experience){
        this.experience = experience;
    }

    public void setRate(double rate){
        this.rate= rate;
    }

    public void setRating(double rating){
        this.rating =  rating;
    }

    public String toString(){

        return "Name: " + getName() + ", Category: " + getCategory() + ", Phone Number: " + getPhoneNumber()  + ", Address: " + getAddress() + ", Gender: " + getGender() + ", Experience: " + getExperience() + ", Rating: " + getRating() + ", Rate: $" + getRate(); 
    }

    public String[][] get2Array(){

        return slots;
    }

    public void displayPriorityQueue(){

        if (priorityQueue.getSize() == 0 ) {

            System.out.println("You have no appointments for today");
            
        }else{
            System.out.println("Appointments Passed:");

           if (appointment.size() == 0) {
               System.out.println("No appointment has passed yet.");
           }else{
               
                for (Appointment temp : appointment ) {
                    temp.displayApp();
                }//for
           }//if

           System.out.println("Appointments to be conducted:");
             priorityQueue.display();
        }//if

       

    }//displayPriorityQueue()


    // public  void displaySlots(){

    //     for (int i=0 ; i<slots.length ; i++) {
    //         for (int j=0 ; j<slots[i].length ; j++) {
    //             System.out.print(slots[i][j] +  "     ");
    //         }//inner
    //         System.out.println();
    //     }//outer


    // }//displaySlots()



}//Doctor



// class HealthHubApp {
//     public static void main(String[] args) {
//         ArrayList<User> users = new ArrayList<>();
//         Scanner scanner = new Scanner(System.in);

//         Customer c = new Customer("","","","","","",100.99);

//         // Adding a doctor

//         Doctor doctor = new Doctor();
//         users.add(doctor);

//         doctor.fill2DArray();
//         /

//     }
// }
