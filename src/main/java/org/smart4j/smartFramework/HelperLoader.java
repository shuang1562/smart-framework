package org.smart4j.smartFramework;

import org.smart4j.smartFramework.helper.BeanHelper;
import org.smart4j.smartFramework.helper.ClassHelper;
import org.smart4j.smartFramework.helper.ControllerHelper;
import org.smart4j.smartFramework.helper.IocHelper;
import org.smart4j.smartFramework.util.ClassUtil;

/**
 * 加载相应的 Helper 类
 * 
 * @author shuang
 * @version 1.0.0
 */
public final class HelperLoader {
	public static void init() {
		Class<?>[] classList = {
				ClassHelper.class,
				BeanHelper.class,
				IocHelper.class,
				ControllerHelper.class
		};
		for (Class<?> cls : classList) {
//			ClassUtil.loadClass(cls.getName(),false);
			ClassUtil.loadClass(cls.getName(),true);
		}
	}
}
