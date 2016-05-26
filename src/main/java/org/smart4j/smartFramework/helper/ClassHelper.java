package org.smart4j.smartFramework.helper;

import java.util.HashSet;
import java.util.Set;

import org.smart4j.smartFramework.annotation.Controller;
import org.smart4j.smartFramework.annotation.Service;
import org.smart4j.smartFramework.util.ClassUtil;

/**
 * 类操作助手类
 * 
 * @author shuang
 * @version 1.0.0
 */
public class ClassHelper {
	/**
	 * 定义Class类的Set集合（用于存放所加载的类）
	 */
	private static final Set<Class<?>> CLASS_SET;
	
	static {
		String basePackage = ConfigHelper.getAppBasePackage();
		CLASS_SET = ClassUtil.getClassSet(basePackage);
	}
	
	/**
	 * 获取应用包名下的所有的类
	 * @return Set集合泛型为Class类
	 */
	public static Set<Class<?>> getClassSet() {
		return CLASS_SET;
	}
	
	/**
	 * 获取应用包名下的所有Service类
	 * @return Set集合泛型为Class类
	 */
	public static Set<Class<?>> getServiceClassSet() {
		Set<Class<?>> classSet = new HashSet<Class<?>>();
		for (Class<?> cls : CLASS_SET) {
			if (cls.isAnnotationPresent(Service.class)) {
				classSet.add(cls);
			}
		}
		return classSet;
	}
	
	/**
	 * 获取应用包名下的所有Controller类
	 * @return Set集合泛型为Class类
	 */
	public static Set<Class<?>> getControllerClassSet() {
		Set<Class<?>> classSet = new HashSet<Class<?>>();
		for (Class<?> cls : CLASS_SET) {
			if (cls.isAnnotationPresent(Controller.class)) {
				classSet.add(cls);
			}
		}
		return classSet;
	}
	
	/**
	 * 获取应用包名下所有Bean类（包括：Service、Controller等）
	 * @return Set集合泛型为Class类
	 */
	public static Set<Class<?>> getBeanClassSet() {
		Set<Class<?>> beanClassSet = new HashSet<Class<?>>();
		beanClassSet.addAll(getServiceClassSet());
		beanClassSet.addAll(getControllerClassSet());
		return beanClassSet;
	}
}
