package org.xx.config.impl;

import com.alibaba.fastjson.*;

import org.xx.config.core.AbstractConfig;

public class ScienceConfig extends AbstractConfig<Integer> {
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
	 * level
	 */
	private Integer level = null;
	/**
	 * pic1
	 */
	private String pic1 = null;
	/**
	 * desc
	 */
	private Integer desc = null;
	/**
	 * parm
	 */
	private Integer parm = null;
	/**
	 * next_level_parm
	 */
	private Integer next_level_parm = null;
	/**
	 * levelup_cost_chip
	 */
	private String levelup_cost_chip = null;
	/**
	 * levelup_cost_coin
	 */
	private Long levelup_cost_coin = null;
	/**
	 * levelup_exp
	 */
	private Integer levelup_exp = null;
	/**
	 * unlock_villa_level
	 */
	private Integer unlock_villa_level = null;
	/**
	 * share_prize
	 */
	private Integer share_prize = null;
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
	 * level
	 */
	public Integer getLevel() {
		return level;
	}

	/**
	 * pic1
	 */
	public String getPic1() {
		return pic1;
	}

	/**
	 * desc
	 */
	public Integer getDesc() {
		return desc;
	}

	/**
	 * parm
	 */
	public Integer getParm() {
		return parm;
	}

	/**
	 * next_level_parm
	 */
	public Integer getNextLevelParm() {
		return next_level_parm;
	}

	/**
	 * levelup_cost_chip
	 */
	public String getLevelupCostChip() {
		return levelup_cost_chip;
	}

	/**
	 * levelup_cost_coin
	 */
	public Long getLevelupCostCoin() {
		return levelup_cost_coin;
	}

	/**
	 * levelup_exp
	 */
	public Integer getLevelupExp() {
		return levelup_exp;
	}

	/**
	 * unlock_villa_level
	 */
	public Integer getUnlockVillaLevel() {
		return unlock_villa_level;
	}

	/**
	 * share_prize
	 */
	public Integer getSharePrize() {
		return share_prize;
	}



	// --------------------------------------extra--begin

	public JSONObject toJsonObj() {
		JSONObject obj = new JSONObject();
		obj.put("id", id);
		obj.put("remark", remark);
		obj.put("type", type);
		obj.put("level", level);
		obj.put("pic1", pic1);
		obj.put("desc", desc);
		obj.put("parm", parm);
		obj.put("next_level_parm", next_level_parm);
		obj.put("levelup_cost_chip", levelup_cost_chip);
		obj.put("levelup_cost_coin", levelup_cost_coin);
		obj.put("levelup_exp", levelup_exp);
		obj.put("unlock_villa_level", unlock_villa_level);
		obj.put("share_prize", share_prize);
		return obj;
	}


	// --------------------------------------extra--end

}