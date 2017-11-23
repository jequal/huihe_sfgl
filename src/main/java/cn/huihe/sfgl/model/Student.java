package cn.huihe.sfgl.model;


public class Student {
	private String sidString;
	private String name;
	private Integer cname;
	private Integer gname;
	private Double fcost;
	private Double stotal;
	private String scontact;
	public String getSidString() {
		return sidString;
	}
	public void setSidString(String sidString) {
		this.sidString = sidString;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCname() {
		return cname;
	}
	public void setCname(Integer cname) {
		this.cname = cname;
	}
	public Integer getGname() {
		return gname;
	}
	public void setGname(Integer gname) {
		this.gname = gname;
	}
	public Double getFcost() {
		return fcost;
	}
	public void setFcost(Double fcost) {
		this.fcost = fcost;
	}
	public Double getStotal() {
		return stotal;
	}
	public void setStotal(Double stotal) {
		this.stotal = stotal;
	}
	public String getScontact() {
		return scontact;
	}
	public void setScontact(String scontact) {
		this.scontact = scontact;
	}
}
