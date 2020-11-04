package note;

import java.util.ArrayList;

public class ex1 {

	public static void main(String[] args) {

		// toArray
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		int[] arr = new int[list.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = list.get(i);
		}
		int[] arr2 = list.stream().mapToInt(i -> i).toArray();

		// parse어쩌구
		String a = "1";
		float d = Float.parseFloat(a);
		System.out.println(d + 1);
		int result = Integer.parseInt(a) + 1;
		System.out.println(result);
		
		// intValue
		Integer b = 1;			// autoboxing
		int b1 = b;				// unboxing
		int b2 = b.intValue();	// unboxing
		
	}

}
