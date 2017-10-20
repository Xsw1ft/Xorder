package cn.xswift.xorder.entity;

public class FoodsDetail {
	private int id; //id
	private String name;//名字
	private double price;//价钱
	private String img;//图片src
	private String kind;//种类
	public FoodsDetail(int id, String name, double price, String img, String kind) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.img = img;
		this.kind = kind;
	}
	public FoodsDetail(String name, double price, String kind) {
		super();
		this.name = name;
		this.price = price;
		this.kind = kind;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public FoodsDetail() {
		super();
	}
	public FoodsDetail(int id, String name, double price, String kind) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.kind = kind;
	}
}
