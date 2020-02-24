package Lab7.CollectionAndGenerics;

import java.util.Arrays;

import java.util.Collections;

import java.util.HashMap;

import java.util.List;

import java.util.Map;

public class Exercise2 {
 static Map<Character,Integer> countCharacter(Character[] arr){

	 /*int count =0;
 	int[]c;
 	char s[]=new char[arr.length];
 	for(int i=0;i<arr.length;i++)
 	{
  	s[i]=arr[i];
  	count=0;
  	for(int j=0;j<arr.length;j++) {
  	count++;
  	}
 	}
	  */

	HashMap<Character,Integer> map = new HashMap<>(); 
 	List<Character> list1 =Arrays.asList(arr);
 	int c=0;
 	for(Character ch:list1) {
 			c=0;
 			c=Collections.frequency(list1, ch);
 			map.put(ch, c);
 		}
 		return map;
 	}

 public static void main(String[] args) {
	 Character a[]= {'a','p','p','l','e'};
	 System.out.println(countCharacter(a));
 }
}