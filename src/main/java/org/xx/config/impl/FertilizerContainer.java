package org.xx.config.impl;
import java.util.*;

import com.google.common.collect.*;

import org.xx.config.core.Config;
import org.xx.config.core.ConfigContainer;

@Config("fertilizer")
public class FertilizerContainer extends ConfigContainer<Integer, FertilizerConfig> {
	private List<FertilizerConfig> list = ImmutableList.of();

	private Map<Integer, FertilizerConfig> map = ImmutableMap.of();

	@Override
	public void init(List<FertilizerConfig> list) {
		this.list = ImmutableList.copyOf(list);
		Map<Integer, FertilizerConfig> map = new LinkedHashMap<>();
		for(FertilizerConfig t:this.list) {
			map.put(t.getId(), t);
		}
		this.map = ImmutableMap.copyOf(map);
	}

	@Override
	public List<FertilizerConfig>  getAll() {
		return list;
	}

	@Override
	public Map<Integer, FertilizerConfig>  getMap() {
		return map;
	}

}