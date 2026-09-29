package com.arrays2D;

public class Testdemo1 {

	public static void main(String[] args) {
		int[][] n = new int[2][3];

		n[0][0] = 10;
		n[0][1] = 20;
		n[0][2] = 30;

		n[1][0] = 40;
		n[1][1] = 50;
		n[1][2] = 60;

		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}

	}

}
