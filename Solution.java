package org.HackerRank.Token;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class Solution {
	
	public String electionWinner(String[] votes){
		
		HashMap<String, Integer> map = new HashMap<>();
		int max=0;
		for(int i = 0; i < votes.length; i++){
			String s = votes[i];
			s = s.trim();
			
			if(map.containsKey(s)){
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
			max=Math.max(max, map.get(s));
		}
		
		int j = 0;
		LinkedList<String> finalNames = new LinkedList<>(); 
		
        for (Entry<String, Integer> entry : map.entrySet()) {
        	System.out.println(entry.getKey());
        	System.out.println(entry.getValue());
            if (entry.getValue()==max) 
            	finalNames.add(entry.getKey());
        }
        Collections.sort(finalNames);
        return finalNames.get(finalNames.size()-1);
	}
       
	
	public static void main(String[] args){
		String[] votes = {"Vidur", "Vidur", "Vidur", "Vidur", "Z", "Bhumika", "Bhumika", "Bhumika", "Bhumika"};
		System.out.println(new Solution().electionWinner(votes));
	}
}
