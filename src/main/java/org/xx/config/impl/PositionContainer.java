package org.xx.config.impl;
import java.util.*;

import com.google.common.collect.*;

import org.xx.config.core.Config;
import org.xx.config.core.ConfigContainer;

@Config("position")
public class PositionContainer extends ConfigContainer<Integer, PositionConfig> {
	private List<PositionConfig> list = ImmutableList.of();

	private Map<Integer, PositionConfig> map = ImmutableMap.of();

	@Override
	public void init(List<PositionConfig> list) {
		this.list = ImmutableList.copyOf(list);
		Map<Integer, PositionConfig> map = new LinkedHashMap<>();
		for(PositionConfig t:this.list) {
			map.put(t.getId(), t);
		}
		this.map = ImmutableMap.copyOf(map);
	}

	@Override
	public List<PositionConfig>  getAll() {
		return list;
	}

	@Override
	public Map<Integer, PositionConfig>  getMap() {
		return map;
	}

}