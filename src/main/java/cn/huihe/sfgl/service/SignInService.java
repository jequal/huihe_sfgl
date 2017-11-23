package cn.huihe.sfgl.service;

/**
 * 
 * @author zz
 *
 */
public interface SignInService {
	/**
	 * 通过年级和班级查询当前班级的全部信息
	 * 第一个参数是年级
	 * 第二个参数是班级
	 */
	public void searchClassInfo(Integer gid,Integer cid);

	
	/**
	 * 提交签到功能
	 * 参数是复选框中value的值	//应该是对应的学生学号
	 * 通过返回值来判断是否提交成功
	 * true为成功，false为失败
	 */
	public boolean commitSignIn(String value);
}
