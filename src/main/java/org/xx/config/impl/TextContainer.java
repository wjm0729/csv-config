package org.xx.config.impl;
import java.util.*;

import com.google.common.collect.*;

import org.xx.config.core.Config;
import org.xx.config.core.ConfigContainer;

@Config("text")
public class TextContainer extends ConfigContainer<Integer, TextConfig> {
	private List<TextConfig> list = ImmutableList.of();

	private Map<Integer, TextConfig> map = ImmutableMap.of();

	@Override
	public void init(List<TextConfig> list) {
		this.list = ImmutableList.copyOf(list);
		Map<Integer, TextConfig> map = new LinkedHashMap<>();
		for(TextConfig t:this.list) {
			map.put(t.getId(), t);
		}
		this.map = ImmutableMap.copyOf(map);
	}

	@Override
	public List<TextConfig>  getAll() {
		return list;
	}

	@Override
	public Map<Integer, TextConfig>  getMap() {
		return map;
	}

}