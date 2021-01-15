package com.programs;

public class StringManip {

	public static void main(String[] args) {
		String s = "aabcccabba";
		int l = 0;
		int m = s.length() / 2;
		s = s.substring(m, s.length()).concat(s.substring(l, m));

		int i = optimizeString(0, m, s.length(), s);
		System.out.println(i);

	}

	private static int optimizeString(int l, int m, int h, String cStr) {

		if (cStr.isEmpty()) {
			return 0;

		}

		int left = m;
		int right = m;
		for (int i = left; i > l; i--) {
			if (cStr.charAt(m) != cStr.charAt(i)) {
				left = i + 1;
				break;

			}

		}
		for (int i = right; i < h; i++) {
			if (cStr.charAt(m) != cStr.charAt(i)) {
				right = i - 1;
				break;

			}

		}
		if (left == m && right == m) {
			return cStr.length();

		} else {
			String a = cStr.substring(l, left);
			String b = cStr.substring(right + 1, h);

			String s1 = a + b;
			int low = 0;
			int mid = s1.length() / 2;
			int high = s1.length();
			return optimizeString(low, mid, high, s1);

		}
	}

}
