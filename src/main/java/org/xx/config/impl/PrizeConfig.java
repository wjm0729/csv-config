package org.xx.config.impl;

import com.google.common.collect.*;
import org.xx.config.core.AbstractConfig;
import org.xx.config.core.util.Tuple3;

public class PrizeConfig extends AbstractConfig<Integer> {
	/**
	 * id
	 */
	private Integer id = null;
	/**
	 * remark
	 */
	private String remark = null;
	/**
	 * name
	 */
	private String name = null;
	/**
	 * icon
	 */
	private String icon = null;
	/**
	 * random_num
	 */
	private Integer random_num = null;
	/**
	 * repeat
	 */
	private Integer repeat = null;
	/**
	 * goods
	 */
	private ImmutableList<Tuple3<Integer,Integer,Integer>> goods = null;
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
	 * name
	 */
	public String getName() {
		return name;
	}
	/**
	 * icon
	 */
	public String getIcon() {
		return icon;
	}
	/**
	 * random_num
	 */
	public Integer getRandomNum() {
		return random_num;
	}
	/**
	 * repeat
	 */
	public Integer getRepeat() {
		return repeat;
	}
	/**
	 * goods
	 */
	public ImmutableList<Tuple3<Integer,Integer,Integer>> getGoods() {
		return goods;
	}


	// --------------------------------------extra--begin


	// --------------------------------------extra--end
}