package org.xx.config.impl;

import com.alibaba.fastjson.*;

import org.xx.config.core.AbstractConfig;

public class LoginRewardConfig extends AbstractConfig<Integer> {
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
	 * next_id
	 */
	private Integer next_id = null;
	/**
	 * prize
	 */
	private String prize = null;
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
	 * next_id
	 */
	public Integer getNextId() {
		return next_id;
	}

	/**
	 * prize
	 */
	public String getPrize() {
		return prize;
	}



	// --------------------------------------extra--begin

	public JSONObject toJsonObj() {
		JSONObject obj = new JSONObject();
		obj.put("id", id);
		obj.put("remark", remark);
		obj.put("type", type);
		obj.put("next_id", next_id);
		obj.put("prize", prize);
		return obj;
	}


	// --------------------------------------extra--end

}