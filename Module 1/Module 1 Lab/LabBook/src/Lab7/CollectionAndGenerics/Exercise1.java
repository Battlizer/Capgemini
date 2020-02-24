package Lab7.CollectionAndGenerics;

import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
	 
		HashMap<Integer,String> map = new HashMap<>(); 
		System.out.println("Enter number of elements : ");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();

		for(int i=1;i<=n;i++){
			map.put(i, scan.next());
		}
		List<String> list = getValues(map);
		System.out.println(list);
		
		scan.close();
	}

	public static List<String> getValues(HashMap<Integer,String> map) {
		Collection<String> list1 = map.values();
		List<String> list2 = new ArrayList<String>();
		for(String string:list1) {
			list2.add(string);
		}
		Collections.sort(list2);
		return list2;
		/*	List list = new LinkedList(map.entrySet());
	
 		Collections.sort(list);
 		return list;
		*/
	}
}