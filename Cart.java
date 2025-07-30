class Cart {
	private Item item;
	private int selectedQuantity;
    private String selectedDate;
    private String selectedTime;

	public Cart(Item item, int selectedQuantity) {
        this.item = item;
        this.selectedQuantity = selectedQuantity;
        this.selectedDate=null;
        this.selectedTime=null;
    }

    public Cart(Item item, int selectedQuantity, String selectedDate, String selectedTime) {
        this.item = item;
        this.selectedQuantity = selectedQuantity;
        this.selectedDate=selectedDate;
        this.selectedTime=selectedTime;
    }

     public String getSelectedDate() {
        return selectedDate;
    }

    public void setSelectedDate(String selectedDate) {
        this.selectedDate = selectedDate;
    }

    public String getSelectedTime() {
        return selectedTime;
    }

    public void setSelectedTime(String selectedTime) {
        this.selectedTime = selectedTime;
    }

	 public Item getItem() {
        return item;
    }

    // Setter method for item
    public void setItem(Item item) {
        this.item = item;
    }

    // Getter method for selectedQuantity
    public int getSelectedQuantity() {
        return selectedQuantity;
    }

    // Setter method for selectedQuantity
    public void setSelectedQuantity(int selectedQuantity) {
        this.selectedQuantity = selectedQuantity;
    }

}//class