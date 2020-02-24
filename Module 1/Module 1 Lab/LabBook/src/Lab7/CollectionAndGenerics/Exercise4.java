package Lab7.CollectionAndGenerics;

import java.util.HashMap;
import java.util.Set;

public class Exercise4 {

	static HashMap<Integer,String> getStudents(HashMap<Integer,Integer> hash){
		HashMap<Integer,String> map = new HashMap<>();
		Set<Integer> set = hash.keySet();
		String medal=null;
		int marks;
		for(Integer key:set) {
			marks=hash.get(key);
			if(marks>=90)
				medal ="GOLD";
			else if (marks>=80&&marks<90) {
				medal ="Silver";
			}
			else if (marks>=70&&marks<80) {
				medal ="Bronze";
			}
			map.put(key, medal);
		}
		return map;
	}

	public static void main(String[] args) {
		HashMap<Integer,Integer> hash = new HashMap<>();
		hash.put(2, 90);
		hash.put(3, 79);
		System.out.println(getStudents(hash));
	}
}