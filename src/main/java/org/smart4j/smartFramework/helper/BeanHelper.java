package org.smart4j.smartFramework.helper;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.smart4j.smartFramework.util.ReflectionUtil;
/**
 * Bean 助手类
 * 
 * @author shuang
 * @version 1.0.0
 */
public class BeanHelper {
	/**
	 * 定义Bean映射（用于存放Bean类与Bean实例的映射关系）
	 */
	private static final Map<Class<?>, Object> BEAN_MAP = new HashMap<Class<?>, Object>();
	
	static {
		Set<Class<?>> beanClassSet = ClassHelper.getBeanClassSet();
		for (Class<?> beanClass : beanClassSet) {
			Object obj = ReflectionUtil.newInstance(beanClass);
			BEAN_MAP.put(beanClass, obj);
		}
	}
	/**
	 * 获取Bean映射
	 * @return Map<Class<?>, Object> 对象
	 */
	public static Map<Class<?>, Object> getBeanMap() {
		return BEAN_MAP;
	}
	/**
	 * 获取Bean实例
	 * @param cls Class类
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> cls) { // <T>表明T是一个泛型，没有明确的类型
		if (!BEAN_MAP.containsKey(cls)) {
			throw new RuntimeException("can not get bean by class:" + cls);
		}
		return (T) BEAN_MAP.get(cls);
	}
}

