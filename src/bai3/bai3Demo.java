package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class bai3Demo {
	public static void main(String[] args) {
		bai3Action ttdl = new bai3Action();
		Scanner sc = new Scanner(System.in);
		ArrayList<bai3> tttdl = null;

		boolean check = true;
		boolean checkchon = true;
		boolean checkn = true;
		int chon = 0;
		int n = 0;
		do {
			do {
				ttdl.menu();
				try {
					System.out.println("Nhập số [1->5]");
					chon = Integer.parseInt(sc.nextLine());
					checkchon = false;
				} catch (Exception e) {
					System.out.println("Chỉ nhập số !!!");
					checkchon = true;
				}
			} while (checkchon);

			switch (chon) {
			case 1:

				do {
					System.out.println("Nhập số lượng thông tin hàng hóa bạn sẽ nhập !!!");
					try {
						checkn = false;
						n = Integer.parseInt(sc.nextLine());
					} catch (Exception e) {
						System.out.println("Chỉ nhập số !!!");
						checkn = true;
					}
				} while (checkn);

				tttdl = ttdl.nhapdl(n);
				check = true;
				break;
			case 2:
				if (tttdl != null) {
					System.out.println("================DANH SÁCH THÔNG TIN HÀNG HÓA==============");
					ttdl.indl(tttdl);

					check = true;
				} else {
					System.out.println("Chưa có dữ liệu !!!");
					System.out.println("===============================================");

				}
				break;
			case 3:
				ttdl.timdl(tttdl);
				check = true;
				break;
			case 4:

				if (tttdl != null) {
					ttdl.xoahang(tttdl);
					check = true;

				} else {
					System.out.println("Chưa có dữ liệu !!!");
					System.out.println("===============================================");

				}
				break;
			default:
				System.out.println("Bye bạn !!! ");
				check = false;
				break;
			}

		} while (check);
	}
}
