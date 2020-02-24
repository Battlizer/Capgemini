package Lab7.CollectionAndGenerics;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Exercise6 {

	static List<Integer> votersList(Map<Integer,LocalDate> map) {
		LocalDate local = null;
		LocalDate date =LocalDate.now();
		List<Integer> list = new ArrayList<>();
		Set<Integer> keyset=map.keySet();
		for(Integer key:keyset) {
			local =map.get(key);
			int year = Period.between(local, date).getYears();
			if(year>=18)
				list.add(key);
		}
		return list;
 }

	public static void main(String[] args) {
		HashMap<Integer,LocalDate> map = new HashMap<>();
		map.put(1001, LocalDate.of(2000, 1, 11));
		map.put(1081, LocalDate.of(2012, 9, 1));
		map.put(1071, LocalDate.of(2020, 1, 11));
		System.out.println(votersList(map));
	}

/*	static List votersList(Map<Integer,Integer> map) {
 List<Integer> list = new ArrayList<>();
 Set<Integer> keyset=map.keySet();
 for(Integer key:keyset) {
 int age=map.get(key);
 if(age>18)
 {
 list.add(key);
 }
 }
 return list;
 }
 public static void main(String[] args) {
 HashMap<Integer,Integer> map = new HashMap<>();
 map.put(1001, 30);
 map.put(1002, 12);
 map.put(1004, 90);
 map.put(1005,9);
 
 System.out.println(votersList(map));
 }
	
 */

}