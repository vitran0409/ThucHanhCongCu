package bai1;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chiều cao n của tam giác  : ");
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {

				if ( i == j || j == 0 || j == n || i == n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				// System.out.print("*");
			}
			System.out.println("");
		}
	}
}
