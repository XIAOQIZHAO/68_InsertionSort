import java.util.ArrayList;

public class InsertionSort {

    
    public <T extends Comparable<T>> T insert1( ArrayList<T> list, int alreadyInserted){
	T valueToInsert = list.get(alreadyInserted);
	for (int indexToCompare = alreadyInserted - 1;
	     indexToCompare >= 0;
	     indexToCompare--){
	    if (valueToInsert.compareTo( list.get(indexToCompare)) >= 0){
		drop(list, indexToCompare + 1, valueToInsert);
		indexToCompare = -1;
		//get out of loop after dropping current value
	    }
	    else
		shift(list, indexToCompare);
	}
	return valueToInsert;
    }

    public <T extends Comparable<T>> T drop( ArrayList<T> list, int index, T value){
	list.set(index, value);
	return value;
    }
    
    public <T extends Comparable<T>>T shift(ArrayList<T> list, int index){
	T oldValue = list.get(index);
	list.set(index, list.set(index + 1, oldValue));
	return oldValue;
    }
    
    public <T extends Comparable<T>>void insertionSort( ArrayList<T> list){
	for (int numSorted = 1; numSorted < list.size(); numSorted++){
	    insert1(list, numSorted);
	    // // for debugging
	    // System.out.println(numSorted);
	    // System.out.println( "    dbg: "
	    // 			+ "after inserting element " + list.get(numSorted)
	    // 			+ " elements: " + list
	    // 			);
	}
    }

}
