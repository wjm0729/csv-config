package org.xx.config.impl;
import java.util.*;

import com.google.common.collect.*;

import org.xx.config.core.Config;
import org.xx.config.core.ConfigContainer;

@Config("farmland")
public class FarmlandContainer extends ConfigContainer<Integer, FarmlandConfig> {
	private List<FarmlandConfig> list = ImmutableList.of();

	private Map<Integer, FarmlandConfig> map = ImmutableMap.of();

	@Override
	public void init(List<FarmlandConfig> list) {
		this.list = ImmutableList.copyOf(list);
		Map<Integer, FarmlandConfig> map = new LinkedHashMap<>();
		for(FarmlandConfig t:this.list) {
			map.put(t.getId(), t);
		}
		this.map = ImmutableMap.copyOf(map);
	}

	@Override
	public List<FarmlandConfig>  getAll() {
		return list;
	}

	@Override
	public Map<Integer, FarmlandConfig>  getMap() {
		return map;
	}

}