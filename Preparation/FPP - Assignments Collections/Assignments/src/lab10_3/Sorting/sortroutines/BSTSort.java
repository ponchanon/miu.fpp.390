package lab10_3.Sorting.sortroutines;

import lab10_3.Sorting.runtime.Sorter;

public class BSTSort extends Sorter{

	@Override
	public int[] sort(int[] arr) {
		MyBST bst = new MyBST();
		bst.insertAll(arr);
		
		return bst.readIntoArray();
	}

}
