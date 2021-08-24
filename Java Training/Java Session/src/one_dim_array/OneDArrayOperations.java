package one_dim_array;

public class OneDArrayOperations {
	public static void main(String[] args) {
		ReadSize readsize = new ReadSize();
		readsize.takeInput();
		
		Create create = new Create();
		create.createArray();
		
		Read read = new Read();
		read.readData();
		
		Display display = new Display();
		display.displayHorizontal();
		display.displayVertical();
		
		Search search = new Search();
		read.readSearchElement();
		search.searchElement();
		
		Sort sort = new Sort();
		sort.sortArray();
	}

}
