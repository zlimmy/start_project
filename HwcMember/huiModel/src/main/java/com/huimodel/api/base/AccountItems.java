/**
 * 
 */
package com.huimodel.api.base;

import java.util.List;

/**
 * @author FZ
 */
public class AccountItems extends ResponseBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4439208444757367088L;

	private String group;
	
	private List<AccountItem> entities;

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public List<AccountItem> getEntities() {
		return entities;
	}

	public void setEntities(List<AccountItem> entities) {
		this.entities = entities;
	}
	
	
	
}
