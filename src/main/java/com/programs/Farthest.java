package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Farthest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Virat,22,23,25");
		list.add("Sachin,12,93,25");
		list.add("Ashish,12,93,40");
		// System.out.println(findTopScorers(3, 3, list, 2));
		int[] arr = { 1, 8, 3, 4, 5, 6, 7, 8 };
		System.out.println(getTime(arr));

	}

	public static List<String> findTopScorers(int totalNoPlayers, int totalMatches, List<String> scores, int n) {

		Map<String, List<Integer>> map = new HashMap();
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

		List<Integer> values;
		Map<String, Integer> finalMap = new HashMap();
		List<Entry<String, Integer>> list = null;
		for (Entry<String, List<Integer>> entry : map.entrySet()) {

			values = entry.getValue();
			int[] ints = values.stream().mapToInt(Integer::intValue).toArray();
			int indSocre = 0;
			for (int i = 0; i < n; i++) {
				indSocre = indSocre + ints[i];

			}

			finalMap.put(entry.getKey(), indSocre);
			list = new ArrayList<Entry<String, Integer>>(finalMap.entrySet());

			// Sort the list
			Collections.sort(list, new Comparator<Entry<String, Integer>>() {
				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

					return (o2.getValue()) - (o1.getValue());
				}
			});
		}

		List<String> playernames = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Entry<String, Integer> entry = list.get(i);
			playernames.add(entry.getKey());

		}
		return playernames;

	}

	public static int getTime(int[] arr) {
		Arrays.sort(arr);
		int min = arr[0];
		int time = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			int tmp = arr[i];
			time = time + tmp;
			if (i != 1) {
				time = time + min;
			}

		}
		return time;

	}

}
