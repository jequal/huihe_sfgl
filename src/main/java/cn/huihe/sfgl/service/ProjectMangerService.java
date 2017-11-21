package cn.huihe.sfgl.service;

import cn.huihe.sfgl.model.Project;

/**
 * @author 郭晨伟
 *
 */
public interface ProjectMangerService {
	
	/**
	 *收费项目添加方法
	 *需要传递一个收费项目的对象project
	 *返回一个布尔类型的值代表添加项目是否成功
	 */
	public boolean addProject(Project project);
	
	
	/**
	 *收费项目删除方法
	 *需要传递一个收费项目的对象的id
	 *返回一个布尔类型的值代删除项目是否成功
	 */
	public boolean delProject(int fid);
	
	
	/**
	 *收费项目修改方法
	 *需要传递一个收费项目的对象的id和对象project
	 *返回一个布尔类型的值代表修改是否成功
	 */
	public boolean exitProject(int fid,Project project);
}
