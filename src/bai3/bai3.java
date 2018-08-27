package bai3;

public class bai3 {
	private int id;
	private String name;
	private float price;
	private String datecreate;
	private int soluong;

	public bai3(int id, String name, float price, String datecreate, int soluong) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.datecreate = datecreate;
		this.soluong = soluong;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDatecreate() {
		return datecreate;
	}

	public void setDatecreate(String datecreate) {
		this.datecreate = datecreate;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public bai3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String toString(){
		return "ID : " + this.id + "\n Name : "+ this.name + "\n Price : " + this.price +"\n Time : "+ this.datecreate + "\n Số lượng : "+ this.soluong;
	}
}
