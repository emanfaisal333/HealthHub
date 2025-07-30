
class PriorityQueue {
	
	private Node head;
    private Node tail;
    private int size=0;

    public int getSize(){
        return size;
    }//getSize()

    public Node getHead(){
        return head;
    }

    public Appointment dequeue() {

    	if (head == null) {
    		throw new IllegalStateException("Priority queue is empty");
    	}//if

    	Appointment appointment = head.data;

    	head = head.next;
    	if (head != null) {
    		
    		head.prev = null;
    	}else{
    		tail = null;
    	}//if

    	size--;
    	return appointment;

    }//dequeue

    public void enqueue(Appointment appointment) {

    	Node newNode = new Node(appointment);
    	Node current = tail;
    	
    	if (head == null) {
       		 head = newNode;
       		 tail = newNode;
             size++;
   		} else {
   			while ( (convert(newNode.data.getDate()) < convert(current.data.getDate()) )  && (current.prev != null) ) {
            current = current.prev;
            }//while

            while( (convert(newNode.data.getDate()) == convert(current.data.getDate()) )  && ( convert(newNode.data.getTime()) < convert(current.data.getTime()) ) && (current.prev != null) ){
            current = current.prev;
            }//while

            if (current == head && ((convert(newNode.data.getDate()) < convert(current.data.getDate()) ) || (convert(newNode.data.getDate()) == convert(current.data.getDate()) )  && ( convert(newNode.data.getTime()) < convert(current.data.getTime()) )) ) {
               
                current.prev = newNode;
                newNode.next = current;
                head=newNode;
                size++; 

            }else{
                if (current.next!=null) {
                
                newNode.next = current.next;
                current.next = newNode;
                newNode.prev = current;
                newNode.next.prev = newNode;
                } else {
                    current.next=newNode;
                    newNode.prev=current;
                    tail=newNode;

                }//if

                size++;
            }//inner-if

   		}//outer-if
    }//enqueue()

    public int convert(String input){

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

    }//convert()

    public  void display(){

        Node current= head;

        while(current != null){
            current.data.displayApp();

            current =current.next;
        }

    }//display()


}//class PriorityQueue

