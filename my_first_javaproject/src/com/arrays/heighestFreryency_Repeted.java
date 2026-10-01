package com.arrays;

public class heighestFreryency_Repeted {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 0, 0, 1, 0 ,0 , 0};

		int l = arr.length / 2;
		boolean visited[]=new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if(visited[i]==true) {
				continue;
			}
			int count = 1;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					visited[j]=true;
					count++;
				}
			}
			if (count>l) {
				System.out.println(arr[i]);
			}
		}

	}

}
