package org.smart4j.smartFramework.bean;

import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 * 封装请求信息
 * 
 * @author shuang
 * @version 1.0.0
 */
public class Request {
	/**
	 * 请求方法
	 */
	private String requestMethod;
	/**
	 * 请求路径
	 */
	private String requestPath;
	
	public Request(String requestMethod, String requestPath) {
		this.requestMethod = requestMethod;
		this.requestPath = requestPath;
	}

	public String getRequestMethod() {
		return requestMethod;
	}
	public String getRequestPath() {
		return requestPath;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((requestMethod == null) ? 0 : requestMethod.hashCode());
		result = prime * result + ((requestPath == null) ? 0 : requestPath.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}
}
