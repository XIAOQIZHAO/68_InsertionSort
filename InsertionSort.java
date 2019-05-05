
public class InsertionSort {

    
    public int insert1( List_iAS list, int alreadyInserted){
	int valueToInsert = list.get(alreadyInserted);
	for (int indexToCompare = alreadyInserted - 1;
	     indexToCompare >= 0;
	     indexToCompare--){
	    if (valueToInsert >= list.get(indexToCompare)){
		drop(list, indexToCompare + 1, valueToInsert);
		indexToCompare = -1;
		//get out of loop after dropping current value
	    }
	    else
		shift(list, indexToCompare);
	}
	return valueToInsert;
    }

    public int drop(List_iAS list, int index, int value){
	list.set(index, value);
	return value;
    }
    
    public int shift(List_iAS list, int index){
	int oldValue = list.get(index);
	list.set(index, list.set(index + 1, oldValue));
	return oldValue;
    }
    
    public void insertionSort( List_iAS list){
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
