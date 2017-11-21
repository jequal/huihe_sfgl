package cn.huihe.sfgl.service;

/**
 * @author 郭晨伟
 *
 */
public interface ChargeFeeService {
	
	/**
	 *收费功能
	 *提交一个学生的Id和要交的费用
	 *返回一个布尔类型的值代表缴费是否成功
	 */
	public boolean chargeFee(int sid,int fee);
	
	/**
	 *扣费功能
	 *提交一个学生的Id，每月签到的天数和该学生对应的扣费项目id
	 *返回一个布尔类型的值代表扣费是否成功
	 */
	public boolean subFee(int sid,int day,int fid);
	
	/**
	 *余额显示
	 *提交一个学生的Id
	 *返回一个int类型的整数代表余额度
	 */
	public int showStage(int sid);
}
