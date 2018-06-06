package org.xx.config.impl;
import java.util.*;

import com.google.common.collect.*;

import org.xx.config.core.Config;
import org.xx.config.core.ConfigContainer;

@Config("science")
public class ScienceContainer extends ConfigContainer<Integer, ScienceConfig> {
	private List<ScienceConfig> list = ImmutableList.of();

	private Map<Integer, ScienceConfig> map = ImmutableMap.of();

	@Override
	public void init(List<ScienceConfig> list) {
		this.list = ImmutableList.copyOf(list);
		Map<Integer, ScienceConfig> map = new LinkedHashMap<>();
		for(ScienceConfig t:this.list) {
			map.put(t.getId(), t);
		}
		this.map = ImmutableMap.copyOf(map);
	}

	@Override
	public List<ScienceConfig>  getAll() {
		return list;
	}

	@Override
	public Map<Integer, ScienceConfig>  getMap() {
		return map;
	}

}