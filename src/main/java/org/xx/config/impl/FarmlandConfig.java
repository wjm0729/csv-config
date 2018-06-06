package org.xx.config.impl;

import com.alibaba.fastjson.*;

import org.xx.config.core.AbstractConfig;

public class FarmlandConfig extends AbstractConfig<Integer> {
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
	 * star
	 */
	private Integer star = null;
	/**
	 * maxlevel
	 */
	private Integer maxlevel = null;
	/**
	 * extra_level
	 */
	private Integer extra_level = null;
	/**
	 * icon
	 */
	private String icon = null;
	/**
	 * animation
	 */
	private String animation = null;
	/**
	 * produce_time
	 */
	private Integer produce_time = null;
	/**
	 * speed_or_produce_multiple
	 */
	private Integer speed_or_produce_multiple = null;
	/**
	 * speed_up_multiple
	 */
	private Integer speed_up_multiple = null;
	/**
	 * produce_multiple
	 */
	private Integer produce_multiple = null;
	/**
	 * multiple
	 */
	private String multiple = null;
	/**
	 * produce
	 */
	private String produce = null;
	/**
	 * store
	 */
	private Integer store = null;
	/**
	 * levelup_cost
	 */
	private String levelup_cost = null;
	/**
	 * levelup_exp
	 */
	private Integer levelup_exp = null;
	/**
	 * produce_special
	 */
	private String produce_special = null;
	/**
	 * unlock_villa_level
	 */
	private Integer unlock_villa_level = null;
	/**
	 * steal_cd_time
	 */
	private Integer steal_cd_time = null;
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
	 * star
	 */
	public Integer getStar() {
		return star;
	}

	/**
	 * maxlevel
	 */
	public Integer getMaxlevel() {
		return maxlevel;
	}

	/**
	 * extra_level
	 */
	public Integer getExtraLevel() {
		return extra_level;
	}

	/**
	 * icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * animation
	 */
	public String getAnimation() {
		return animation;
	}

	/**
	 * produce_time
	 */
	public Integer getProduceTime() {
		return produce_time;
	}

	/**
	 * speed_or_produce_multiple
	 */
	public Integer getSpeedOrProduceMultiple() {
		return speed_or_produce_multiple;
	}

	/**
	 * speed_up_multiple
	 */
	public Integer getSpeedUpMultiple() {
		return speed_up_multiple;
	}

	/**
	 * produce_multiple
	 */
	public Integer getProduceMultiple() {
		return produce_multiple;
	}

	/**
	 * multiple
	 */
	public String getMultiple() {
		return multiple;
	}

	/**
	 * produce
	 */
	public String getProduce() {
		return produce;
	}

	/**
	 * store
	 */
	public Integer getStore() {
		return store;
	}

	/**
	 * levelup_cost
	 */
	public String getLevelupCost() {
		return levelup_cost;
	}

	/**
	 * levelup_exp
	 */
	public Integer getLevelupExp() {
		return levelup_exp;
	}

	/**
	 * produce_special
	 */
	public String getProduceSpecial() {
		return produce_special;
	}

	/**
	 * unlock_villa_level
	 */
	public Integer getUnlockVillaLevel() {
		return unlock_villa_level;
	}

	/**
	 * steal_cd_time
	 */
	public Integer getStealCdTime() {
		return steal_cd_time;
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
		obj.put("star", star);
		obj.put("maxlevel", maxlevel);
		obj.put("extra_level", extra_level);
		obj.put("icon", icon);
		obj.put("animation", animation);
		obj.put("produce_time", produce_time);
		obj.put("speed_up_multiple", speed_up_multiple);
		obj.put("produce", produce);
		obj.put("store", store);
		obj.put("levelup_cost", levelup_cost);
		obj.put("levelup_exp", levelup_exp);
		obj.put("produce_special", produce_special);
		obj.put("unlock_villa_level", unlock_villa_level);
		obj.put("steal_cd_time", steal_cd_time);
		obj.put("share_prize", share_prize);
		return obj;
	}


	// --------------------------------------extra--end
}