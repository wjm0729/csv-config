package org.xx.config.impl;

import com.alibaba.fastjson.*;

import org.xx.config.core.AbstractConfig;

public class ExpConfig extends AbstractConfig<Integer> {
	/**
	 * id
	 */
	private Integer id = null;
	/**
	 * level
	 */
	private Integer level = null;
	/**
	 * need_exp
	 */
	private Integer need_exp = null;
	/**
	 * villa_pic1
	 */
	private String villa_pic1 = null;
	/**
	 * villa_animation
	 */
	private String villa_animation = null;
	/**
	 * prize
	 */
	private Integer prize = null;
	/**
	 * vitality_limit
	 */
	private Integer vitality_limit = null;
	/**
	 * stealcoin_parm
	 */
	private Integer stealcoin_parm = null;
	/**
	 * stealcoin_extra
	 */
	private Integer stealcoin_extra = null;
	/**
	 * stealcoin_limit
	 */
	private String stealcoin_limit = null;
	/**
	 * losscoin_parm
	 */
	private Integer losscoin_parm = null;
	/**
	 * losscoin_limit
	 */
	private String losscoin_limit = null;
	/**
	 * science_box
	 */
	private String science_box = null;
	/**
	 * share_prize
	 */
	private Integer share_prize = null;
	/**
	 * tap_coin
	 */
	private String tap_coin = null;
	/**
	 * id
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/**
	 * level
	 */
	public Integer getLevel() {
		return level;
	}

	/**
	 * need_exp
	 */
	public Integer getNeedExp() {
		return need_exp;
	}

	/**
	 * villa_pic1
	 */
	public String getVillaPic1() {
		return villa_pic1;
	}

	/**
	 * villa_animation
	 */
	public String getVillaAnimation() {
		return villa_animation;
	}

	/**
	 * prize
	 */
	public Integer getPrize() {
		return prize;
	}

	/**
	 * vitality_limit
	 */
	public Integer getVitalityLimit() {
		return vitality_limit;
	}

	/**
	 * stealcoin_parm
	 */
	public Integer getStealcoinParm() {
		return stealcoin_parm;
	}

	/**
	 * stealcoin_extra
	 */
	public Integer getStealcoinExtra() {
		return stealcoin_extra;
	}

	/**
	 * stealcoin_limit
	 */
	public String getStealcoinLimit() {
		return stealcoin_limit;
	}

	/**
	 * losscoin_parm
	 */
	public Integer getLosscoinParm() {
		return losscoin_parm;
	}

	/**
	 * losscoin_limit
	 */
	public String getLosscoinLimit() {
		return losscoin_limit;
	}

	/**
	 * science_box
	 */
	public String getScienceBox() {
		return science_box;
	}

	/**
	 * share_prize
	 */
	public Integer getSharePrize() {
		return share_prize;
	}

	/**
	 * tap_coin
	 */
	public String getTapCoin() {
		return tap_coin;
	}



	// --------------------------------------extra--begin

	public JSONObject toJsonObj() {
		JSONObject obj = new JSONObject();
		obj.put("id", id);
		obj.put("level", level);
		obj.put("need_exp", need_exp);
		obj.put("villa_pic1", villa_pic1);
		obj.put("villa_animation", villa_animation);
		obj.put("prize", prize);
		obj.put("vitality_limit", vitality_limit);
		obj.put("stealcoin_parm", stealcoin_parm);
		obj.put("stealcoin_extra", stealcoin_extra);
		obj.put("stealcoin_limit", stealcoin_limit);
		obj.put("losscoin_parm", losscoin_parm);
		obj.put("losscoin_limit", losscoin_limit);
		obj.put("science_box", science_box);
		obj.put("share_prize", share_prize);
		obj.put("tap_coin", tap_coin);
		return obj;
	}


	// --------------------------------------extra--end
}