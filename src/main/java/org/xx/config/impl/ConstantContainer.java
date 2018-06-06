package org.xx.config.impl;
import java.util.*;

import com.google.common.collect.*;

import org.xx.config.core.Config;
import org.xx.config.core.ConfigContainer;

@Config("constant")
public class ConstantContainer extends ConfigContainer<String, ConstantConfig> {
	private List<ConstantConfig> list = ImmutableList.of();

	private Map<String, ConstantConfig> map = ImmutableMap.of();

	@Override
	public void init(List<ConstantConfig> list) {
		this.list = ImmutableList.copyOf(list);
		Map<String, ConstantConfig> map = new LinkedHashMap<>();
		for(ConstantConfig t:this.list) {
			map.put(t.getId(), t);
		}
		this.map = ImmutableMap.copyOf(map);
	}

	@Override
	public List<ConstantConfig>  getAll() {
		return list;
	}

	@Override
	public Map<String, ConstantConfig>  getMap() {
		return map;
	}

}