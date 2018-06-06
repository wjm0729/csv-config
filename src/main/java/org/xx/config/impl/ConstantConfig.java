package org.xx.config.impl;

import com.alibaba.fastjson.*;

import org.xx.config.core.AbstractConfig;

public class ConstantConfig extends AbstractConfig<String> {
	/**
	 * id
	 */
	private String id = null;
	/**
	 * remark
	 */
	private String remark = null;
	/**
	 * parm1
	 */
	private String parm1 = null;
	/**
	 * parm2
	 */
	private String parm2 = null;
	/**
	 * parm3
	 */
	private String parm3 = null;
	/**
	 * id
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * parm1
	 */
	public String getParm1() {
		return parm1;
	}

	/**
	 * parm2
	 */
	public String getParm2() {
		return parm2;
	}

	/**
	 * parm3
	 */
	public String getParm3() {
		return parm3;
	}



	// --------------------------------------extra--begin

	public JSONObject toJsonObj() {
		JSONObject obj = new JSONObject();
		obj.put("id", id);
		obj.put("remark", remark);
		obj.put("parm1", parm1);
		obj.put("parm2", parm2);
		obj.put("parm3", parm3);
		return obj;
	}


	// --------------------------------------extra--end
}