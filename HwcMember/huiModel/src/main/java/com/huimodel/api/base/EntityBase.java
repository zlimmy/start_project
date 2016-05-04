package com.huimodel.api.base;
import java.util.Map;

public abstract class EntityBase implements java.io.Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String ENTITIES="entities";
	
	public abstract String getTablename() ;
	
	public Map<String,Object> getParams() {
		return params;
	}

	public void setParams(Map<String,Object> params) {
		this.params = params;
	}

	private Map<String,Object> params;
		 
	
}