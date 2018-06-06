package org.xx.config.impl;

import org.xx.config.core.AbstractConfig;

public class ResourceConfig extends AbstractConfig<Integer> {
	/**
	 * id
	 */
	private Integer id = null;
	/**
	 * remark
	 */
	private String remark = null;
	/**
	 * type
	 */
	private Integer type = null;
	/**
	 * name
	 */
	private Integer name = null;
	/**
	 * icon
	 */
	private String icon = null;
	/**
	 * desc
	 */
	private String desc = null;
	/**
	 * id
	 */
	@Override
	public Integer getId() {
		return id;
	}
	/**
	 * remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * type
	 */
	public Integer getType() {
		return type;
	}
	/**
	 * name
	 */
	public Integer getName() {
		return name;
	}
	/**
	 * icon
	 */
	public String getIcon() {
		return icon;
	}
	/**
	 * desc
	 */
	public String getDesc() {
		return desc;
	}


	// --------------------------------------extra--begin


	// --------------------------------------extra--end

}