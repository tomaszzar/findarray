package findarray;

public class MyFindArray implements FindArray {
    public int findArray(int[] array, int[] subArray) {
		int found = -1;
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == subArray[j]){
				j++;
				if(j == subArray.length){
					found = i - j + 1;	
					break;
				}
			}
			else {
				j = 0;
				found = -1;
			}
		}
		return found;
	}
}