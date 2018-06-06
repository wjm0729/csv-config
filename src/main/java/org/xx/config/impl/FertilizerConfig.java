package org.xx.config.impl;

import com.alibaba.fastjson.*;

import org.xx.config.core.AbstractConfig;

public class FertilizerConfig extends AbstractConfig<Integer> {
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
	 * farmland_type
	 */
	private Integer farmland_type = null;
	/**
	 * order
	 */
	private Integer order = null;
	/**
	 * last_id
	 */
	private Integer last_id = null;
	/**
	 * next_id
	 */
	private Integer next_id = null;
	/**
	 * icon
	 */
	private String icon = null;
	/**
	 * name
	 */
	private Integer name = null;
	/**
	 * desc
	 */
	private Integer desc = null;
	/**
	 * parm_show
	 */
	private Integer parm_show = null;
	/**
	 * parm
	 */
	private String parm = null;
	/**
	 * buy_cost_coin
	 */
	private String buy_cost_coin = null;
	/**
	 * unlock_villa_level
	 */
	private Integer unlock_villa_level = null;
	/**
	 * unlock_position_id
	 */
	private Integer unlock_position_id = null;
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
	 * farmland_type
	 */
	public Integer getFarmlandType() {
		return farmland_type;
	}

	/**
	 * order
	 */
	public Integer getOrder() {
		return order;
	}

	/**
	 * last_id
	 */
	public Integer getLastId() {
		return last_id;
	}

	/**
	 * next_id
	 */
	public Integer getNextId() {
		return next_id;
	}

	/**
	 * icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * name
	 */
	public Integer getName() {
		return name;
	}

	/**
	 * desc
	 */
	public Integer getDesc() {
		return desc;
	}

	/**
	 * parm_show
	 */
	public Integer getParmShow() {
		return parm_show;
	}

	/**
	 * parm
	 */
	public String getParm() {
		return parm;
	}

	/**
	 * buy_cost_coin
	 */
	public String getBuyCostCoin() {
		return buy_cost_coin;
	}

	/**
	 * unlock_villa_level
	 */
	public Integer getUnlockVillaLevel() {
		return unlock_villa_level;
	}

	/**
	 * unlock_position_id
	 */
	public Integer getUnlockPositionId() {
		return unlock_position_id;
	}



	// --------------------------------------extra--begin

	public JSONObject toJsonObj() {
		JSONObject obj = new JSONObject();
		obj.put("id", id);
		obj.put("remark", remark);
		obj.put("type", type);
		obj.put("farmland_type", farmland_type);
		obj.put("order", order);
		obj.put("last_id", last_id);
		obj.put("next_id", next_id);
		obj.put("icon", icon);
		obj.put("name", name);
		obj.put("desc", desc);
		obj.put("parm", parm);
		obj.put("buy_cost_coin", buy_cost_coin);
		obj.put("unlock_villa_level", unlock_villa_level);
		obj.put("unlock_position_id", unlock_position_id);
		return obj;
	}


	// --------------------------------------extra--end
}