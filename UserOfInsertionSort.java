import java.util.ArrayList;

public class UserOfInsertionSort {
    private static List_iAS list;
    private static InsertionSort insertionSort;

    public static void main (String[] commandLine){
	list = new List_iAS();
	insertionSort = new InsertionSort();

	System.out.println();
	list.add(3);
	list.add(6);
	list.add(8);
	list.add(4);
	list.add(8);
	list.add(5);
	list.add(6);
	list.add(2);
	list.add(4);
	list.add(7);
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
