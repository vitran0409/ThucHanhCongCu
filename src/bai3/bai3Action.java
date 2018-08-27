package bai3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class bai3Action {
	public void menu() {
		System.out.println("--1.Nhập dữ liệu  ");
		System.out.println("--2.Xuất dữ liệu  ");
		System.out.println("--3.Tìm hàng theo name  ");
		System.out.println("--4.Xóa hàng có số lượng tồn = 0 ra khỏi hệ thống");
		System.out.println("--5.Thoát");
	}

	public ArrayList<bai3> nhapdl(int n) {
		Date date = new Date();
		ArrayList<bai3> mangdl = new ArrayList<bai3>();
		Scanner sc = new Scanner(System.in);
		boolean checkid = true;
		boolean checkso = true;
		boolean checkgia = true;
		boolean checksoluong = true;
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin dữ liệu hàng hóa thứ : " + (i + 1));
			System.out.println("===============================================");
			int id = 0;
			float price = 0 ;
			int soluong = 0;
			do {
				checkso = false;
				try {
					System.out.println("Nhập ID : ");
					id = Integer.parseInt(sc.nextLine());
				} catch (Exception e) {
					System.out.println("Chỉ nhập số !!!");
					checkso = true;
				}

			} while (checkso);
			do {
				checkid = false;
				if (mangdl.size() > 0) {
					for (bai3 check : mangdl) {
						if (id == check.getId()) {
							System.out.println("ID bị trùng, vui lòng nhập lại : ");
							id = Integer.parseInt(sc.nextLine());
							checkid = true;
						}
					}
				}

			} while (checkid);

			System.out.println("Nhập name  : ");
			String name = sc.nextLine();
			do{
				checkgia = false;
				try {
					System.out.println("Nhập giá : ");
					 price = Float.parseFloat(sc.nextLine());
				} catch (Exception e) {
					System.out.println("Chỉ nhập số !!!");
					checkgia = true;
				}

				
			}while(checkgia);


			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			String datecreate = sdf.format(date);
			do{
				checksoluong= false;
				try {
					System.out.println("Nhập số lượng : ");
					 soluong = Integer.parseInt(sc.nextLine());
				} catch (Exception e) {
					System.out.println("Chỉ nhập số !!! ");
					checksoluong = true;
				}
			}while(checksoluong);


			bai3 ds = new bai3(id, name, price, datecreate, soluong);
			mangdl.add(ds);
		}
		return mangdl;
	}

	public void indl(ArrayList<bai3> mangdl) {
		for (bai3 dsdl : mangdl) {
			System.out.println(dsdl);
			System.out.println("===============================================");
		}

	}

	public void timdl(ArrayList<bai3> mangdl) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập name bạn muốn tìm : ");
		String namenhap = sc.nextLine();
		if (mangdl != null) {
			for (bai3 ds : mangdl) {
				if (mangdl.size() > 0) {
					if (namenhap.equalsIgnoreCase(ds.getName())) {
						System.out.println(ds.toString());
					} else {
						System.out.println("Không tìm thấy dữ liệu !!!");
					}
				}
			}
		} else {
			System.out.println("Chưa có dữ liệu !!! ");
		}

	}

	public void xoahang(ArrayList<bai3> mangdl) {
		for (int i = 0; i < mangdl.size(); i++) {
			if(mangdl.get(i).getSoluong()==0){
				mangdl.remove(i);
				System.out.println("Đã xóa dữ liệu !!!");
			}
		}
	}
}
