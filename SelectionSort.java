class SelectionSort  {
				
	public static T[] sortThis (T[] array){

		int min=0, temp=0;

		for (int i=0 ; i<array.length-1 ; i++) {
			min=i;
			for (int j=i+1 ; j<array.length ; j++) {
				if (array[j] < array[min]) {
					min = j;
				}//if
			}//inner-for

			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
			
		}//outer-for

	}//sortThis()

	public static void main(String[] args) {
		


	}//main
}//class