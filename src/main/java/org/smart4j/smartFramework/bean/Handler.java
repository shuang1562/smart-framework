package org.smart4j.smartFramework.bean;

import java.lang.reflect.Method;

/**
 * 封装action信息
 * 
 * @author shuang
 * @version 1.0.0
 */
public class Handler {
	/**
	 * Controller类
	 */
	private Class<?> controllerClass;
	/**
	 * Action方法
	 */
	private Method actionMethod;
	
	public Handler(Class<?> controllerClass, Method actionMethod) {
		this.controllerClass = controllerClass;
		this.actionMethod = actionMethod;
	}

	public Class<?> getControllerClass() {
		return controllerClass;
	}

	public Method getActionMethod() {
		return actionMethod;
	}
}
