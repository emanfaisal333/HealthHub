import java.util.ArrayList;

class Admin extends User {
    private double balance;
    private String name;
    private String phoneNumber;
    private String address;
    private String password;
    private String gender;
    

    public Admin(String name, String phoneNumber, String address, String password, String gender, double balance) {
        super(name, phoneNumber, address, password, gender);
        this.balance = balance;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.password = password;
        this.gender = gender;
        
    }
    //write this method
    public void displayInfo(){

    }//admin

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;

    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    
    }//getters and setters
}



// class Company {
//     private ArrayList<Order> orders;
//     private ArrayList<Medicine> medicines;

//     public Company() {
//         this.orders = new ArrayList<>();
//         this.medicines = new ArrayList<>();
//     }

//      // Method to analyze medicines every seven days
//     public void analyzeMedicines(Admin admin) {
//         // Get the current date
//         Date currentDate = new Date();
        
//         // Calculate the date seven days ago
//         Calendar calendar = Calendar.getInstance();
//         calendar.setTime(currentDate);
//         calendar.add(Calendar.DAY_OF_YEAR, -7);
//         Date sevenDaysAgo = calendar.getTime();


//        for (Order order : orders) {
//             if (order.getOrderDate().after(sevenDaysAgo)) {
//                 Medicine medicine = order.getMedicine();
//                 int count = medicineCounts.getOrDefault(medicine, 0);
//                 medicineCounts.put(medicine, count + order.getQuantity());
//             }
//         }

//         // Determine medicines currently out of stock and frequently sold medicines
//         ArrayList<Medicine> outOfStockMedicines = new ArrayList<>();
//         ArrayList<Medicine> frequentlySoldMedicines = new ArrayList<>();
//         int frequentminimum = 10; // Set any counter minimum  as needed

//         for (Medicine medicine : medicineCounts.keySet()) {
//             int count = medicineCounts.getOrDefault(medicine, 0);
//             if (count == 0) {
//                 outOfStockMedicines.add(medicine);
//             } else if (count > frequentminimum ) {
//                 frequentlySoldMedicines.add(medicine);
//             }
//         }

//         // Print the results
//         System.out.println("Medicines currently out of stock:");
//         for (Medicine medicine : outOfStockMedicines) {
//             System.out.println(medicine.getName());
//         }

//         System.out.println("Frequently sold medicines in the last seven days:");
//         for (Medicine medicine : frequentlySoldMedicines) {
//             System.out.println(medicine.getName());
//         }
//     }
