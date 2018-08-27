package bai2;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		boolean checkso = true;
		boolean checkchu = true;
		do {
			checkso = false;
			System.out.println("Nhập số nguyên x : ");

			do {
				checkchu = false;
				try {
					x = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("Chỉ nhập số : ");
					checkchu = true;
				}

			} while (checkchu);

			if (x < 10000 || x > 99999) {
				System.out.println("Nhập lại x trong khoản 10000->99999");
				checkso = true;
			}
		} while (checkso);

		int a = x / 10000;
		int b = x % 10000 / 1000;
		int c = x % 10000 % 1000 / 100;
		int d = x % 10000 % 1000 % 100 / 10;
		int e = x % 10000 % 1000 % 100 % 10;
		int tong = a + b + c + d + e;
		System.out.println("Tổng các từng chữ số trong số vừa nhập là : " + tong);
	}
}
