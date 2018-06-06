package org.xx.config.impl;
import java.util.*;

import com.google.common.collect.*;

import org.xx.config.core.Config;
import org.xx.config.core.ConfigContainer;

@Config("resource")
public class ResourceContainer extends ConfigContainer<Integer, ResourceConfig> {
	private List<ResourceConfig> list = ImmutableList.of();

	private Map<Integer, ResourceConfig> map = ImmutableMap.of();

	@Override
	public void init(List<ResourceConfig> list) {
		this.list = ImmutableList.copyOf(list);
		Map<Integer, ResourceConfig> map = new LinkedHashMap<>();
		for(ResourceConfig t:this.list) {
			map.put(t.getId(), t);
		}
		this.map = ImmutableMap.copyOf(map);
	}

	@Override
	public List<ResourceConfig>  getAll() {
		return list;
	}

	@Override
	public Map<Integer, ResourceConfig>  getMap() {
		return map;
	}

}