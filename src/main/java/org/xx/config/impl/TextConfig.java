package org.xx.config.impl;

import com.alibaba.fastjson.*;

import org.xx.config.core.AbstractConfig;

public class TextConfig extends AbstractConfig<Integer> {
	/**
	 * id
	 */
	private Integer id = null;
	/**
	 * remark
	 */
	private String remark = null;
	/**
	 * zh_cn
	 */
	private String zh_cn = null;
	/**
	 * zh_tw
	 */
	private String zh_tw = null;
	/**
	 * en
	 */
	private String en = null;
	/**
	 * ko
	 */
	private String ko = null;
	/**
	 * ja
	 */
	private String ja = null;
	/**
	 * ru
	 */
	private String ru = null;
	/**
	 * fr
	 */
	private String fr = null;
	/**
	 * es
	 */
	private String es = null;
	/**
	 * pt
	 */
	private String pt = null;
	/**
	 * de
	 */
	private String de = null;
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
	 * zh_cn
	 */
	public String getZhCn() {
		return zh_cn;
	}

	/**
	 * zh_tw
	 */
	public String getZhTw() {
		return zh_tw;
	}

	/**
	 * en
	 */
	public String getEn() {
		return en;
	}

	/**
	 * ko
	 */
	public String getKo() {
		return ko;
	}

	/**
	 * ja
	 */
	public String getJa() {
		return ja;
	}

	/**
	 * ru
	 */
	public String getRu() {
		return ru;
	}

	/**
	 * fr
	 */
	public String getFr() {
		return fr;
	}

	/**
	 * es
	 */
	public String getEs() {
		return es;
	}

	/**
	 * pt
	 */
	public String getPt() {
		return pt;
	}

	/**
	 * de
	 */
	public String getDe() {
		return de;
	}



	// --------------------------------------extra--begin

	public JSONObject toJsonObj() {
		JSONObject obj = new JSONObject();
		obj.put("id", id);
		obj.put("remark", remark);
		obj.put("zh_cn", zh_cn);
		obj.put("zh_tw", zh_tw);
		obj.put("en", en);
		obj.put("ko", ko);
		obj.put("ja", ja);
		obj.put("ru", ru);
		obj.put("fr", fr);
		obj.put("es", es);
		obj.put("pt", pt);
		obj.put("de", de);
		return obj;
	}


	// --------------------------------------extra--end
}