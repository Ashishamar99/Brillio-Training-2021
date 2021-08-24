package one_dim_array;

public class Search extends Read{
	public void searchElement() {
		Boolean isFound = false;
		int pos = 0;
		System.out.println("Element to search is:: " + searchItem);
		for(int i=0; i<n; i++) {
			if(numbers[i] == searchItem) {
				isFound = true;
				pos = i+1;
				break;
			}
		}
		
		if(isFound) {
			System.out.println("Element found, position is:: " + pos);
		}
		else {
			System.out.println("Element not found");
		}
		
	}
}
