import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;


public class Solution {
	
	public String electionWinner(String[] votes){
		
		HashMap<String, Integer> map = new HashMap<>();
		LinkedList<String> finalNames = new LinkedList<>(); 
		int max = 0;
		
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
		
		for (Entry<String, Integer> entry : map.entrySet());
		    if (entry.getValue() == max) 
			finalNames.add(entry.getKey());
		}
		Collections.sort(finalNames);
		return finalNames.get(finalNames.size() - 1);
	}
       
	
	public static void main(String[] args){
		String[] votes = {"A", "A", "A", "A", "Z", "B", "B", "B", "B"};
		System.out.println(new Solution().electionWinner(votes));
	}
}
