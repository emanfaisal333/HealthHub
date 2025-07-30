import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class RunCompany {

	 public static void main(String[] args){

     // Scanner key=new Scanner(System.in);
     //     boolean flag = true;

     // while(flag){

     //    System.out.println("1. Medicine");
     //    System.out.println("2. Lab test");
     //    System.out.println("3. Doctor Consultation");
     //    System.out.println("4. Exit");
        
     //    System.out.println("Enter input(1,2,3,4)");
     //    int input=key.nextInt();

     //    if (input==4) {
     //        flag = false;
     //    } else {
     //      System.out.println("hi");


     //    }//if

     //    }//while

     // ArrayList<Lab_Test> bloodTests = new ArrayList<>(Arrays.asList(
     //            new Lab_Test("Blood Sugar", false, 30.0, 2, "Blood Sample", "Blood" ,1),
     //            new Lab_Test("CBC", true, 30.0, 2, "Blood Sample", "Blood", 1),
     //            new Lab_Test("Insulin Test", true, 50.0, 1, "Blood Sample", "HeartHealth", 1),
     //            new Lab_Test("TBH", true, 50.0, 1, "Blood Sample", "Thyroid", 1),
     //            new Lab_Test("TBC", true, 50.0, 1, "Blood Sample", "Thyroid", 1),
     //            new Lab_Test("TBIC", true, 50.0, 1, "Blood Sample", "Thyroid", 1),
     //            new Lab_Test("Urea", true, 30.0, 1, "Blood Sample", "Thyroid", 1),
     //            new Lab_Test("Uric acid", true, 60.0, 1, "Blood Sample", "Thyroid", 1),
     //            new Lab_Test("Cholesterol", true, 50.0, 1, "Blood Sample", "Thyroid", 1),
     //            new Lab_Test("Calcium", true, 50.0, 1, "Blood Sample", "Thyroid", 1),
     //            new Lab_Test("CBC", true, 50.0, 1, "Blood Sample", "Thyroid", 1),
     //            new Lab_Test("Liver", true, 50.0, 1, "Blood Sample", "Thyroid", 1)
     //    ));
      Admin admin = new Admin("Ali", "0300444000", "Alipur chowk", "sss", "Male", "AC101",0);
      DoublyLinkedList medicines = new DoublyLinkedList();

        medicines.add(new Tablet("Panadol", "Manufacturer A", 30.99, 6.00, "Eye, Nose, Ear Medicines", "", "", 5, 500));
        medicines.add(new Tablet("Hevert", "Manufacturer A", 78.99, 6.00, "Eye, Nose, Ear Medicines", "", "", 5, 450));
        medicines.add(new Tablet("debrox", "Manufacturer A", 123.99, 6.00, "Eye, Nose, Ear Medicines", "", "", 5, 410));
        medicines.add(new Tablet("Azhtiromycin", "Manufacturer A", 35.99, 6.00, "Eye, Nose, Ear Medicines", "", "", 5, 223));

        medicines.add(new Syrup("Parker", "Manufacturer B", 245.99, 200.0, "Eye, Nose, Ear Medicines", "", "", 5, "Honey", 1.25));
        medicines.add(new Syrup("Floradix", "Manufacturer B", 160.99, 200.0, "Eye, Nose, Ear Medicines", "", "", 5, "Herbal", 1.25));
        medicines.add(new Syrup("T-Day", "Manufacturer B", 150.99, 200.0, "Eye, Nose, Ear Medicines", "", "", 5, "Orange", 1.25));
        medicines.add(new Syrup("Azee", "Manufacturer B", 145.99, 200.0, "Eye, Nose, Ear Medicines", "", "", 5, "peppermit", 1.25));

        medicines.add(new Tablet("Gesto tablet", "Manufacturer C", 290.99, 3.44, "Gastrointestinal Tract Medicines", "", "", 5, 300));
        medicines.add(new Tablet("Gutain", "Manufacturer C", 140.99, 3.44, "Gastrointestinal Tract Medicines", "", "", 5, 340));
        medicines.add(new Tablet("Caborin", "Manufacturer C", 257.99, 3.44, "Gastrointestinal Tract Medicines", "", "", 5, 220));
        medicines.add(new Tablet("Ulsin", "Manufacturer C", 185.99, 3.44, "Gastrointestinal Tract Medicines", "", "", 5, 380));

        medicines.add(new Syrup("maxolan", "Manufacturer B", 245.99, 200.0, "Gastrointestinal Tract Medicines", "", "", 5, "Honey", 1.25));
        medicines.add(new Syrup("Domel", "Manufacturer B", 265.99, 200.0, "Gastrointestinal Tract Medicines", "", "", 5, "herba", 1.25));
        medicines.add(new Syrup("Colic", "Manufacturer B", 145.99, 200.0, "Gastrointestinal Tract Medicines", "", "", 5, "Honey", 1.25));
        medicines.add(new Syrup("Zygest", "Manufacturer B", 225.99, 200.0, "Gastrointestinal Tract Medicines", "", "", 5, "orange", 1.25));

        medicines.add(new Tablet("Cardiovas", "Manufacturer D", 256.99, 250.0, "Cardiovascular System Medicines", "", "", 5, 300));
        medicines.add(new Tablet("Neo cardio", "Manufacturer D", 367.99, 250.0, "Cardiovascular System Medicines", "", "", 5, 300));
        medicines.add(new Tablet("Cardiac", "Manufacturer D", 350.99, 250.0, "Cardiovascular System Medicines", "", "", 5, 300));
        medicines.add(new Tablet("Cardia fit", "Manufacturer D", 170.99, 250.0, "Cardiovascular System Medicines", "", "", 5, 300));

        medicines.add(new Syrup("Cardicus", "Manufacturer B", 245.99, 200.0, "Cardiovascular System Medicines", "", "", 5, "Honey", 1.25));
        medicines.add(new Syrup("Nucal Z", "Manufacturer B", 265.99, 200.0, "Cardiovascular System Medicines", "", "", 5, "herba", 1.25));
        medicines.add(new Syrup("Cipzer", "Manufacturer B", 145.99, 200.0, "Cardiovascular System Medicines", "", "", 5, "Honey", 1.25));
        medicines.add(new Syrup("Rugstrol", "Manufacturer B", 225.99, 200.0, "Cardiovascular System Medicines", "", "", 5, "orange", 1.25));

        medicines.add(new Tablet("Lepti", "Manufacturer E", 414.99, 400.9, "Central Nervous System Medicines", "", "", 5, 400));
        medicines.add(new Tablet("DV lapram", "Manufacturer E", 314.99, 400.9, "Central Nervous System Medicines", "", "", 5, 460));
        medicines.add(new Tablet("DV Clanoz", "Manufacturer E", 214.99, 400.9, "Central Nervous System Medicines", "", "", 5, 490));
        medicines.add(new Tablet("Sert", "Manufacturer E", 114.99, 400.9, "Central Nervous System Medicines", "", "", 5, 500));

        medicines.add(new Syrup("Dsris", "Manufacturer B", 245.99, 200.0, "Central Nervous System Medicines", "", "", 5, "Honey", 1.25));
        medicines.add(new Syrup("Novamin", "Manufacturer B", 160.99, 200.0, "Central Nervous System Medicines", "", "", 5, "Herbal", 1.25));
        medicines.add(new Syrup("Brufin", "Manufacturer B", 150.99, 200.0, "Central Nervous System Medicines", "", "", 5, "Orange", 1.25));

        //medicines.displayInfo();

          String[] values = {"A", "B", "C", "D", "L"};

          String[] str = {"Focus on a well-rounded diet that includes a variety of nutrient-dense foods from all food groups to support overall health and well-being. Incorporate plenty of fruits, vegetables, whole grains, lean proteins, and healthy fats into your meals.", 
          "Include foods rich in omega-3 fatty acids, such as fatty fish, flaxseeds, and chia seeds, to support brain health and cognitive function. Consume a variety of fruits and vegetables rich in antioxidants to protect brain cells from oxidative stress.",
           "Emphasize a diet rich in fruits, vegetables, whole grains, lean proteins, and healthy fats like olive oil, nuts, and seeds to support heart health. Limit sodium intake and opt for low-sodium alternatives to support heart health and blood pressure regulation.", 
           "Focus on a Mediterranean-style diet rich in fruits, vegetables, whole grains, lean proteins, and healthy fats to support heart health and brain health. Include foods high in antioxidants like dark chocolate, berries, and green leafy vegetables to promote overall cardiovascular and nervous system health.", 
           "Focus on easily digestible foods like bananas, rice, applesauce, and toast (BRAT diet) to soothe the digestive system. Incorporate probiotic-rich foods like yogurt, kefir, and kombucha to promote gut health" , 
           "Incorporate easily digestible foods like bananas, rice, applesauce, and toast (BRAT diet) to soothe the digestive system while supporting overall brain health. Include foods rich in magnesium, such as nuts, seeds, leafy greens, and whole grains, to support both digestive and nervous system function." , 
           "Emphasize a diet rich in fiber from fruits, vegetables, whole grains, and legumes to support digestive health and heart health. Include foods that help reduce inflammation, such as fatty fish, olive oil, nuts, seeds, and colorful fruits and vegetables." , 
           "Incorporate a Mediterranean-style diet featuring olive oil, nuts, seeds, whole grains, fish, and plenty of fruits and vegetables to support digestive health, heart health, and brain health. Include fermented foods like sauerkraut and kimchi to support gut health and promote overall well-being." , 
           "Consume a variety of colorful fruits and vegetables rich in vitamins A, C, and E to support eye health. Include foods high in omega-3 fatty acids, such as fatty fish, flaxseeds, and walnuts, to support overall eye health." , 
           "Focus on foods that support brain health and cognitive function, such as fatty fish rich in omega-3 fatty acids, blueberries, and walnuts. Include foods high in vitamin B12, such as meat, fish, eggs, and dairy, to support nervous system health." , 
           "Include foods rich in antioxidants like berries, citrus fruits, and leafy greens to support eye health and heart health. Incorporate heart-healthy fats from sources like fatty fish, nuts, seeds, and avocado." , 
           "Emphasize a diet rich in colorful fruits and vegetables, nuts, seeds, and fatty fish to support eye health, heart health, and brain health. Include foods high in fiber and antioxidants to promote gastrointestinal health and overall well-being." , 
           "Consume foods rich in vitamin A and beta-carotene, such as carrots, sweet potatoes, and dark leafy greens, to support eye health. Incorporate probiotic-rich foods like yogurt, kefir, and sauerkraut to promote gastrointestinal health." , 
           "Focus on a diet that includes probiotic-rich foods like yogurt and fermented vegetables to support gut health and overall well-being. Incorporate foods high in omega-3 fatty acids, such as salmon and chia seeds, to support brain health and cognitive function." , 
          "Consume foods rich in antioxidants, such as berries, to support eye health, digestive health, and heart health. Include fiber-rich foods like beans, lentils, and whole grains to promote gastrointestinal health and cardiovascular health." , 
           "Emphasize a balanced diet rich in fruits, vegetables, whole grains, lean proteins, and healthy fats to support overall health and well-being. Include foods with a variety of nutrients, such as vitamins A, C, E, B vitamins, omega-3 fatty acids, antioxidants, and fiber."
       };


       // ArrayList<Doctor> d1 = new ArrayList<Doctor>(Arrays.asList(new Doctor(1,"Alisha Riaz","03115057777", "Cantt", "Stringpassword", "Female", 8, 4.5, 1800, "Cardiologist","",99.99),
       //                                                              new Doctor(2,"Haris Ahmad","03059999911", "address", "password", "Male", 10, 4, 1500, "Cardiologist","",99.99),
       //                                                              new Doctor(3,"Alia Nadeem","03001111111", "Rah Wali", "alia123", "Female", 5, 4, 1100, "Cardiologist","",99.99), 
       //                                                              new Doctor( "name","phoneNumber", "address", "String password", "String gender", 2,3.9, 1200, "Cardiologist","",99.99),
       //                                                              new Doctor("Anna","phoneNumber", "address", "String password", "Female", 2,3, 1500,  "Dermatologist","",99.99),
       //                                                              new Doctor("Ali Shah","03059999911", "Cantt", "password", "Male", 6, 3, 1500, "Dermatologist","",99.99),
       //                                                              new Doctor( "Amna","phoneNumber", "address", "String password", "String gender", 2,3.9, 4, "Dermatologist","",99.99) ,
       //                                                              new Doctor( "Sahil Khan","03225598000", "DC Road", "sahil123", "Male", 5,4.7, 1400, "Physician","",99.99),
       //                                                              new Doctor( "Riaz Ali Shah","0322699004", "Warirabad", "noPassword", "Male", 15,4.5, 1500, "Physician","",99.99),
       //                                                              new Doctor("Lina","03007001222", "Garden Town", "String password", "String gender", 2,3, 4, "Physician","",99.99) ) );

        
       ArrayList<Customer> c = new ArrayList<Customer>(Arrays.asList( new Customer("nadiaa","Nadia Ali","03237800012","DC Colony","nadia123","Female","ACCOUNT98765",500.99) , 
       	new Customer("ikhan","Irum Khan","03222543987","Civil Lines","khan123","Female","ACCOUNT32145",899976.99) , 
       	new Customer("sBUTT","Saad Butt","03226061234","DC Road","butt999","Male","ACCOUNT76123",239.99) , 
       	new Customer("ShaAli","Shahid Ali","03234311123","City Housing","sa987hl","Male","ACCOUNT87123",10.87) ));


       ArrayList<ArrayList<Doctor>> doctor = new ArrayList<ArrayList<Doctor>>(Arrays.asList(   new ArrayList<Doctor>(Arrays.asList(new Doctor("Alisha Riaz","03115057777", "Cantt", "Stringpassword", "Female", 8, 4.5, 1800, "Cardiologist","",99.99),
                                                                    new Doctor("Haris Ahmad","03059999911", "address", "password", "Male", 10, 4,  1500, "Cardiologist","",99.99),
                                                                    new Doctor("Alia Nadeem","03001111111", "Rah Wali", "alia123", "Female", 5, 4, 1100, "Cardiologist","",99.99), 
                                                                    new Doctor( "Babar Riaz","0322111444", "Sialkot", "babar1", "Male", 2,3.9, 1200, "Cardiologist","",99.99))) ,  
                                                                     new ArrayList<Doctor>(Arrays.asList(new Doctor("Anna","phoneNumber", "address", "String password", "Female", 2,3, 1500,  "Dermatologist","",99.99),
                                                                    new Doctor("Ali Shah","03059999911", "Cantt", "password", "Male", 6, 3, 1500, "Dermatologist","",99.99),
                                                                    new Doctor( "Amna","phoneNumber", "address", "String password", "String gender", 2,3.9, 4, "Dermatologist","",99.99))),  
                                                                    new ArrayList<Doctor>(Arrays.asList(new Doctor( "Sahil Khan","03225598000", "DC Road", "sahil123", "Male", 5,4.7, 1400, "Physician","",99.99),
                                                                    new Doctor( "Riaz Ali Shah","0322699004", "Warirabad", "noPassword", "Male", 15,4.5, 1500, "Physician","",99.99),
                                                                    new Doctor( "Lina","03007001222", "Garden Town", "String password", "String gender", 2,3, 4, "Physician","",99.99))),  
                                                                    new ArrayList<Doctor>(Arrays.asList(  new Doctor( "Lina","03007001222", "Garden Town", "String password", "String gender", 2,3, 4, "Neurologist","",99.99) ))  ));

       Scanner scanner = new Scanner(System.in);

        Company company = new Company(medicines,doctor,c,values,str, admin);

        // Adding lab tests in a sorted manner
        company.addSorted(new Lab_Test("Blood Sugar", false, 30.0, 2, "Blood Sample", "Blood", 1));
        company.addSorted(new Lab_Test("CBC", true, 30.0, 2, "Blood Sample", "Blood", 1));
        company.addSorted(new Lab_Test("Insulin Test", true, 50.0, 1, "Blood Sample", "HeartHealth", 1));
        company.addSorted(new Lab_Test("TBH", true, 50.0, 1, "Blood Sample", "Thyroid", 1));
        company.addSorted(new Lab_Test("TBC", true, 50.0, 1, "Blood Sample", "Thyroid", 1));
        company.addSorted(new Lab_Test("TBIC", true, 50.0, 1, "Blood Sample", "Thyroid", 1));
        company.addSorted(new Lab_Test("Urea", true, 30.0, 1, "Blood Sample", "Thyroid", 1));
        company.addSorted(new Lab_Test("Uric acid", true, 60.0, 1, "Blood Sample", "Thyroid", 1));
        company.addSorted(new Lab_Test("Cholesterol", true, 50.0, 1, "Blood Sample", "Thyroid", 1));
        company.addSorted(new Lab_Test("Calcium", true, 50.0, 1, "Blood Sample", "Thyroid", 1));
        company.addSorted(new Lab_Test("CBC", true, 50.0, 1, "Blood Sample", "Thyroid", 1));
        company.addSorted(new Lab_Test("Liver", true, 50.0, 1, "Blood Sample", "Thyroid", 1));



        Customer customer5 = new Customer();

       // company.runAdmin();

        System.out.println("1. Are you a Customer?\n2. Are you a Doctor\n3. Are you a admin. Enter (1,2,3)");
        int input = scanner.nextInt();

        while(input<1 || input>3){
          System.out.println("Enter (1,2,3)");
          input = scanner.nextInt();

        }//while

        if (input==1) {

          Customer temp =  company.runCustomer(customer5);

          System.out.println();
     
          company.runCompany(temp);
          
        } else if (input==2) {

           company.runDoctor();
          
        } else {

          company.runAdmin();

        }//if
    

       for (int i=0 ;i<doctor.size() ; i++) {
        for (int j=0; j<doctor.get(i).size(); j++) {
      NodeA current = doctor.get(i).get(j).getPriorityQueue().getHead();
      if (doctor.get(i).get(j).getPriorityQueue().getSize() !=0 ) {
           doctor.get(i).get(j).appointmentHeld(current.data);
           
      }//if
      }//for
      break;
    }//for

    company.runAdmin();

		
		//myCompany.runDoctor();
    

    }//main
	
}//class