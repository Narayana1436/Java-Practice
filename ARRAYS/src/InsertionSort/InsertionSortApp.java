package InsertionSort;

public class InsertionSortApp {

	public  void insertionSortApp(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			int item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]<item) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		

	}

}
