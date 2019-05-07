import java.util.ArrayList;

public class InsertionSort {

    
    public String insert1( ArrayList<T extends Comparable<T>> list, int alreadyInserted){
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

    public T drop( ArrayList<T extends Comparable<T>> list, int index, T value){
	list.set(index, value);
	return value;
    }
    
    public T shift(ArrayList<T extends Comparable<T>> list, int index){
	T oldValue = list.get(index);
	list.set(index, list.set(index + 1, oldValue));
	return oldValue;
    }
    
    public void insertionSort( ArrayList<T extends Comparable<T>> list){
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
