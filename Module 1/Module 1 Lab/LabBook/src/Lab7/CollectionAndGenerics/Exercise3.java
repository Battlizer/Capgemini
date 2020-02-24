package Lab7.CollectionAndGenerics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise3 {
	static Map<Integer,Integer> getSquares(Integer arr[]){
		HashMap<Integer,Integer> map = new HashMap<>();
		List<Integer> list = Arrays.asList(arr);
		for(Integer sq:list) {
			int value =sq*sq;
			map.put(sq, value);
		}
		return map;
	}

	public static void main(String[] args) {
		Integer arr[]= {1,2,3,4};
		System.out.println(getSquares(arr));
	}
}