/*Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

 

Example 1:

Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]
*/



import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ArraySorting {
	public static void main(String[] args) {
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		int[] arr2 = {2,1,4,3,9,6};
		
		int[] result = relativeSortArray(arr1, arr2);
		
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr2.length;i++) {
            map.put(arr2[i],i);
        }
        
        Integer[] arr1Integer = new Integer[arr1.length];
        for(int i=0;i<arr1.length;i++) 
            arr1Integer[i] = arr1[i];
            
        Arrays.sort(arr1Integer, new Comparator<Integer>() {
            @Override public int compare(Integer i1, Integer i2) {
                if(map.containsKey(i1) && map.containsKey(i2)) {
                  return map.get(i1) - map.get(i2);
                } else if(map.containsKey(i1) && !map.containsKey(i2))
                    return -1;
                else if(!map.containsKey(i1) && map.containsKey(i2))
                    return 1;
                else //!map.containsKey(i1) && !map.containsKey(i2)
                    return i1-i2;
            } 
        });
        
        int [] ret = new int[arr1.length];
        for(int i=0;i<arr1.length;i++) 
            ret[i] = arr1Integer[i];
        return ret;   
    }

}
