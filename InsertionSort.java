import java.util.ArrayList;

public class InsertionSort {

    
    public String insert1( ArrayList<String> list, int alreadyInserted){
	String valueToInsert = list.get(alreadyInserted);
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

    public String drop( ArrayList<String> list, int index, String value){
	list.set(index, value);
	return value;
    }
    
    public String shift(ArrayList<String> list, int index){
	String oldValue = list.get(index);
	list.set(index, list.set(index + 1, oldValue));
	return oldValue;
    }
    
    public void insertionSort( ArrayList<String> list){
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
