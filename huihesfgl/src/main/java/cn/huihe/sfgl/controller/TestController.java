package cn.huihe.sfgl.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller("TestAction")
@Scope("prototype")
public class TestController extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1400205486199418965L;
	public String hello()
	{
		System.out.println("访问了hello");
		return SUCCESS;
	}

}
