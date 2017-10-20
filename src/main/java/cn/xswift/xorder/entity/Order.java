package cn.xswift.xorder.entity;

public class Order {
	private int id;
	private String content;
	private String starttime;
	private String finishtime;
	public Order(int id, String content, String starttime, String finishtime) {
		super();
		this.id = id;
		this.content = content;
		this.starttime = starttime;
		this.finishtime = finishtime;
	}
	public Order(int id, String content, String starttime) {
		super();
		this.id = id;
		this.content = content;
		this.starttime = starttime;
	}
	public Order() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getFinishtime() {
		return finishtime;
	}
	public void setFinishtime(String finishtime) {
		this.finishtime = finishtime;
	}
}
