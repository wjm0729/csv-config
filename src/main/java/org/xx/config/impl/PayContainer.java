package org.xx.config.impl;
import java.util.*;

import com.google.common.collect.*;

import org.xx.config.core.Config;
import org.xx.config.core.ConfigContainer;

@Config("pay")
public class PayContainer extends ConfigContainer<Integer, PayConfig> {
	private List<PayConfig> list = ImmutableList.of();

	private Map<Integer, PayConfig> map = ImmutableMap.of();

	private Map<Integer, PayConfig> preMap = ImmutableMap.of();

	@Override
	public void init(List<PayConfig> list) {
		this.list = ImmutableList.copyOf(list);
		Map<Integer, PayConfig> map = new LinkedHashMap<>();
		Map<Integer, PayConfig> preMap = new HashMap<>();
		for(PayConfig t:this.list) {
			map.put(t.getId(), t);
			if(t.getNextId() > 0) {
				preMap.put(t.getNextId(), t);
			}
		}
		this.map = ImmutableMap.copyOf(map);
		this.preMap = ImmutableMap.copyOf(preMap);
	}

	public PayConfig getPre(int id) {
		return preMap.get(id);
	}

	@Override
	public List<PayConfig>  getAll() {
		return list;
	}

	@Override
	public Map<Integer, PayConfig>  getMap() {
		return map;
	}

}