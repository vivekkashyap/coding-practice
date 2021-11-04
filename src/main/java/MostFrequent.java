import java.util.HashMap;
import java.util.Map;

/*2. Most Frequent

Given an integer array, find the most frequent number and it's count in the array. Write the

code in O(1) space. Eg 1 , 3, 4, 5, 2, 2, 3, 2 Output Most frequent number is 2. The

frequency is 3. Return the output as string in 'number: frequency' format. e.g. 2: 3 (Please

note the space after : and frequency. If multiple numbers have the same highest frequency

return the smallest number.
*/


public class MostFrequent {

	public static void main(String[] args) {
		int[] arr = {1 , 3, 4, 5, 2, 2, 3, 2};
		mostFrequent(arr);
	}

	private static void mostFrequent(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		int number = Integer.MIN_VALUE;
		int frequency = Integer.MIN_VALUE;
		
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if(e.getValue() > e.getKey()) {
				number = e.getKey();
				frequency = e.getValue();
			}	
		}
		System.out.println(number + ":" + frequency);
	}

}
