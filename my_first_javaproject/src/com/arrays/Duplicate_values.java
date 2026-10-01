package com.arrays;

import java.util.Arrays;

public class Duplicate_values {

	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 1, 2, 3, 4, 5 };

		for (int i = 0; i < n.length; i++) {
			boolean flag = false;
			for (int j = 0; j < i; j++) {
				if (n[i] == n[j]) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.print(n[i] + " ");
			}
		}

	}

}
