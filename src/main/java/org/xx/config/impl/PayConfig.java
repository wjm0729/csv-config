package org.xx.config.impl;

import com.alibaba.fastjson.JSONObject;
import org.xx.config.core.AbstractConfig;
import org.xx.config.core.util.DateUtils;
import org.xx.config.core.util.SplitUtil;

import java.util.Date;

public class PayConfig extends AbstractConfig<Integer> {
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
	 * prizeid
	 */
	private Integer prizeid = null;
	/**
	 * available_time
	 */
	private String available_time = null;
	/**
	 * unavailable_time
	 */
	private String unavailable_time = null;
	/**
	 * purchase_limit_num
	 */
	private Integer purchase_limit_num = null;
	/**
	 * discount
	 */
	private Integer discount = null;
	/**
	 * fake_price_cn
	 */
	private Float fake_price_cn = null;
	/**
	 * price_cn
	 */
	private Float price_cn = null;
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
	 * prizeid
	 */
	public Integer getPrizeid() {
		return prizeid;
	}

	/**
	 * available_time
	 */
	public String getAvailableTime() {
		return available_time;
	}

	/**
	 * unavailable_time
	 */
	public String getUnavailableTime() {
		return unavailable_time;
	}

	/**
	 * purchase_limit_num
	 */
	public Integer getPurchaseLimitNum() {
		return purchase_limit_num;
	}

	/**
	 * discount
	 */
	public Integer getDiscount() {
		return discount;
	}

	/**
	 * fake_price_cn
	 */
	public Float getFakePriceCn() {
		return fake_price_cn;
	}

	/**
	 * price_cn
	 */
	public Float getPriceCn() {
		return price_cn;
	}



	// --------------------------------------extra--begin
	// 首冲礼包
	public static final int FIRST_CHARGE_TYPE = 1;
	// 今日特惠
	public static final int JINRI_REHUI_TYPE = 2;

	public JSONObject toJsonObj() {
		Date start = getStart();
		Date end = getEnd();

		JSONObject obj = new JSONObject();
		obj.put("id", id);
		obj.put("remark", remark);
		obj.put("type", type);
		obj.put("prizeid", prizeid);
		obj.put("start", start != null ? start.getTime() : -1);
		obj.put("end", end != null ? end.getTime() : -1);
		obj.put("limit_num", purchase_limit_num);
		obj.put("discount", discount);
		obj.put("fake_price_cn", fake_price_cn);
		obj.put("price_cn", price_cn);
		return obj;
	}

	public Date getStart() {
		Date start = null;
		if(available_time.indexOf(":") > -1) {
			Integer[] starts = SplitUtil.splitToInt(available_time,":");
			start = DateUtils.getDate(starts[0], starts[1]);
		}
		return start;
	}

	public Date getEnd() {
		Date end = null;
		if(unavailable_time.indexOf(":") > -1) {
			Integer[] starts = SplitUtil.splitToInt(unavailable_time,":");
			end = DateUtils.getDate(starts[0], starts[1]);
		}
		return end;
	}

	public boolean inTime() {
		long currMillis = System.currentTimeMillis();
		Date start = getStart();
		Date end = getEnd();
		if(start != null) {
			if(start.getTime() > currMillis) {
				return false;
			}
		}
		if(end != null) {
			if(end.getTime() < currMillis) {
				return false;
			}
		}
		return true;
	}

	public boolean inTime(long currMillis) {
		Date start = getStart();
		Date end = getEnd();
		if(start != null) {
			if(start.getTime() > currMillis) {
				return false;
			}
		}
		if(end != null) {
			if(end.getTime() < currMillis) {
				return false;
			}
		}
		return true;
	}

	// --------------------------------------extra--end
}