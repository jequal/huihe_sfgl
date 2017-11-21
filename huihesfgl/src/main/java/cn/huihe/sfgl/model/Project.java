package cn.huihe.sfgl.model;

public class Project {
	private int fid;//收费项目编号
	private String fname;//收费项目名称
	private int  fcost;//收费项目额度
	private String fdescription;//收费项目描述
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getFcost() {
		return fcost;
	}
	public void setFcost(int fcost) {
		this.fcost = fcost;
	}
	public String getFdescription() {
		return fdescription;
	}
	public void setFdescription(String fdescription) {
		this.fdescription = fdescription;
	}
	
	
}
