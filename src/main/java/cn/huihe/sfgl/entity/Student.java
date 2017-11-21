package cn.huihe.sfgl.entity;

import java.util.List;

import cn.huihe.sfgl.service.SignService;

public class Student implements SignService{
	
	private Integer sid;
	private String sname;
	private Double stotal;
	private Integer sfee;
	
	
	public List<Student> SearchForStudents(Integer gid, Integer cid) {
		// 	 根据年级(gid)和班级(cid)查询出对应某年级某班所有学生的信息
		return null;
	}
	public Boolean AchieveSign(Student stu) {
		// 实现签到,返回false或true来表示签到是否成功
		return null;
	}
	public static void main(String[] args) {
		System.out.println(" ");
	}
}
