package com.tutorialspoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Map {
	public static void main(String[] args) {
		int arrayInt[] = {3,5,6,7,8,9};
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//
//		for(int i = 0 ; i < arrayInt.length; i++) {
//			map.put(i, arrayInt[i]);
//		}
//
//		for(int i = 0; i < arrayInt.length; i++) {
//			int so = 15 - arrayInt[i];
//			if(map.containsValue(so)) {
//				int toReturn[] = {map.get(i), i};
//                
//			}else {
//				System.out.println("khong Ton tai");
//			}
//		}
		twoSum(arrayInt,15);
	}
	
	 public static int[] twoSum(int[] numbers, int target) {
	        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
	        for(int i = 0; i < numbers.length; i++){
	            Integer requiredNum = (Integer)(target - numbers[i]);
	            if(indexMap.containsKey(requiredNum)){
	                int toReturn[] = {indexMap.get(requiredNum), i};
	                return toReturn;
	            }

	            indexMap.put(numbers[i], i);
	        }
	        return null;
	    }
}
