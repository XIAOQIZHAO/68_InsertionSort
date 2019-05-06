import java.util.ArrayList;

public class UserOfInsertionSort {
    private static ArrayList<String> list;
    private static InsertionSort insertionSort;

    public static void main (String[] commandLine){
	list = new ArrayList<String>();
	insertionSort = new InsertionSort();

	System.out.println();
	list.add("D");
	list.add("D");
	list.add("Y");
	list.add("Q");
	list.add("J");
	list.add("B");
	list.add("O");
	list.add("K");
	list.add("L");
	list.add("Z");
	// for (int counter = 0; counter < 10; counter++)
	//     list.add((int)(Math.random() * 10));
        System.out.println( "sample list: " + list
                          + System.lineSeparator());
	
	// // number of sorted
	// int i;
	// for (i = 0;
	//      i < list.size() - 1 && list.get(i) <= list.get(i+1);
	//      i++){}
	insertionSort.insertionSort(list);
	System.out.println("sorted list: " + list);
    }
}
