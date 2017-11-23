package cn.huihe.sfgl.service;

import cn.huihe.sfgl.model.Student;

/**
 * 
 * @author zz
 *
 */

public interface StuInfoService {	//显示学生信息
	/**
	 * 通过学生学号来查询此学生信息
	 * 参数是学生学号
	 * 返回值是学生对象
	 */
	public Student searchStuBySid(String sid);
	
	/**
	 * 添加学生的功能
	 * 参数是需要添加的学生对象
	 * 通过返回值来判断是否提交成功
	 * true为成功，false为失败
	 */
	public boolean addStu(Student st);
}
