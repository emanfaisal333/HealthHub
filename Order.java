import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;

class Order {
	private int orderNumber=0;
	private int userId;
    private LocalDate orderingDate;
    private LocalTime orderingTime;
	private ArrayList<Cart> list;

	public Order(int number, ArrayList<Cart> c){
		this.userId=number;
		this.list=c;
        this.orderingDate = LocalDate.now();
        this.orderingTime =  LocalTime.now();
		++this.orderNumber;
	}//con

    public LocalDate getOrderingDate() {
            return orderingDate;
        }

        public void setOrderingDate(LocalDate orderingDate) {
            this.orderingDate = orderingDate;
        }

        public LocalTime getOrderingTime() {
            return orderingTime;
        }

        public void setOrderingTime(LocalTime orderingTime) {
            this.orderingTime = orderingTime;
        }

	public int getOrderNumber() {
        return orderNumber;
    }

    // Setter method for orderNumber
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    // Getter method for userId
    public int getUserId() {
        return userId;
    }

    // Setter method for userId
    public void setUserId(int userId) {
        this.userId = userId;
    }

    // Getter method for list
    public ArrayList<Cart> getList() {
        return list;
    }

    // Setter method for list
    public void setList(ArrayList<Cart> list) {
        this.list = list;
    }


	
}//class