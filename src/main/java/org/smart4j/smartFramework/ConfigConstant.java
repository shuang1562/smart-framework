package org.smart4j.smartFramework;
/**
 * 维护配置文件中相关的配置项名称 
 * 
 * @author shuang
 * @version 1.0.0
 */
public interface ConfigConstant {
	/**
	 * 配置文件名称
	 */
	String CONFIG_FILE = "smart.properties";
	
	/**
	 * mysql数据库JDBC驱动
	 */
	String JDBC_DRIVER = "smart.framework.jdbc.driver";
	/**
	 * mysql数据库连接URL
	 */
	String JDBC_URL = "smart.framework.jdbc.url";
	/**
	 * mysql数据库连接用户名
	 */
	String JDBC_USERNAME = "smart.framework.jdbc.username";
	/**
	 * mysql数据库连接密码
	 */
	String JDBC_PASSWORD = "smart.framework.jdbc.password";
	
	/**
	 * 项目的基础包名
	 */
	String APP_BASE_PACKAGE = "smart.framework.app.base_package";
	/**
	 * 项目中JSP存放路径
	 */
	String APP_JSP_PATH = "smart.framework.app.jsp_path";
	/**
	 * 项目中静态资源存放路径
	 */
	String APP_ASSET_PATH = "smart.framework.app.asset_path";
}
