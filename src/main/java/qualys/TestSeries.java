package qualys;/*package qualys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TestSeries {
	
	Map<String, Integer> playerCount = new LinkedHashMap<String, Integer>();
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Virat,22,23,25");
		list.add("Sachin,12,93,25");
		list.add("Ashish,12,93,40");
		 System.out.println(findTopScorers(3, 3, list, 2));

	}
	
	public static List<String> findTopScorers(int totalNoPlayers, int totalMatches, List<String> scores, int n) {
		List<List> finalList= new ArrayList<>();
		Map<String, Integer> scoreMaptByMatchNo= null;
		String[] line = scores.get(0).split(",");
		String name=line[0];
		
		for (int i = 1; i < line.length; i++) {
			String string = line[i];
			
	
			
		}
		for (String string : scores) {
			String[] line = string.split(",");
			String name = (line[0]);
			String[] scoreArray = Arrays.copyOfRange(line, 1, line.length);
			List<Integer> scoreList = new ArrayList();
			for (int i = 0; i < scoreArray.length; i++) {
				scoreList.add(Integer.parseInt(scoreArray[i]));

			}
			Collections.sort(scoreList, (i1, i2) -> i2.intValue() - i1.intValue());

			map.put(name, scoreList);

		}
	return null;
	}
	

public static void main(String[] args) {
	List l[]= new ArrayList[10];
	int a[]= {1,2,34,}; 
}
}
*/